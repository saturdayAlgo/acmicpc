package p06118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i < N + 1; i++) {
			list.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int source = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());

			list.get(source).add(target);
			list.get(target).add(source);
		}

		int[] visited = new int[N + 1];
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(1);
		Arrays.fill(visited, -1);
		visited[1] = 0;
		
		while(!qu.isEmpty()) {
			int tgt = qu.poll();
			for(int num : list.get(tgt)) {
				if(visited[num]==-1) {
					qu.add(num);
					visited[num] = visited[tgt]+1;
				}
			}
		}
		
		int maxDist = 0;
		int maxResult = 1;
		int sameSite = 0;
		
		for(int i=1; i<=N; i++) {
			if(visited[i]>maxDist) {
				maxResult = i;
				maxDist = visited[i];
				sameSite = 1;
			}else if(visited[i]==maxDist) {
				sameSite++;
			}
		}
		System.out.println(maxResult + " " + maxDist + " " + sameSite);
	}
}