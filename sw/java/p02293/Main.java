package p02293;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = StringToInt(st.nextToken());
		int k = StringToInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] dp = new int[k+1];
		
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			list.get(i);
		}
		
		dp[0] = 1;
		
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<=k; j++) {
				if(j>=list.get(i)) dp[j] += dp[j-list.get(i)];
			}
		}
		System.out.println(dp[k]);
	}
	
	private static int StringToInt(String str) {return Integer.parseInt(str);} 
	
}
