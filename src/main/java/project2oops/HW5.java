package project2oops;

import java.util.Arrays;
import java.util.HashMap;

public class HW5 {
    public static boolean anagrams(String str1, String str2) {
        str1.toLowerCase();
        str1.toLowerCase();

        if(str1.length()!=str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);


    }

    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        if(anagrams(str1,str2)) {
            System.out.println(str1+" and "+str2+" are anagrams");
        }else {
            System.out.println(str1+" and "+str2+" are not anagrams");
        }
    }

}
