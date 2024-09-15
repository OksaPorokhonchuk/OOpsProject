package project2oops;

public class HW6 {
    public static int vowelsNumber(String str) {
        int count=0;
        for(int i=0; i<str.length();i++) {
            char ch=str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u' ||ch=='y') {
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {

        String str="documentation";
        int result=vowelsNumber(str);
        System.out.println(result);
    }



}
