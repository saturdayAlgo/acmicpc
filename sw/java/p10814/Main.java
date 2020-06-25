package p10814;

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
			String[][] data = new String[N][2];
			
			
			for(int i=0; i<N; i++) {
				String[] line = br.readLine().split(" ");
				data[i] = line;
			}
			
			Arrays.sort(data, new Comparator<String[]>() {
				@Override
				public int compare(String[] o1, String[] o2) {
					return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
				}
			});
			
			StringBuffer sb = new StringBuffer();
			for(int i=0; i<N; i++) {
				sb.append(data[i][0]).append(" ").append(data[i][1]).append("\n");
			}
			
			System.out.println(sb.toString());
		} catch (IOException e) {
		}
	}
}
