package p14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N;
		int[][] data;
		
		int test = 100*2/3;
		System.out.println(test);
		StringBuilder sb = new StringBuilder();
		
		try {
			N = Integer.parseInt(br.readLine());
			data = new int[N][N];
			
			for(int i=0; i<N; i++) {
				String[] line = br.readLine().split(" ");
				for(int j=0; j<N; j++) {
					data[i][j] = Integer.parseInt(line[j]);
					
				}
			}
			
			
			for(int i=1; i<N; i++) {
				for(int j=1; j<N; j++) {
					if(i==j) {
						continue;
					}
					
				}
			}
			
			
			System.out.println(sb.toString());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
