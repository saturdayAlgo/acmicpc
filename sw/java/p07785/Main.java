package p07785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> hash = new HashSet<String>();
		try {
			int N = Integer.parseInt(br.readLine());
			
			for(int i=0; i<N; i++) {
				String[] line = br.readLine().split(" ");
				
				if(line[1].equals("enter")) {
					hash.add(line[0]);
				}else {
					hash.remove(line[0]);
				}
			}
			ArrayList<String> data = new ArrayList<String>(hash); 
			Collections.sort(data, Collections.reverseOrder());
			for(int i=0; i<data.size(); i++) {
				System.out.println(data.get(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}