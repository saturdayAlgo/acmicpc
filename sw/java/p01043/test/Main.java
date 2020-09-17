package p01043.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
 *
테스트 케이스 1
7 5
2 1 7
3 1 2 3
2 2 4
2 5 6
2 4 3
1 7
 */
public class Main {
	static int[] parents;
	
//	private static boolean isSameParents(int a, int b) {
//		a = findParent(a);
//		b = findParent(b);
//		if(a==b) return true;
//		return false;
//	}

	private static int findParent(int A) {
		if(A == parents[A]) return A;
		return (parents[A] = findParent(parents[A]));
	}
	
	private static void union(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		parents[b] = a;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> knownList = new ArrayList<>();
		
		// 입력값 받음
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<K; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			knownList.add(tmp);
		}
		
		// List 배열 초기화
		for(int i=0; i<M; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int partyNum = Integer.parseInt(st.nextToken());
			
			for(int j=0; j<partyNum; j++) {
				int tgt = Integer.parseInt(st.nextToken());
				list.get(i).add(tgt);
			}
		}
		
		// 입력값 받기 끝
		
		parents = new int[N+1];
		for(int i=0; i<=N; i++) {
			parents[i] = i;
		}
		
		for(int i=0; i<M; i++) {
			int caseA = list.get(i).get(0);
			for(int j=1; j<list.get(i).size(); j++) {
				union(caseA, list.get(i).get(j));
			}
		}
		
		int result = M;
		for(ArrayList<Integer> data : list) {
			boolean canLie = true;
			for(int num : data) {
				if(!canLie) break;
				for(int tgt : knownList) {
					int a = findParent(num);
					int b = findParent(tgt);
					if(a==b) {
						canLie= false;
						break;
					}
				}
			}
			if(!canLie) {
				result--;
			}
		}
		System.out.println(result);
	}
}
