package p09466;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			int K = Integer.parseInt(br.readLine());
			int[] dataSet = new int[K+1];
			boolean[] trueList = new boolean[K+1];
			Arrays.fill(trueList, false);
			st = new StringTokenizer(br.readLine()); 
			for(int j=1; j<=K; j++) {
				int tgt = Integer.parseInt(st.nextToken());
				if(tgt==j){
					trueList[j] = true;
				}
				dataSet[j] = tgt;
			}
			
			// -1일 경우 => visit은 했으나 팀을 찾지 못한 경우
			// 0 => visit==false
			
			for(int j=1; j<=K; j++) {
				if (!trueList[j]) {
					boolean[] visited = new boolean[K + 1];
					Arrays.fill(visited, false);
					Stack<Integer> qu = new Stack<Integer>();
					qu.add(dataSet[j]);
					visited[j] = true;
					boolean isTeam = false;
					ArrayList<Integer> teams = new ArrayList<>();
					teams.add(j);
					while (!qu.isEmpty()) {
						
						int tgt = qu.pop();
						if (dataSet[tgt] == j) {
							teams.add(tgt);
							isTeam = true;
							break;
						}

						int nextNum = dataSet[tgt];
						if(!visited[nextNum]){
							qu.add(nextNum);
							teams.add(tgt);
							visited[nextNum] = true;
						}
						
					}
					if (isTeam) {
						for(int num : teams){
							trueList[num] = true;
						}
					}
				}
				
			}
			
			int result = 0;
			for(int j=1; j<=K; j++){
				if(!trueList[j]){
					result++;
				}
			}
			System.out.println(result);
		}
	}
	
	public static void dfs(){
		
	}
}
