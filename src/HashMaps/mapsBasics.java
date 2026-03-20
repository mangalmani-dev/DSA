package HashMaps;

import java.util.HashMap;

public class mapsBasics {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Mangalmani",23);
        map.put("Pawan",29);
        map.put("Shivam",27);
        map.put("Raunak",19);
        map.put("Abhishek",30);
        System.out.println(map);
        System.out.println(map.get("Pawan"));
        System.out.println(map.entrySet());


    }
}
