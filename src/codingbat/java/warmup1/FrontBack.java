package codingbat.java.warmup1;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code")); //"eodc"
        System.out.println("ab"); //"ba"
        System.out.println("ca"); //"ac"
        System.out.println(frontBack("a")); //"a"
        System.out.println(frontBack("")); //""
    }

    public static String frontBack (String text) {

        if(text.length() <= 1){
            return text;
        }

        return text.charAt(text.length()-1) + text.substring(1, text.length() - 1) + text.charAt(0);
    }
}