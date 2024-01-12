// you can add inner classes if needed

import java.util.*;

public class JerryLexicography {



    //========== User's Code Starts Here ==========
    //Only 1 test case passed
    
        public static long findSmallestN(long K, long M) {
    
            // Your code here
    
            long ans = 1;
    
            for(long i = 1; i<= M; i++){
                ans *= K;
                if(ans > M){
                    return i - 1;
                }
            }
            return M;
    
            // if(K > M){
            //     return M;
            // }
    
            // long l = K;
            // long r = M * K;
            // long right = 0;
    
            // while(l <= r){
            //     long mid = (l + r) / 2;
            //     long curr = getCount(mid, K);
    
            //     if(curr == M){
            //         right = mid;
            //         l = mid+1;
            //     }
            //     else if(curr < M){
            //         l = mid + 1;
            //     }
            //     else{
            //         r = mid - 1;
            //     }
            // }
            // return right;
        }
    
        // private static long getCount(long n, long k){
        //     long count = 0;
    
        //     for(int i = 1; i < 10; i++){
        //         count += (n / (i * k + 1)) * i * k;
    
        //         long rem = n & (i*k+1);
        //         if(rem >= i * k){
        //             count += i*k;
        //         }else{
        //             count += rem;
        //         }
        //         }
        //     return count;
        //     }
    
    //========== User's Code Ends Here ==========
    
    
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long K = scanner.nextLong();
            long M = scanner.nextLong();
    
            long result = findSmallestN(K, M);
            System.out.println(result);
            
            scanner.close();
        }
    }
    
