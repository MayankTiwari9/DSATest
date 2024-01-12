public class StringBeauty {
    static int stringBeauty(String k1, String k2){

        // 12 of 16 test case passing 
        String lowerCaseK1 = k1.toLowerCase();
        String lowerCaseK2 = k2.toLowerCase();

        int diff = 0;

        for (int i = 0; i < k1.length(); i++) {
            if(lowerCaseK1.charAt(i) != lowerCaseK2.charAt(i))
            diff++;
        }

        return diff;
    }
    public static void main(String[] args) throws Exception {
        String k1 = "abcde";
        String k2 = "AbCdE";

        System.out.println(stringBeauty(k1, k2));
    }
}
