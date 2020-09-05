package p05567;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, HashSet<Integer>> list = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		for(int i=0; i<M; i++){
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			
			int source = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			
			if(list.containsKey(source)){
				list.get(source).add(target);
			} else {
				HashSet<Integer> set = new HashSet<>();
				set.add(target);
				list.put(source, set);
			}
			if(list.containsKey(target)){
				list.get(target).add(source);
			} else {
				HashSet<Integer> set = new HashSet<>();
				set.add(source);
				list.put(target, set);
			}
		}
		
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(1);
		int[] visited = new int[N+1];
		int result = 0;
		int[] level = new int[N+1];
		level[1] = 0;
		visited[1] = 1;
		
		while(!qu.isEmpty()){
			int tgt = qu.poll();
			
			if(list.containsKey(tgt) && level[tgt]<2){
				HashSet<Integer> set = list.get(tgt);
				for(int num : set){
					if(visited[num]!=1){
						qu.add(num);
						visited[num] = 1;
						result++;
						level[num] = level[tgt]+1;
					}
				}
				
			}
		}
		
		System.out.println(result);
	}
}
