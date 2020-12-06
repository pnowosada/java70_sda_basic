package collection_training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTraning {
    public static void trainList(){
        String name1="WWW";
        String name2="bbbb";
        String name3="aaaa";
        String name4="zzzz";

        List<String> names= new LinkedList<>();
//        List<String> names= new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        System.out.println(names.size());
        names.add(name1);
        System.out.println(names.size());

    }
}
