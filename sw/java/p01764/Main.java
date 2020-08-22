package p01764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> testSet = new HashSet<String>(); 
		ArrayList<String> resultSet = new ArrayList<String>();
		int N,M;
		
		String[] line = br.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		
		for(int i=0; i<N; i++) {
			testSet.add(br.readLine());
		}
		
		for(int i=0; i<M; i++) {
			String tgt = br.readLine();
			if(testSet.contains(tgt)) {
				resultSet.add(tgt);
			}
		}
		
		Collections.sort(resultSet);
		System.out.println(resultSet.size());
		for(int i=0; i<resultSet.size(); i++) {
			System.out.println(resultSet.get(i));
		}
	}
}
