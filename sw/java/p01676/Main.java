package p01676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N;
		int nTwo=0, nFive = 0;
		
		try {
			N = Integer.parseInt(br.readLine());
			
			for(int i=2; i<=N; i*=2) {
				nTwo += N/i;
			}
			
			for(int i=5; i<=N; i*=5) {
				nFive += N/i;
			}
			
			System.out.println(nTwo>nFive?nFive:nTwo);
		} catch (NumberFormatException | IOException e) {
		}
	}
}
