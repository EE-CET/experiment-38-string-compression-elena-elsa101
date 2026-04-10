import java.util.Scanner;

public class Main {
    public static String compressString(String s) {
        StringBuilder compressed = new StringBuilder();
        
        int count = 1;
        
        for (int i = 0; i < s.length(); i++) {
            // Check if next character is same
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // Append character and its count
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }
        
        // Return original if compressed is not smaller
        if (compressed.length() >= s.length()) {
            return s;
        }
        
        return compressed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        String result = compressString(input);
        
        System.out.println(result);
        
        sc.close();
    }
}
