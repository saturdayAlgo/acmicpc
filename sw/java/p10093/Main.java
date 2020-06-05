package p10093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		try {
			long a, b;
			String[] data = br.readLine().split(" ");
			a = Long.parseLong(data[0]);
			b = Long.parseLong(data[1]);
			
			if(a>b) {
				long tmp = a;
				a = b;
				b = tmp;
			} else if(a==b) {
				System.out.println(0);
				return;
			}
			sb.append(b-a-1).append("\n");
			for(long i = a+1; i<b; i++) {
				sb.append(i).append(" ");
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
