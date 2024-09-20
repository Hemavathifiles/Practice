package Map;

import java.util.Map;
import java.util.HashMap;


public class HashmapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 1. Adding key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // 2. Display the map
        System.out.println("Initial Map: " + map);

        // 3. Retrieving a value by key
        Integer appleValue = map.get("Apple");
        System.out.println("Value for key 'Apple': " + appleValue);

        // 4. Updating a value (replacing the existing value)
        map.put("Banana", 5);
        System.out.println("Map after updating value for 'Banana': " + map);

        // 5. Removing an entry by key
        map.remove("Cherry");
        System.out.println("Map after removing 'Cherry': " + map);

        // 6. Checking if a key exists
        boolean hasApple = map.containsKey("Apple");
        System.out.println("Map contains key 'Apple': " + hasApple);

        // 7. Checking if a value exists
        boolean hasValue5 = map.containsValue(5);
        System.out.println("Map contains value 5: " + hasValue5);

 
        // 8. Iterating over keys and values
        System.out.println("Iterating over keys and values:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 9. Getting the size of the map
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // 10. Clearing all entries in the map
        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}
