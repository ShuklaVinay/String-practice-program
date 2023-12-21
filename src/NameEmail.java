/* Input an email from the user. You have to
create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
 Example :
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
email = “helloWorld123@gmail.com”; username = “helloWorld123”*/

import java.util.Scanner;
public class NameEmail {
    public static void main(String[] args) {
        String email;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter email:");
        email=sc.nextLine();
        String name="";
        for(int i=0;i<email.length();i++)
        {
            if(email.charAt(i)=='@')
            {
                break;
            }
            else
            {
                name +=email.charAt(i);
            }
        }
        System.out.println("user name:"+ name);
    }
}
