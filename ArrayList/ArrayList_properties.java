package Java.ArrayList;
import java.util.*;
public class ArrayList_properties {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "-> " + list.size());

        // add element
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + "-> " + list.size());

        // add at any particular index
        list.add(1,1000);
        System.out.println(list + "-> " + list.size());

        // to get element
        // we can't use list[1] like we did in array
        int val = list.get(1);
        System.out.println(val);

        // to set element
        // we can't use list[1]=2000 like we did in array
        list.set(1,2000);
        System.out.println(list + "-> " + list.size());

        // to remove element
        list.remove(1);
        System.out.println(list + "-> " + list.size());

        // ArrayList of String
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("Cello");
        l2.add("Ayush");
        System.out.println(l2+ "-> " + l2.size());

        //for loop
        System.out.println("Print with for loop: ");
        for(int i=0;i<list.size();i++){
            int val1 = list.get(i);
            System.out.println(val1);
        }

        //for each loop
        System.out.println("Print with for each loop: ");
        for(String val2 : l2){
            System.out.println(val2);
        }

        //Direct print
        System.out.println(list);
    }
}
