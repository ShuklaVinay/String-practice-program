//parseInt method of Integer class & toString method of String class
public class String3 {
    public static void main(String[] args) {
        //parseInt method of Integer class
        String str="12345";
        int number=Integer.parseInt(str);
        System.out.println(number);
        //toString method of String class
        int num=123456;
        String str1=Integer.toString(num);
        System.out.println(str1);
        System.out.println("length of the str1:"+" "+str1.length());
    }
}
