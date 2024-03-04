package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicMapOperations {
    public static void main(String[] args) {
        Map map = new HashMap();
        Scanner sc = new Scanner(System.in);
        String key1 = sc.nextLine();
        String value1 = sc.nextLine();
        String key2 = sc.nextLine();
        int value2 = sc.nextInt();
        sc.nextLine();
        map.put(key1, value1);
        map.put(key2, value2);
        System.out.println("Remove:");
        String remKey = sc.nextLine();
//        Integer removed = map.remove(remKey);
        System.out.println(!map.remove(remKey).equals(0)?"removed sucessfully.":"unsucessful removal");
        System.out.println("find:");
        String keyFind = sc.nextLine();
        boolean isKeyPresent = map.containsKey(keyFind);
        System.out.println("Key \""+keyFind+"\" "+(isKeyPresent?"exists.":"doesn't exist."));

    }
}