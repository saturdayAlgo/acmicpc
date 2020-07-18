package p01149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	int r,g,b;
	
	Node(int r, int g, int b){
		this.r = r;
		this.g = g;
		this.b = b;
	}
}
public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N = Integer.parseInt(br.readLine());
			Node result = new Node(0,0,0);
			
			for (int i=0; i<N; i++){
				String[] line = br.readLine().split(" ");
				Node nod = new Node(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]));
				Node tmp = new Node(result.r,result.g,result.b);
				result.r = Math.min(tmp.g, tmp.b)+nod.r;
				result.g = Math.min(tmp.r, tmp.b)+nod.g;
				result.b = Math.min(tmp.r, tmp.g)+nod.b;
			}
			
			System.out.println(Math.min(result.r, Math.min(result.g, result.b)));
			
		} catch (IOException e) {
		}
	}
}
