package HashMaps;

import java.util.HashMap;

public class iterateHashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Mangalmani",23);
        map.put("Pawan",29);
        map.put("Shivam",27);
        map.put("Raunak",19);
        map.put("Abhishek",30);
         for (String key :map.keySet()){
             int val = map.get(key);
             System.out.println(key+" "+ val);
         }

         for (int val : map.values()){
             System.out.println(val);
         }
        System.out.println();

         for (Object pairs : map.entrySet()){
             System.out.println(pairs);
         }
    }
}
