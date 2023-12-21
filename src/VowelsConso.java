//count vowels & consonant in String

import java.util.Scanner;
public class VowelsConso {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string");
        str=sc.nextLine();
        int vCount=0;
        int cCount=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vCount++;
            }
            else if(ch>='a' && ch<='z')
            {
                cCount++;
            }
        }
        System.out.println("number of vowels in string="+" "+vCount);
        System.out.println("number of consonant in String="+" "+cCount);

    }
}
