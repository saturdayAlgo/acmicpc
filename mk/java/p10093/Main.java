import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        long first;
        long second;
        long count;
        long temp;
        sc.init();
        first = sc.nextLong();
        second = sc.nextLong();
        if(first>second){
            temp = first;
            first = second;
            second = temp;
        }else if(first==second){
            System.out.println(0);
            return;
        }
        count = (second-first-1);
        System.out.println(count);
        for(long i=first+1; i<second; i++){
            System.out.print(i+" ");
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



