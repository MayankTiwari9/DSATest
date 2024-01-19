import java.util.*;

public class Andy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();

        String result = findAndyNumber(n);
        System.out.println(result);
    }

    private static String findAndyNumber(long n) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            if (n % 2 == 0) {
                result.insert(0, '4');
                n = (n / 2) - 1;  // Adjust N for the next iteration
            }
            else {
                result.insert(0, '3');
                n /= 2;  // Adjust N for the next iteration
            }
        }

        return result.toString();
    }
}
