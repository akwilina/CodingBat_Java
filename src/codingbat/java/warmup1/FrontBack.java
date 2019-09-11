package codingbat.java.warmup1;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code")); //"eodc"
        System.out.println(frontBack("ab")); //"ba"
        System.out.println(frontBack("ca")); //"ac"
        System.out.println(frontBack("a")); //"a"
        System.out.println(frontBack("")); //""
    }

    public static String frontBack (String text) {

        if(text.length() <= 1){
            return text;
        }

        return text.charAt(text.length()-1) + text.substring(1, text.length() - 1) + text.charAt(0);
    }

    public static String frontBack2 (String text) {
        if (text == null || text.isEmpty() || text.length() == 1) {
            return text;
        }
        else if (text.length() == 2) {
            return text.charAt(1) + "" + text.charAt(0);
        }
        else {
            return text.charAt(text.length() - 1) + text.substring(1, text.length() - 1) + text.charAt(0);
        }
    }
}