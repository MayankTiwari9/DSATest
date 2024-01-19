import java.util.PriorityQueue;
import java.util.Vector;

public class Sara {
    public static String generateSequence(int n, int[] are) {
        StringBuilder result = new StringBuilder();
        int disc = n;

        PriorityQueue<Integer> PQ = new PriorityQueue<>(java.util.Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            PQ.add(are[i]);
            while (!PQ.isEmpty() && PQ.peek() == disc) {
                result.append(PQ.poll()).append(" ");
                disc--;
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        // int n = 5;
        // int[] arr = {4, 5, 1, 2, 3};

        int n = 3;
        int[] arr = {3, 2, 1};
        System.out.println(generateSequence(n, arr));
    }
}
