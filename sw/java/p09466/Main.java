package p09466;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			int K = Integer.parseInt(br.readLine());
			int[] dataSet = new int[K+1];
			int[] trueList = new int[K+1];
			st = new StringTokenizer(br.readLine()); 
			for(int j=1; j<=K; j++) {
				int tgt = Integer.parseInt(st.nextToken());
				if(tgt==j) {
					trueList[j] = 1;
				} else {
					dataSet[j] = tgt;
				}
			}
			
			// -1일 경우 => visit은 했으나 팀을 찾지 못한 경우
			// 0 => visit==false
			int level = 2;
			for(int j=1; j<=K; j++) {
				Queue<Integer> qu = new LinkedList<Integer>();
				if(dataSet[j]>0 && trueList[j]==0) {
					qu.add(dataSet[j]);
					trueList[j]=level;
				}
				while(!qu.isEmpty()) {
					
				}
				
				level++;
			}
		}
	}
}
