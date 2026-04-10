import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Check if input exists to avoid errors
        if (!sc.hasNext()) {
            return;
        }
        
        String str = sc.next();
        System.out.println(compress(str));
    }

    public static String compress(String str) {
        // A string of length 0 or 1 cannot be compressed to be smaller
        if (str == null || str.length() <= 1) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;

            // If the next character is different, or we are at the end of the string
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0; // Reset counter for the next character
            }
        }

        String result = compressed.toString();

        // Constraint: Return original if compressed is not smaller
        return result.length() < str.length() ? result : str;
    }
}
