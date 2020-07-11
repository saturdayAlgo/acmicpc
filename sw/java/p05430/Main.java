package p05430;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		sc.init();

		new Main().solve();
	}

	private void solve() {
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String ops = sc.next();
			int size = sc.nextInt();
			int flag = 0;
			boolean errFlag = false;
			String tokens = sc.next();
			tokens = tokens.replace("[", "");
			tokens = tokens.replace("]", "");
			StringBuffer res = new StringBuffer();

			String[] seta = tokens.split(",");
			Deque<Integer> list = new ArrayDeque<Integer>();
			int[] data = new int[size];

			for (int j = 0; j < size; j++) {
				list.add(Integer.parseInt(seta[j]));
			}

			for (int j = 0; j < ops.length(); j++) {
				if (ops.charAt(j) == 'R') {
					flag++;
				} else {
					if (list.size() > 0) {
						if (flag % 2 == 1) {
							list.removeLast();
						} else {
							list.removeFirst();
						}
					} else {
						errFlag = true;
						break;
					}
				}
			}

			if(errFlag) {
				System.out.println("error");
			} else {
				res.append("[");
				if(flag%2==0) {
					while(!list.isEmpty()) {
						res.append(list.removeFirst()).append(",");
					}
				} else {
					while(!list.isEmpty()) {
						res.append(list.removeLast()).append(",");
					}
				}
				res = res.deleteCharAt(res.length()-1);
				res.append("]");
				System.out.println(res);
			}
			

		}
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
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		static String readLineReplace() {
			try {
				return br.readLine().replace("\\s+", "");
			} catch (IOException e) {
				e.printStackTrace();
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

}
