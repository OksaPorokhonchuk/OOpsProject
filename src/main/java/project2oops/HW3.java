package project2oops;

public class HW3 {

    public static String reversedString(String str) {

        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
       String str1="Cat";
       String str2=reversedString(str1);
        System.out.println(str2);


    }

}
