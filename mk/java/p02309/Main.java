package p02309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int[] small = new int[9];
        int sum = 0;

        sc.init();
        boolean isbreak = false;
        for(int i=0; i<9; i++){
            small[i] = sc.nextInt();
            sum += small[i];
        }
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(sum - small[i] - small[j] == 100){
                    small[i] = -1;
                    small[j] = -1;
                    isbreak = true;
                    break;
                }
            }
            if(isbreak){
                break;
            }
        }
        Arrays.sort(small);
        for(int i= 2; i<9; i++){
            System.out.println(small[i]);
        }






    }
    static boolean isPrime1(int n){
        if(n==1) return false;
        for(int i =2; i < n; i ++ ){
            if(n%i == 0) return false;
        }
        return true;
    }



    static class sc {
        private static BufferedReader br;
        private static StringTokenizer st;

        static void init() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        static String readLine() {
            try {
                return br.readLine();
            } catch (IOException IOe) {
            }
            return null;
        }

        static String readLineReplace() {
            try {
                return br.readLine().replace("\\s+", "");
            } catch (IOException IOe) {

            }
            return null;
        }

        static String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        static boolean hasNext() {
            return st.hasMoreTokens();
        }

        static long nextLong() {
            return Long.parseLong(next());
        }

        static int nextInt() {
            return Integer.parseInt(next());
        }

        static double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}



