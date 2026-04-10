import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the entire input string
        if (sc.hasNextLine()) {
            String input = sc.nextLine().trim();
            
            // Handle empty input case
            if (input.isEmpty()) {
                System.out.print("");
                return;
            }
            
            String result = compress(input);
            System.out.println(result);
        }
    }

    public static String compress(String str) {
        int n = str.length();
        // If the string is empty or very short, it can't be compressed effectively
        if (n < 2) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < n; i++) {
            // Check if next character is the same
            if (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Character changes or we hit the end
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1; // Reset for the next sequence
            }
        }

        String result = compressed.toString();

        // STRICT CONSTRAINT: Only return compressed if it is SHORTER
        // If length is equal or longer, return original
        return (result.length() < n) ? result : str;
    }
}
