//simple string program taking string input by user
import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        String name,address;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        name=sc.nextLine();
        System.out.println("enter your address:");
        address=sc.nextLine();
        System.out.println("Name :"+" "+name+" "+" and "+" "+"Address:"+" "+address);
    }
}
