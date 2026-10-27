package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PracticeCollections {
    public static void main(String[] args) {
        List <Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        //remove the element using index number
        list.remove(0);
        System.out.println(list);//[20,30]

        List <Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(201);

        //add the list to the list1
        list.addAll(list2);
        System.out.println(list); //[20,30,101,201]

        //remove all list 2 from 1
        list.removeAll(list2);
        System.out.println(list);

        //check the size of list
        System.out.println(list.size()); //2

        //to get value from particular index
        System.out.println(list.get(0));

        //if available the value then true otherwise flase
        System.out.println(list.contains(30));

        //set the value to existing index
        list2.set(0,30);
        System.out.println(list2); //[30,201]



        //confused revised later
        Iterator <Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element : "+ iterator.next());
        }

        //convert into array
        Object [] arr = list.toArray();
        for(Object obj:arr){
            System.out.println("Object : "+ obj);
        }

        List <Integer> list3 = new ArrayList<>();
        list3.add(95);
        list3.add(71);
        list3.add(99);
        list3.add(44);
        System.out.println("working with list 3");
        System.out.println(list3);

        //sort a list3
        Collections.sort(list3);
        System.out.println("Sorted : "+ list3);

    }
}
