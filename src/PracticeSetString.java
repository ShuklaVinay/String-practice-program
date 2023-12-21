//String Practice set CWH

public class PracticeSetString {
    public static void main(String[] args) {
        //problem 1
        String name="Vinay Shukla";
        String name1=name.toLowerCase();
        System.out.println(name1);

        //problem 2
        String str="My NAme Is Vinay Shukla";
        String str1=str.replace(" ","_");
        System.out.println(str1);

        //problem 3
        String letter="Dear <|name|>, thanks a lot.";
        String letter1=letter.replace("<|name|>","Vinay");
        System.out.println(letter1);

        //problem 4
        String str2="My name vinay      shukla";
        System.out.println(str2.indexOf("   "));
        System.out.println(str2.indexOf("       "));

        //problem 5
        String letter2="Dear vinay, this java course is nice . Thanks!";
        System.out.println("Dear vinay,\n\t This java course is nice .\n\t Thanks!");
    }
}
