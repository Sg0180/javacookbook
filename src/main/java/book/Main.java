package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        /*
        List, Set, Map, Queue  -- four data structures
        Sequences  -- List, Set
            - List : preserves order, allows duplicates
        Map - Key, value

        List - Arraylist, Linkedlist, vector
        Set  - Hashset, Tree set
        ,

        Collections  Queue, List, Set,
        MAp
        */

        List<String> myList = new ArrayList<>();
        // var myList =  new ArrayList<String>();
        myList.add("Hello");
        myList.add("World");
        myList.add("of");
        myList.add("Java");
        System.out.println(myList);
        // to array
        System.out.println(Arrays.toString(myList.toArray()));
        // arrays to list
        //List<String> firstname =  List.of("Robin", "Bruce","Ted");
        List <String> firstname  =  Arrays.asList("abc","def");
        var blist  = List.of("abc", "def","ghsi");
        System.out.println(blist);



    }
}
