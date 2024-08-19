package Hashing;
import java.util.*;
public class Hashing_Basic {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("1",20);
        hm.put("2",30);
        hm.put("3",40);
        hm.put("4",20);
        hm.put("5",20);
        hm.put("6",20);

        System.out.println(hm);

        hm.put("1", 60);
        System.out.println(hm);

        if(hm.containsKey("3")) System.out.println("contains");
        else System.out.println("not contains");

        System.out.println(hm.get("1")+" "+hm.get("2"));

        //for loop for hashmap

        for(Map.Entry<String,Integer> e:hm.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
            System.out.println(e.getClass());
        }

        //collection of keys

        Set<String> keys=hm.keySet();
        for(String key:keys)
        {
            System.out.println(key+" "+hm.get(key));
        }

        hm.remove("1");
        System.out.println(hm+" "+hm.size());
    }
}
