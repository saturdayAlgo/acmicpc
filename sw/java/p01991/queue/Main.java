package p01991.queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static Map<String, List<String>> list;
	static StringBuffer sb;
	static Queue<String> qu;
	static Stack<String> st;
	
	private static void preOrder(String str) {
		HashSet<String> visited = new HashSet<>();
		st = new Stack<String>();
		st.add(str);
		visited.add(str);
		
		while(!st.isEmpty()) {
			String tgt = st.pop();
			sb.append(tgt);
			String left = list.get(tgt).get(0);
			String right = list.get(tgt).get(1);
			
			if(!visited.contains(right) && !right.equals(".")) {
				st.add(right);
				visited.add(right);
			}
			if(!visited.contains(left) && !left.equals(".")) {
				st.add(left);
				visited.add(left);
			}
		}
	}
	
	private static void inOrder(String str) {
	}
	
	private static void postOrder(String str) {
		if(".".equals(str)) return;
		
		postOrder(list.get(str).get(0));
		postOrder(list.get(str).get(1));
		sb.append(str);
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		N = Integer.parseInt(br.readLine());
		sb = new StringBuffer();
		list = new HashMap<String, List<String>>();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String value = st.nextToken();
			List<String> childList = new ArrayList<String>();
			for(int j=0; j<2; j++) {
				childList.add(st.nextToken());
			}
			list.put(value, childList);
		}
		
		preOrder("A");
		sb.append("\n");
		inOrder("A");
		sb.append("\n");
		postOrder("A");
		System.out.println(sb);
	}
}
