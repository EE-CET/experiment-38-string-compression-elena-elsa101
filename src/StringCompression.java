import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
            
            for (String word : words) {
                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            
            // Sort by frequency (descending) then alphabetically
            java.util.List<java.util.Map.Entry<String, Integer>> list = new java.util.ArrayList<>(map.entrySet());
            list.sort((a, b) -> {
                int freqCompare = b.getValue().compareTo(a.getValue());
                if (freqCompare != 0) return freqCompare;
                return a.getKey().compareTo(b.getKey());
            });
            
            for (java.util.Map.Entry<String, Integer> entry : list) {
                System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
