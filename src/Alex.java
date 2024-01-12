public class Alex {
    public static long[] questforGreatness(long n, long[] v) {
        long[] greatness = new long[(int) n];
    
        for (int x = 1; x <= n; x++) {
            long maxGCD = 0;
    
            for (int i = 0; i <= n - x; i++) {
                long subarrayGCD = v[i];
                for (int j = i + 1; j < i + x; j++) {
                    subarrayGCD = gcd(subarrayGCD, v[j]);
                }
                maxGCD = Math.max(maxGCD, subarrayGCD);
            }
    
            greatness[x - 1] = maxGCD;
        }
    
        return greatness;
    }
    
    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        long n = 6;
        long v[] = {6, 9, 1, 2, 6, 4};

        System.out.println(questforGreatness(n, v));
    }
}
