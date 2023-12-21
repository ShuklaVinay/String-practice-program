//perform multiple function on String  program
public class String2 {
    public static void main(String[] args) {
        String fName="vinay";
        String lName="shukla";
        String fullName;
        //String concatenation
        fullName=fName+" "+lName;
        System.out.println("After concatenation Fullname :"+" "+fullName);

        //length of the String
        int len=fullName.length();
        System.out.println("length of the String is :"+" "+len);
        //accessing character from String
        System.out.println("Accessing each character from String:");
        for(int i=0;i<fullName.length();i++)
        {
            System.out.println(fullName.charAt(i));
        }
          //upperCase & lowerCase
        System.out.println("in uppercase letter:"+" "+fullName.toUpperCase());
        System.out.println("in lowercase letter:"+" "+fullName.toLowerCase());
        //comparing two string
        String str1="vinay";
        String str2="amit";
        if (str1.equals(str2))
        {
            System.out.println("both Strings are the same.");
        }
        else
        {
            System.out.println("both Strings are different ");
        }
        //to find sub String from string
        System.out.println(fullName.substring(0,5));
    }
}
