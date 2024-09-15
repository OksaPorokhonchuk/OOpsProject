package project2oops;

import java.util.ArrayList;
import java.util.List;

public class HW8 {
    public static List<String> list (List<String>inputList) {
        List<String>resultList=new ArrayList<>();
        for(String str:inputList){
            if(str!=null &&(str.startsWith("A")|| str.startsWith("a"))) {
                resultList.add(str.toLowerCase());
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Adam");
        strings.add("Ivan");
        strings.add("Alex");
        strings.add("almond");

        List<String>list1=list(strings);
        System.out.println(list1);
    }


}
