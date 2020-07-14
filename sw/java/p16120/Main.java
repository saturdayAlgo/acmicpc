package p16120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int t;
	static char[] testData;
	public static boolean check() {
		if(t<4) return false;
		if(testData[t-4]=='P'&&testData[t-3]=='P'&&testData[t-2]=='A'&&testData[t-1]=='P') {
			return true;
		} 
		return false;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String data = br.readLine();
		testData = new char[data.length()];
//		testData = data.toCharArray();
		
		for(int i=0; i<data.length(); i++) {
			testData[t++] = data.charAt(i);
			while(check()) {
				t-=4;
				testData[t++]='P';
			}
		}
		
		if(t==1 && testData[0] == 'P') {
			System.out.println("PPAP");
		}else {
			System.out.println("NP");
		}
	}
}
