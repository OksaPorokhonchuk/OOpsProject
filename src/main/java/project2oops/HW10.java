package project2oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HW10 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");

        HashSet<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println( list);

    }
}
