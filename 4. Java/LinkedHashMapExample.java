import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("Sachin", 21);
        lhm.put("Pradeep", 20);
        lhm.put("Arun", 20);

        for(Map.Entry<String, Integer> entry : lhm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    
}
