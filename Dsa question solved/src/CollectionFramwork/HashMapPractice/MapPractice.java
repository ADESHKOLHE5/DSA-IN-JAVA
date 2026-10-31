package CollectionFramwork.HashMapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        Map <String, String> mapping = new HashMap<>();
       //insertion
        mapping.put("in", "India");
       // replace the value of previous key to in is Bharat
        // mapping.put("in", "Bharat");
        mapping.put("en", "England");
        mapping.put("us","United States");
        mapping.put("fr","France");
        System.out.println(mapping);

        Map<String,String> table = new HashMap<>();
        table.put("br","Brazil");
        System.out.println("Before: "+ table);
        table.putAll(mapping);
        System.out.println("After: "+ table);

        //remove element
        table.remove("en");
        System.out.println("AfterRemove: "+ table);

        //putIfAbsent is used to if already entry present with that key so
        // it cant enter that value if not then enter
        table.putIfAbsent("fr","France"); //ignored
        table.putIfAbsent("uk","Ukraine"); //accepted
        System.out.println("AfterPutIfAbsent: "+ table);

        //value get by key
        System.out.println(table.get("fr"));

        //if given key not present this method give you default value you set
        System.out.println(table.getOrDefault("pak","Pakistan"));

        table.containsKey("in"); //true
        table.containsValue("India"); //true
       // table.replace("in","Indonesia");

        //get all the keys
        Set<String> keys = table.keySet();
        System.out.println(keys);

        //get all the values
        Collection<String> val = table.values();
        System.out.println(val);

        //to show the set of all key value pair
        Set<Map.Entry<String, String>> entries = table.entrySet();
        System.out.println("Printing entries: "+entries);

         System.out.println();
    }
}
