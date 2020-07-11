package p01874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, k, max=0, stIdx = 0;
		int N = Integer.parseInt(br.readLine());
		int stack[] = new int[N]; StringBuilder sb = new StringBuilder();
		
		while(N-->0) {
			k = Integer.parseInt(br.readLine());
			if(k>max) {
				for(i=max; i<k; i++) {
					stack[stIdx++] = i+1;
					sb.append("+\n");
				}
			} else {
				if(stack[stIdx-1]!=k) {
					System.out.print("NO");
					return;
				}
			}
			stIdx--;
			sb.append("-\n");
			if(k>max) max = k;
		}
		System.out.println(sb);
	}
}
