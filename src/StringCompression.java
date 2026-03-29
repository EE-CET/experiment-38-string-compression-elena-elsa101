    import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        if (S.length() == 0) {
            System.out.println(S);
            return;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= S.length(); i++) {
            if (i < S.length() && S.charAt(i) == S.charAt(i - 1)) {
                count++;
            } else {
                result.append(S.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        if (result.length() < S.length()) {
            System.out.println(result.toString());
        } else {
            System.out.println(S);
        }
    }

}
  

