package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class hashMapOutput {

    public static void main(String[] args) {
        foo();
    }

    private static void foo() {
        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        System.out.println("Display content using Iterator:");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        System.out.println("\nGet values based on key:");
        String var= hmap.get(2);
        System.out.println("Value at index 2 is: "+var);

        /* Remove values based on key*/
        hmap.remove(3);

        System.out.println("\nMap key and values after removal by using entrySet:");
        for(Entry<Integer,String> entry : hmap.entrySet() ) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }


}
