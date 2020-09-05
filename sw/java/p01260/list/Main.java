package p01260.list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	static int N, M, V;
	static HashMap<Integer, PriorityQueue<Integer>> dataSet;
	static StringBuffer sb;
	static int[] visited;

	public static void dfs(int V) {
		visited[V] = 1;
		sb.append(V).append(" ");

		if (dataSet.containsKey(V)) {
			PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
			qu.addAll(dataSet.get(V));
			while (!qu.isEmpty()) {
				int tgt = qu.poll();
				if (visited[tgt] != 1) {
					dfs(tgt);
				}
			}
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line = br.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		V = Integer.parseInt(line[2]);
		sb = new StringBuffer();

		dataSet = new HashMap<Integer, PriorityQueue<Integer>>();
		for (int i = 0; i < M; i++) {
			line = br.readLine().split(" ");
			int source = Integer.parseInt(line[0]);
			int target = Integer.parseInt(line[1]);

			if (dataSet.containsKey(source)) {
				dataSet.get(source).add(target);
			} else {
				PriorityQueue<Integer> qu = new PriorityQueue<Integer>(Comparator.naturalOrder());
				qu.add(target);
				dataSet.put(source, qu);
			}
			if (dataSet.containsKey(target)) {
				dataSet.get(target).add(source);
			} else {
				PriorityQueue<Integer> qu = new PriorityQueue<Integer>(Comparator.naturalOrder());
				qu.add(source);
				dataSet.put(target, qu);
			}
		}
		// Stack

		visited = new int[N + 1];
		visited[V] = 1;
		dfs(V);

		sb.append("\n");

		// BFS
		Queue<Integer> queue = new LinkedList<Integer>();
		visited = new int[N + 1];
		queue.add(V);
		visited[V] = 1;

		while (!queue.isEmpty()) {
			int tgt = queue.poll();
			sb.append(tgt).append(" ");

			if (dataSet.containsKey(tgt)) {
				PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
				qu.addAll(dataSet.get(tgt));
				while (!qu.isEmpty()) {
					int newTgt = qu.poll();
					if (visited[newTgt] != 1) {
						queue.add(newTgt);
						visited[newTgt] = 1;
					}
				}
			}
		}

		System.out.println(sb);
	}
}
