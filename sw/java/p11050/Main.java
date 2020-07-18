package p11050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int N, K;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] data = br.readLine().split(" ");
		
		N = Integer.parseInt(data[0]);
		K = Integer.parseInt(data[1]);
		
		int molecular = 1;
		for(int i=N; i>K; i--) {
			molecular *= i;
		}
		
		int denominator = 1;
		
		for(int i=N-K; i>0; i--) {
			denominator*=i;
		}
		
		System.out.println(molecular/denominator);
	}
}
