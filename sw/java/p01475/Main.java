package p01475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] target = new int[10];
		int max = -1;
		try {
			String data = br.readLine();
			
			for(int i = 0; i<data.length(); i++) {
				int tmp = Character.getNumericValue(data.charAt(i));
				if(tmp==6 || tmp ==9) {
					if(target[6]>target[9]) {
						target[9]++;
					} else {
						target[6]++;
					}
				} else {
					target[tmp]++;
				}
				
			}
			
			for(int i=0; i<10; i++) {
				if(target[i]>max) max = target[i];
			}
			
			System.out.println(max);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
