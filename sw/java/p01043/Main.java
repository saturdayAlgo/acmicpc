package p01043;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] knownList = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<K; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			knownList[tmp] = 1;
		}
		
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<M; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int partyNum = Integer.parseInt(st.nextToken());
			boolean canLie = true;
			
			for(int j=0; j<partyNum; j++) {
				int tgt = Integer.parseInt(st.nextToken());
				list.get(i).add(tgt);
				if(knownList[tgt]>0) {
					canLie = false;
				}
			}
			
			if(!canLie) {
				for(int num : list.get(i)) {
					knownList[num] = 1;
				}
			}
		}
		int result = 0;
		for(ArrayList<Integer> data : list) {
			boolean canLie = true;
			for(int num : data) {
				if(knownList[num]>0) {
					canLie = false;
					break;
				}
			}
			if(canLie) {
				result++;
			}
		}
		System.out.println(result);
	}
}
