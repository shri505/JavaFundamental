package CollectinPrograms.com;

import java.util.HashSet;


public class Set {
    public static void main(String[] args) {
        java.util.Set<String> set = new HashSet<>();
        set.add("xyz");
        set.add("abc");
        set.add("asd");
        set.add("sdf");


        for (String name : set) {
            System.out.println(name);

        }
    }
}

