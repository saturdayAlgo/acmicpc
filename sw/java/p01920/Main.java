package p01920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[] source;
	
	public static int search(int tgt, int sp, int ep) {
		while(sp<=ep) {
			int mid = (sp+ep)/2;
			if(source[mid]>tgt) {
				ep = mid-1;
			} else if(source[mid]<tgt) {
				sp = mid+1;
			} else {
				return 1;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N,M;
		String[] line;
		StringBuffer sb = new StringBuffer();
		try {
			N = Integer.parseInt(br.readLine());
			source = new int[N];	// A
			line = br.readLine().split(" ");
			
			for(int i=0; i<N; i++) {
				source[i] = Integer.parseInt(line[i]);
			}
			Arrays.sort(source);
			M = Integer.parseInt(br.readLine());
			line = br.readLine().split(" ");
			
			for(int i=0; i<M; i++) {
				int tgt = Integer.parseInt(line[i]);
				sb.append(search(tgt, 0, N-1)).append("\n");
			}
			
			System.out.println(sb);
		} catch (NumberFormatException | IOException e) {
		}
	}
}
