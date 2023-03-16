package com.company.udhaya;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {

    /* <---------------------------Entry (Interface)--------------------->:
     Collection, List, Set, Comparable, Comparator,
     Map, NavigableSet, SortedSet, NavigableMap,
     SortedMap, Entry */

    /* <-----------------MAP-------------->
               => Key is Unique
              => Value can contain
                 duplicates
            => Key, Value ->Entry
            ==> Entry- Unique
            Collection View of Map
            ->Set keySet()
            -> Collection values()
            -> Set entrySet0*/

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");
        hm.put(5,"five");
        System.out.println(hm);

        /*7. Write a Java program to test if a map contains a mapping for the specified key. */

        System.out.println("contains a mapping for the specified key "+hm.containsKey(1));


        /*6. Write a Java program to get a shallow copy of a HashMap instance
        HashMap<Integer,String> hm2=new HashMap<Integer,String>();
        System.out.println("before clone "+hm);
       hm2= (HashMap)hm.clone();
        System.out.println("after clone"+hm2);
         */

        /*5. Write a Java program to check whether a map contains key-value mappings (empty) or not
        System.out.println("before checking map "+hm);
        hm.isEmpty();
        hm.clear();
        System.out.println("after checking map "+hm);

         */

       /*4. Write a Java program to remove all of the mappings from a map*
        System.out.println("before removing map "+hm);
        hm.clear();
        System.out.println("after removing all map values "+hm);

        */

        /*3. Write a Java program to copy all of the mappings from the specified map to another map
        HashMap <Integer,String>hm1=new HashMap<Integer,String>();
        hm.putAll(hm1);
        System.out.println(" copy all of the mappings from the specified map to another map "+hm.entrySet());

         */


       /* //1.Write a Java program to associate the specified value with the specified key in a HashMap.
        for (Map.Entry v: hm.entrySet()) {
            System.out.println(v.getKey()+"\t"+v.getValue());
        }*/

        /*2. Write a Java program to count the number of key-value (size) mappings in a map

        System.out.println("number of key-value (size) mapping ="+hm.size());

         */
    }
}
