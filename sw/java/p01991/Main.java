package p01991;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
	String value;
	Node left;
	Node right;
	
	Node(String value, Node left, Node right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String value = st.nextToken();
			
		}
	}
}
