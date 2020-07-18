package p01463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;
		try {
			N = Integer.parseInt(br.readLine());
			
			int[] data = new int[1000001];
			data[1] = 0;
			
			for(int i=2; i<=N; i++){
				data[i] = data[i-1]+1;
				if(i%2==0){
					data[i] = Math.min(data[i/2]+1,data[i]);
				} 
				if(i%3==0){
					data[i] = Math.min(data[i/3]+1,data[i]);
				}
			}
			
			System.out.println(data[N]);
			
		} catch (IOException e) {
		}
	}
}
