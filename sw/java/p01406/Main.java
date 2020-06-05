package p01406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		try {
			String str = br.readLine();

			for(int i=0; i<str.length(); i++) {
				left.push(str.charAt(i));
			}
			
			int N = Integer.parseInt(br.readLine());
			
			for(int i=0; i<N; i++) {
				String[] cmd = br.readLine().split(" ");
				
				if(cmd[0].equals("L")) {
					if(!left.isEmpty()) {
						right.push(left.pop());
					}
				}
				else if(cmd[0].equals("D")) {
					if(!right.isEmpty()) {
						left.push(right.pop());
					}
				}else if(cmd[0].equals("B")) {
					if(!left.isEmpty()) {
						left.pop();
					}
				} else if(cmd[0].equals("P")) {
					left.push(cmd[1].charAt(0));
				}
				
			}
			
			while(!left.isEmpty()) {
				right.push(left.pop());
			}
			while(!right.isEmpty()) {
				sb.append(right.pop());
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
