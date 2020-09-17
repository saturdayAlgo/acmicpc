package p05214;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Integer>> dummyAddedList = new ArrayList<>();
		
		//0~14
		for (int i = 0; i <= N + M; i++) {
			dummyAddedList.add(new ArrayList<>());
		}

		// 1~9		->	각 역의 인접 리스트
		// 10~14	->	각 하이퍼튜브의 인접리스트
		
		// 1 2 3
		// i = 1, dummyLink = 10
		// dummyAddedList.get(1~3).add(10)
		for (int i = 1; i <= M; i++) {
			int dummyLink = N + i;
			st = new StringTokenizer(br.readLine(), " ");

			for (int j = 0; j < K; j++) {
				int tgt = Integer.parseInt(st.nextToken());
				dummyAddedList.get(tgt).add(dummyLink);
				dummyAddedList.get(dummyLink).add(tgt);
			}

		}

		boolean[] visited = new boolean[N + M + 1];
		Arrays.fill(visited, false);
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(1);
		int[] cnt = new int[N + M + 1];
		cnt[1] = 1;
		visited[1] = true;

		while (!qu.isEmpty()) {
			int tmp = qu.poll();
			
			if(tmp==N){
				break;
			}
			ArrayList<Integer> set = dummyAddedList.get(tmp);
			for (int num : set) {
				if (!visited[num]) {
					
					qu.add(num);
					visited[num] = true;
					cnt[num] = tmp>N?cnt[tmp]+1:cnt[tmp];
				}
			}
		}
		System.out.println(visited[N]?cnt[N]:-1);
	}
}
