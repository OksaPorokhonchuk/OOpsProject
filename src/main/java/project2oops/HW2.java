package project2oops;

public class HW2 {

    public static int countAlphaCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int result=countAlphaCharacters("Mother");
        System.out.println(result);


    }
}


