package p02606;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int N = Integer.parseInt(s);
		int[][] set = new int[N+1][N+1];
		s = br.readLine();
		int M = Integer.parseInt(s);
		
		for(int i=0; i<M; i++){
			s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int source = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			
			set[source][target] = 1;
			set[target][source] = 1;
		}
		
		int[] visited = new int[N+1];
		Queue<Integer> qu = new LinkedList<>();
		qu.add(1);
		visited[1] = 1;
		int result = 0;
		
		while(!qu.isEmpty()){
			int tgt = qu.poll();
			for(int i=2; i<=N; i++){
				if(visited[i]!=1 && set[tgt][i]==1){
					qu.add(i);
					visited[i] = 1;
					result++;
				}
			}
		}
		
		System.out.println(result);
	}
}
