package p11725;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<Integer>());
		}
		for(int i=1; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int src = Integer.parseInt(st.nextToken());
			int tgt = Integer.parseInt(st.nextToken());
			
			list.get(src).add(tgt);
			list.get(tgt).add(src);
		}
		int[] parent = new int[N+1];
		int[] visited = new int[N+1];
		
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(1);
		visited[1] = 1;
		parent[1] = 0;
		while(!qu.isEmpty()) {
			int tgt = qu.poll();
			
			for(int num : list.get(tgt)) {
				if(visited[num]==0) {
					parent[num] = tgt;
					visited[num] = visited[tgt]+1;
					qu.add(num);
				}
			}
		}
		
		for(int i=2; i<=N; i++) {
			System.out.println(parent[i]);
		}
	}
}
