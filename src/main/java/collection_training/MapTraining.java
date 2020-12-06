package collection_training;

import java.util.HashMap;
import java.util.Map;

public class MapTraining {
    public static void mapTraining(){
        String name1="Gosia";
        String name2="Asia";
        String name3="Kasia";
        Map<Integer,String> names= new HashMap<>();
        names.put(1,name1);
        names.put(2,name2);
        names.put(3,name3);
        printMap(names);
        System.out.println(names.size());
        names.put(1,name2);
        printMap(names);
        System.out.println(names.size());

    }
    public static void printMap(Map<Integer,String> mapNames){
        for(Map.Entry<Integer,String> entry : mapNames.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}
