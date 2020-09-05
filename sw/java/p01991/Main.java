package p01991;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static Map<String, List<String>> list;
	static StringBuffer sb;
	
	private static void preOrder(String str) {
		if(".".equals(str)) return;
		
		sb.append(str);
		preOrder(list.get(str).get(0));
		preOrder(list.get(str).get(1));
	}
	
	private static void inOrder(String str) {
		if(".".equals(str)) return;
		
		inOrder(list.get(str).get(0));
		sb.append(str);
		inOrder(list.get(str).get(1));
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
