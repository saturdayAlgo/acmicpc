package p02309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] data= new int[9];
		
		try {
			for (int i = 0; i < 9; i++) {
				int n = Integer.parseInt(br.readLine());
				data[i] = n;
				result += n;
			}
			
			for(int i=0; i<9; i++) {
				for(int j=1; j<9; j++) {
					int tmp = result;
					tmp = tmp-data[i]-data[j];
					if(tmp==100) {
						data[i] = 101;
						data[j] = 101;
						i=9;j=9;
					}
				}
			}
			Arrays.sort(data, 0, 9);
			for(int i=0; i<7; i++) {
				System.out.println(data[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
