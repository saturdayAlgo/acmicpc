package p01629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static long calc(long a, long b, long c){
		if(b==0){
			return 1;
		} else if(b==1){
			return a;
		}
		if(b%2>0){
			return calc(a, b-1,c)*a;
		} 
		long data = calc(a,b/2, c);
		data%=c;
		return (data*data)%c;
	}
	
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		long a,b,c;
		
		try {
			String line = br.readLine();
			String[] tmp = line.split(" ");
			a = Long.parseLong(tmp[0]);
			b = Long.parseLong(tmp[1]);
			c = Long.parseLong(tmp[2]);

            long result = calc(a,b,c);
			
			System.out.println(result%c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
