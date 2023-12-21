//various types of the method perform on the String....
public class StringMethods {
    public static void main(String[] args) {
        String name="VinayShuklaIshani";
        System.out.println(name);
        //length of the string
        int val=name.length();
        System.out.println("length of the String is :"+" "+val);
        //toLowerCase() method
        //System.out.println("convert in lower case :"+name.toLowerCase());
        //toUpperCase() method
        //System.out.println("convert in upper case :"+name.toUpperCase());
        //use trim() method
        //String str="          Ishani               ";
        //System.out.println(str.trim());
        //subString(begin index no.) method
        //String str1=name.substring(5);
        //System.out.println("subString is:"+str1);
        //subString(strindex,endindex)
        //String str2=name.substring(11,17);
        //System.out.println("substring2:"+str2);
        //relpace() method - replce one char
        //System.out.println(name.replace('V','B'));
        //replace() method use for replce the string
        //System.out.println(name.replace("Vinay","shukla"));
        //startsWith() method & endsWith() method
       // System.out.println(name.startsWith("Vin"));
        //System.out.println(name.endsWith("ne"));
        //charAt() method
        //System.out.println(name.charAt(5));
        //get all the char from string
        /*for(int i=0;i<name.length();i++)
        {
            System.out.println(name.charAt(i));
        }*/
        //indexOf() method to return the index no.
        //System.out.println(name.indexOf("I"));
        //System.out.println(name.indexOf("ni",6));
        //lastIndexOf() method
        //System.out.println(name.lastIndexOf('a'));
        //System.out.println(name.lastIndexOf("a",10));
        //equals() method
        String str3="VinaY";
        String str4="viNay";
        System.out.println(str3.equals(str4));
        //equalsIgnoreCase() method
        System.out.println(str3.equalsIgnoreCase(str4));
        //concate
        String str5="Ishani";
        String str6="Shukla";
        System.out.println(str5+str6);

    }
}
