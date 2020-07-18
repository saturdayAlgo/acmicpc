package p11051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] data = br.readLine().split(" ");
		int N = Integer.parseInt(data[0]);
		int K = Integer.parseInt(data[1]);
		int[][] set = new int[N+1][N+1];
		
		// 파스칼의 삼각형 만들기
		for(int i=0; i<set.length; i++) {
			for(int j=0; j<=i; j++) {
				if(i==j || j==0) {
					set[i][j] = 1;
				} else {
					set[i][j] = (set[i-1][j-1]+set[i-1][j])%10007;
				}
			}
		}
		
		System.out.println(set[N][K]);
		
	}
}
