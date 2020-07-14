package p01475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        sc.init();
        int i=0;
        int plastic[] = new int[10];
        int max = -1;
        String num = sc.readLine();
        for(i=0;i<num.length();i++) {
            int temp = Character.getNumericValue(num.charAt(i));
            if(temp == 6 || temp == 9){
                if(plastic[6]<plastic[9]){
                    plastic[6]++;
                }else{
                    plastic[9]++;
                }
            }else{
                plastic[temp]++;
            }
        }

        for(i=0;i<10;i++) {
            if(max < plastic[i]) {
                max = plastic[i];
            }
        }
        System.out.println(max);

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



