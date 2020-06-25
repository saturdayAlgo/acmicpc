package p11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N = Integer.parseInt(br.readLine());
			int[][] data = new int[N][2];
			for(int i=0; i<N; i++) {
				String[] line = br.readLine().split(" ");
				data[i][0] = Integer.parseInt(line[0]);
				data[i][1] = Integer.parseInt(line[1]);
			}
			
			Arrays.sort(data, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[0]==o2[0]) return o1[1]-o2[1];
					return o1[0]-o2[0];
				}
			});
			
			StringBuffer sb = new StringBuffer();
			for(int i=0; i<N; i++) {
				sb.append(data[i][0]).append(" ").append(data[i][1]).append("\n");
			}
			
			System.out.print(sb.toString());
		} catch (IOException e) {
		}
		
	}
}
