package prgrms.p42584;

import java.util.Stack;

class Solution {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> dataSet = new Stack<Integer>();
		
		for (int i=0; i<prices.length; i++) {
			for(int j=i+1; j<prices.length; j++) {
				answer[i]+=1;
				
				if(prices[i]>prices[j]) break;
			}
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		int[] resultSet = new Solution().solution(prices);
		for(int num : resultSet) {
			System.out.println(num);
		}
//		Arrays.asList(resultSet).stream().forEach(p->System.out.println(p.toString()));
	}
}
