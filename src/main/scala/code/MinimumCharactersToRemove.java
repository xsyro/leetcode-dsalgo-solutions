package code;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinimumCharactersToRemove {

    public int solution(String stringConsistingOfNWords) {
        // write your code in Java SE 8
        char[] characters = stringConsistingOfNWords.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for(int count = 0; count < characters.length; count++){
            if(charMap.containsKey(characters[count])) {
                //Update the value
                charMap.put(characters[count], charMap.get(characters[count]) + 1);
            } else {
                //create the value to the map
                charMap.put(characters[count], 1);
            }
        }
        int cntChar = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        for(Map.Entry<Character,Integer> it: charMap.entrySet()){
            priorityQueue.add(it.getValue());
        }

        while(!priorityQueue.isEmpty()){
            int frequent = priorityQueue.peek();
            priorityQueue.remove();

            if (priorityQueue.isEmpty()) {
                return cntChar;
            }

            if (frequent == priorityQueue.peek()) {
                if (frequent > 1){
                    priorityQueue.add(frequent - 1);
                }
                cntChar++;
            }
        }
        return cntChar;
    }
}
