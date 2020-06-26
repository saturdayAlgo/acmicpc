package p11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] line = br.readLine().split(" ");
			
			int A = Integer.parseInt(line[0]);
			int B = Integer.parseInt(line[1]);
			
			int[] aSet = new int[A];
			int[] bSet = new int[B];
			
			line = br.readLine().split(" ");
			
			for(int i=0; i<A; i++){
				aSet[i] = Integer.parseInt(line[i]);
			}
			
			line = br.readLine().split(" ");
			
			for(int i=0; i<B; i++){
				bSet[i] = Integer.parseInt(line[i]);
			}
			
//			Arrays.sort(aSet);
//			Arrays.sort(bSet);
			
			int aPointer = 0;
			int bPointer = 0;
			int[] resultSet = new int[A+B];
			int i = 0;
			while(aPointer<A && bPointer<B){
				if(aSet[aPointer]<bSet[bPointer]) resultSet[i++] = aSet[aPointer++]; 
				else resultSet[i++] = bSet[bPointer++];
			}
			
			while(aPointer<A) resultSet[i++] = aSet[aPointer++];
			while(bPointer<B) resultSet[i++] = bSet[bPointer++];
			StringBuffer sb = new StringBuffer();
			for(i=0; i<resultSet.length; i++){
				sb.append(resultSet[i]).append(" ");
			}
			
			System.out.println(sb.toString());
		} catch (IOException e) {
		}
	}
}
