package p10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[] source;
	
	private static int lower_idx(int tgt) {
		int st = 0;
		int en = source.length;
		while(st<en) {
			int mid = (st+en)/2;
			if(source[mid]>=tgt) {
				en = mid;
			} else {
				st = mid+1;
			} 
		}
		return st;
	}
	
	private static int upper_idx(int tgt) {
		int st = 0;
		int en = source.length;
		while(st<en) {
			int mid = (st+en)/2;
			
			if(source[mid]>tgt) {
				en = mid;
			} else {
				st = mid+1;
			}
		}
		return st;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N, M;
		String[] line;
		StringBuffer sb = new StringBuffer();
		try {
			N = Integer.parseInt(br.readLine());
			source = new int[N];
			line = br.readLine().split(" ");
			
			for(int i=0; i<N; i++) {
				source[i] = Integer.parseInt(line[i]);
			}
			Arrays.sort(source);
			
			M = Integer.parseInt(br.readLine());
			line = br.readLine().split(" ");
			
			for(int i=0; i<M; i++) {
				int tgt = Integer.parseInt(line[i]);
				int result = upper_idx(tgt)-lower_idx(tgt);
				sb.append(result).append(" ");
			}
			System.out.println(sb);
		} catch (NumberFormatException | IOException e) {
		}
	}
}
