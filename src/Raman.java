public class Raman {
    public static int raman(int n, int k, String s){

        // 14 of 18 test cases passing
        
        int score = 0;
        int zeros = 0;
        for (char c: s.toCharArray()) {
            if(c == '0'){
                zeros++;
                if(zeros == k){
                    score++;
                    zeros = 0;
                }
            }
            else{
                zeros = 0;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        // int n = 4;
        // int k = 1;
        // String s = "1010";

        // int n = 4;
        // int k = 2;
        // String s = "0100";

        
        int n = 11;
        int k = 3;
        String s = "00100000001";

        System.out.println(raman(n,k,s));
    }
}
