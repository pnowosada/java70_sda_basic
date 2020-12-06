package collection_training;

import java.util.HashSet;
import java.util.Set;

public class SetTraining {
    public static void trainSet (){
        String name1= "Basia";
        String name2= "Kasia";
        String name3= "Asia";
        Set<String> uniquenames= new HashSet<>();
        uniquenames.add(name1);
        uniquenames.add(name2);
        uniquenames.add(name3);
        System.out.println(uniquenames.size());
        uniquenames.add(name1);
        System.out.println(uniquenames.size());

    }
}
