package p07576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
	int m, n;

	Node(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class Main {
	static int[][] data;
	static int[][] direction = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	static int M;
	static int N;

	static int bfs() {
		Queue<Node> qu = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (data[i][j] == 1) {
					qu.add(new Node(j, i));
				}
			}
		}

		while (!qu.isEmpty()) {
			Node n = qu.poll();
			for (int i = 0; i < 4; i++) {
				int nextN = n.n + direction[i][0];
				int nextM = n.m + direction[i][1];
				if (nextN >= 0 && nextN < N && nextM >= 0 && nextM < M && data[nextN][nextM] == 0) {
					qu.add(new Node(nextM, nextN));
					data[nextN][nextM] = data[n.n][n.m] + 1;
				}
			}
		}
		int result = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (data[i][j] == 0)
					return -1;
				result = Math.max(result, data[i][j]);
			}
		}
		return result - 1;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc;
		try {
			tc = br.readLine();
			StringTokenizer st = new StringTokenizer(tc, " ");
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			data = new int[N][M];
			for (int i = 0; i < N; i++) {
				tc = br.readLine();
				st = new StringTokenizer(tc, " ");
				for (int j = 0; j < M; j++) {
					data[i][j] = Integer.parseInt(st.nextToken());
				}

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println(bfs());
	}
}
