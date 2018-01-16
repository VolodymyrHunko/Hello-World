package examples;

import java.util.HashSet;
import java.util.TreeSet;

public class hashSet_TreeSet_Output {

    public static void main(String[] args) {
        foo();
    }

    private static void foo() {
        // HashSet declaration
        HashSet<String> hset =  new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        System.out.println("Displaying HashSet elements");
        for(String hs : hset)
            System.out.println(hs);

        System.out.println("\nconvert to the TreeSet");
        TreeSet <String> tree = new TreeSet<String>();
        for(String i : hset) {
            if(i!=null)
                tree.add(i);
        }
        for(String ts : tree)
            System.out.println(ts);
    }

}
