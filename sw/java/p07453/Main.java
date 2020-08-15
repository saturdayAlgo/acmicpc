package p07453;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		long[] A, B, C, D;
		
		long[] AB, CD;
		try {
			int N = Integer.parseInt(br.readLine());
			
			A = new long[N];
			B = new long[N];
			C = new long[N];
			D = new long[N];
			for(int i=0; i<N; i++) {
				String[] line = br.readLine().split(" ");
				A[i] = Long.parseLong(line[0]);
				B[i] = Long.parseLong(line[1]);
				C[i] = Long.parseLong(line[2]);
				D[i] = Long.parseLong(line[3]);
			}
			
			AB = new long[N*N];
			CD = new long[N*N+1];
			int index = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					AB[index] = A[i]+B[j];
					CD[index++] = C[i]+D[j];
				}
			}
			
			Arrays.sort(CD);
			
			
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
