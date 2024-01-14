import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Triplets {

    static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }

        // Count triplets
        long result = countTriplets(N, A, B, C);
        System.out.println(result);

        scanner.close();
    }

    static long countTriplets(int N, int[] A, int[] B, int[] C) {
        Map<Integer, Integer> countA = new HashMap<>();
        Map<Integer, Integer> countB = new HashMap<>();
        Map<Integer, Integer> countC = new HashMap<>();

        for (int i = 0; i < N; i++) {
            countA.put(A[i], countA.getOrDefault(A[i], 0) + 1);
            countB.put(B[i], countB.getOrDefault(B[i], 0) + 1);
            countC.put(C[i], countC.getOrDefault(C[i], 0) + 1);
        }

        long result = 1;

        for (int key : countA.keySet()) {
            if (countB.containsKey(key) && countC.containsKey(key)) {
                result = (result * (modularExponentiation(3, countA.get(key)) % MOD)) % MOD;
            }
        }

        return result;
    }

    static long modularExponentiation(long base, int exponent) {
        long result = 1;
        final int MOD = 998244353;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }

        return result;
    }
}
