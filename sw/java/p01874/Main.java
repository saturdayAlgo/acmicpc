package p01874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> inputList = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			inputList.add(Integer.parseInt(br.readLine()));
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			stack.push(i);
			sb.append("+\n");

			while (!stack.isEmpty() && !inputList.isEmpty() && stack.peek().equals(inputList.get(0))) {
				stack.pop();
				inputList.remove(0);
				sb.append("-\n");
			}
		}
		
		if(!stack.isEmpty()) {
			sb.setLength(0);
			sb.append("NO\n");
		}
		System.out.print(sb.toString());
	}
}