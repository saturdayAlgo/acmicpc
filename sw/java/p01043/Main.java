package p01043;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		
		for(int i=0; i<M; i++) {
			
		}
		
		
	}
}
