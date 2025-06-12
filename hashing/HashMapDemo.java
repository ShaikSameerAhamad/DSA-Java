import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //Adding elements to map
        map.put("Sameer",20);
        map.put("Soban",21);
        map.put("Sai",18);
        map.put("Shyam",22);
        //Retriving elements from map
        System.out.println(map.get("Sameer"));
        System.out.println(map.get("Sai"));
        //remove elements
        map.remove("Sai");
        //Check if key exists
        if(map.containsKey("Sai")){
            System.out.println("Sai is present in the map");
        } else {
            System.out.println("Sai is not present in the map");
        }
        //Check if value exists
        if(map.containsValue(20)){
            System.out.println("20 is present in the map");
        } else {
            System.out.println("20 is not present in the map");
        }
        //Iterating through the map
        System.out.println("Iterating through the map:");
        for(String str:map.keySet()){
            System.out.println(str+" "+map.get(str));
        }        

    }
}
