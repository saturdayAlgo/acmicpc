package p01406;

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
        String input = sc.next();

        Stack<Character> lStack = new Stack<Character>();
        Stack<Character> rStack = new Stack<Character>();

        for(int i = 0; i<input.length(); i++){
            lStack.add(input.charAt(i));
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String command = sc.next();
            if (command.startsWith("L")) {
                if(!lStack.empty()) {
                    rStack.push(lStack.pop());
                }
            } else if (command.startsWith("D")) {
                if(!rStack.empty()) {
                    lStack.push(rStack.pop());
                }
            } else if (command.startsWith("B")) {
                if(!lStack.empty()) {
                    lStack.pop();
                }
            } else if (command.startsWith("P")) {
                String[] pCommand = command.split(" ");
                lStack.push(pCommand[1].toCharArray()[0]);
            }
        }
        while(!lStack.empty()) {
            rStack.push(lStack.pop());
        }
        while(!rStack.empty()) {
            System.out.println(rStack.pop());
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




