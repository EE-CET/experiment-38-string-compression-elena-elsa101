import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Read the string
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) {
            return;
        }
        String s = sc.next();
        
        // TODO: Iterate through the string to count consecutive characters
        // TODO: Append char and count to a StringBuilder
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            count++;
            
            // If next character is different or we reached the end
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }
        
        String result = compressed.toString();
        
        // TODO: Compare lengths of original vs compressed
        // TODO: Print the shorter one
        // Constraint: If compressed is NOT smaller than original, print original.
        if (result.length() < s.length()) {
            System.out.println(result);
        } else {
            System.out.println(s);
        }
        
        sc.close();
    }
}
