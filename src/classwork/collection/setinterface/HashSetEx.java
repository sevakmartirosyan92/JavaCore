package classwork.collection.setinterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Poxos");
        set.add("Petros");
        set.add("Martiros");
        set.add("Gevor");
        set.add("Gevor");
      //  System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println(set.contains("Poxos"));
    }
}
