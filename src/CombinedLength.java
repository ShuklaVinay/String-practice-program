/*Take an array of Strings input from
the user & find the cumulative (combined) length of all those strings.*/
 import java.util.Scanner;
 public class CombinedLength {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int size;
         System.out.println("enter the size of an array");
         size=sc.nextInt();
         String[] array=new String[size];
         int totalLen=0;
         for(int i=0;i<size;i++)
         {
             array[i]=sc.next();
             totalLen +=array[i].length();
         }

         System.out.println(totalLen);

     }
}
