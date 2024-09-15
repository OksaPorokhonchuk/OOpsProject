package project2oops;

public class HW7 {
    public static int number (String str) {
        str=str.trim();
        if(str.isEmpty()) {
            return 0;
        }
        String[]words=str.split("[\\s.,!?;:\"()\\[\\]{}]+");
        return words.length;
    }


    public static void main(String[] args) {
        String str ="I don't like Java";
        int result=number(str);
        System.out.println(result);
    }
}
