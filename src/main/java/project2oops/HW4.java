package project2oops;

public class HW4 {

    public static boolean palindrome(String str) {
        String str1=str.toLowerCase();
        int length=str1.length();
        for(int i=0; i<length/2; i++) {
            if(str1.charAt(i)!=str1.charAt(length-1-i)) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="Oksana";
        if(palindrome(str)) {
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }
    }
}
