package maps;

import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.print("Enter a sentence: ");
        String[] sentence = sc.nextLine().split(" ");
        for(String word: sentence){
            String newWord;
            if(word.charAt(word.length()-1)=='.'){
                newWord = word.substring(0,word.length()-1);
            }else{
                newWord=word;
            }
            if(map.containsKey(newWord)){
                map.put(newWord, map.get(newWord)+1);
            }
            else{
                map.put(newWord, 1);
            }
        }
        System.out.println("Word frequencies:");
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, Collections.reverseOrder(Map.Entry.comparingByValue()));
        for(Map.Entry<String, Integer> entry: entryList){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }


    }
}