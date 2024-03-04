package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheManagement {

    private static LinkedHashMap<String, String> cache = new LinkedHashMap<>();
    private static int maxCapacity = 0;

    private static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
        System.out.println("Max capacity set to "+capacity+".");
    }

    private static void addToCache(String key, String value){
        if(cache.size()>=maxCapacity){
            removeLRU();
        }
        cache.put(key, value);
        System.out.println("Item added to cache successfully.");
    }

    private static void retrieveFromCache(String key){
        System.out.println(cache.containsKey(key) ? "Key: "+key+" Value: "+cache.get(key) : "Item with key "+key+" not found!");
    }

    private static void displayCache(){
        System.out.println("Currently cache has: "+cache);
    }

    private static void removeLRU(){
        Map.Entry<String, String> entry = cache.entrySet().iterator().next();
        String removeKey = entry.getKey();
        cache.remove(removeKey);
    }

    public static void main(String[] args) {
        setMaxCapacity(3);
        addToCache("A","Apple");
        addToCache("B","Banana");
        addToCache("C", "Carrot");
        displayCache();
        addToCache("D","Datura");
        displayCache();
        retrieveFromCache("B");
        retrieveFromCache("A");
    }
}

//Problem 4: Cache Management
//Implement a cache management system using LinkedHashMap in Java. The cache should have a maximum capacity,
// and least recently used items should be evicted when the capacity is reached.
//
//Operations to Perform:
//   - Add an item to the cache
//   - Retrieve an item from the cache
//   - Display the current cache content
//   - Set the maximum capacity of the cache
//   - Automatically evict least recently used items when the capacity is reached
//
//Code Stub:
//        import java.util.LinkedHashMap;
//    import java.util.Map;
//
//public class CacheManagement {
//    public static void main(String[] args) {
//        // TODO: Implement cache management system
//    }
//}
//Sample Input:
//        1. Set maximum capacity of the cache: 3
//        2. Add item to cache: Key="A", Value="Apple"
//        3. Retrieve item from cache: Key="B"
//        4. Display current cache content
//
//Sample Output:
//        1. Maximum capacity set to 3.
//        2. Item added to cache successfully.
//   3. Item not found in cache for key "B".
//        4. Current Cache Content: {A=Apple}