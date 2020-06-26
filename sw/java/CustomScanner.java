// package sw.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CustomScanner {
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
