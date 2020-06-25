package p01181;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N = Integer.parseInt(br.readLine());
			String[] data = new String[N];
			for(int i=0; i<N; i++) {
				data[i] = br.readLine().trim();
			}
			
			Arrays.sort(data, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if(o1.length()==o2.length()) {
						return o1.compareTo(o2);
					} else {
						return o1.length()-o2.length();
					}
				}
			});
			
			StringBuffer sb = new StringBuffer();
			String recentStr = new String();
			for(int i=0; i<N; i++) {
				if(!recentStr.equals(data[i])) {
				sb.append(data[i]).append("\n");
				}
				recentStr = data[i];
			}
			
			System.out.print(sb.toString());
		} catch (IOException e) {
		}
	}
}
