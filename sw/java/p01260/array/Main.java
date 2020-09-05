package p01260.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int N,M,V;
	static int[][] list;
	static int[] visited;
	static StringBuffer sb;
	public static void dfs(int V) {
		visited[V] = 1;
		sb.append(V).append(" ");
		
		for (int i = 1; i <= N; i++) {
			if (list[V][i] == 1 && visited[i] != 1) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] line = br.readLine().split(" ");
			N = Integer.parseInt(line[0]);
			M = Integer.parseInt(line[1]);
			V = Integer.parseInt(line[2]);
			list = new int[N+1][N+1];
			sb = new StringBuffer();
			
			visited = new int[N+1];
			for(int i=0; i<M; i++) {
				line = br.readLine().split(" ");
				int source = Integer.parseInt(line[0]);
				int target = Integer.parseInt(line[1]);
				
				list[source][target] = 1;
				list[target][source] = 1;
				
			}
			//Stack
			dfs(V);
			sb.append("\n");
			
			visited = new int[N+1];

			//BFS
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(V);
			visited[V] = 1;
			
			while(!queue.isEmpty()) {
				int tgt = queue.poll();
				sb.append(tgt).append(" ");
				
				for(int i=1; i<=N; i++) {
					if(list[tgt][i]==1 && visited[i]!=1) {
						queue.add(i);
						visited[i] = 1;
					}
				}
			}
			
			System.out.println(sb);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}