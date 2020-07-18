package p11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for(int i=2; i*i<=N; i++) {
			while(N%i==0) {
				sb.append(i).append("\n");
				N/=i;
			}
		}
		
		if(N!=1) sb.append(N).append("\n");
		System.out.println(sb);
	}
}
