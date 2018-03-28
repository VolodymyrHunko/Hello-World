package examples;

import java.util.*;
public class LinkedListExample {
    public static void main(String args[]) {

        /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<String>();
        ArrayList<String> arrayList = new ArrayList<String>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        arrayList.add("Item1");
        arrayList.add("Item5");
        arrayList.add("Item3");
        arrayList.add("Item6");
        arrayList.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);
        System.out.println("Array List Content: " +arrayList);

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " +linkedlist);

        //arrayList.addFirst("First Item");
        //arrayList.addLast("Last Item");
        System.out.println("Array List Content cannot be changed by add 'First' 'Last': " +arrayList);

        /*This is how to get and set Values*/
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstvar2);

        Object firstval = arrayList.get(0);
        System.out.println("First element: " +firstval);
        arrayList.set(0, "Changed first item");
        Object firstval2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstval2);

        /*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

        /* Add to a Position and remove from a position*/
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist);

        arrayList.add(0, "Newly added item");
        arrayList.remove(2);
        System.out.println("Final Content: " +arrayList);
    }
}