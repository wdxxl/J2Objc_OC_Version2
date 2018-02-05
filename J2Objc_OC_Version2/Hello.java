import java.util.HashMap;
import java.util.Map;

public class Hello {
    public static void mark() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("1", "Hello World demo of Java 2 Objective C.");
        System.out.println(myMap.get("1"));
    }
}
