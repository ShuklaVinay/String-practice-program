//Input a string from the user. Create a new string called ‘result’ in which
// you will replace the letter ‘e’ in the original string with letter ‘i’.
import java.util.Scanner;
public class RepalceChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string ");
        String str=sc.nextLine();
        //String str1=str.replace('i','e');
        //System.out.println("String after replace the char i with e:"+" "+str1);
        //other types
        String result=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='e')
            {
                result +='i';
            }
            else
            {
                result +=str.charAt(i);
            }
        }
        System.out.println("string after replace the char :"+" "+result);
    }
}
