import java.util.HashMap;
import java.util.Map;

public class PhoneList {
static HashMap<String, String> hm = new HashMap<>();
public static void add(String surename, String phone){
    hm.put(phone,surename);
}
public static void get(String surename){
    for (Map.Entry<String, String> o : hm.entrySet()) {
        if (o.getValue().equals(surename)){
        System.out.println(o.getValue() + ": " + o.getKey());}
    }
}
}
