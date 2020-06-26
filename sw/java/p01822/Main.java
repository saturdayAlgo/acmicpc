package p01822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] line = br.readLine().split(" ");
			
			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);
			int[] aSet = new int[n];
			int[] bSet = new int[m];
			
			line = br.readLine().split(" ");
			for(int i=0; i<n; i++) {
				aSet[i] = Integer.parseInt(line[i]);
			}
			
			line = br.readLine().split(" ");
			for(int i=0; i<m; i++) {
				bSet[i] = Integer.parseInt(line[i]);
			}
			ArrayList<Integer> resSet = new ArrayList<>();
			Arrays.sort(aSet);
			Arrays.sort(bSet);
			
			int aPointer=0;
			int bPointer=0;
			
			while(aPointer<n){
				if(bPointer<m){
					if(aSet[aPointer]>bSet[bPointer]){
						bPointer++;
					} else if (aSet[aPointer]==bSet[bPointer]){
						aPointer++;
						bPointer++;
					} else {
						resSet.add(aSet[aPointer++]);
					}
				} else {
					resSet.add(aSet[aPointer++]);
				}
			}
			
			StringBuffer sb = new StringBuffer();
			sb.append(resSet.size()).append("\n");
			for(int num : resSet) {
				sb.append(num).append(" ");
			}
			System.out.println(sb.toString());
			
			
		} catch (IOException e) {
		}
	}
}
