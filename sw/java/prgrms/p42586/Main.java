package prgrms.p42586;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		List<Integer> answerSet = new ArrayList<Integer>();
		Queue<Integer> test = new LinkedList<Integer>();
		for(int i=0; i<progresses.length; i++) {
			test.add(i);
		}
		
		while(!test.isEmpty()) {
			for(int i=0; i<progresses.length; i++) {
				progresses[i]+=speeds[i];
			}
			int tmpResult = 0;
			while(!test.isEmpty() && progresses[test.peek()]>=100) {
				test.poll();
				tmpResult+=1;
				
			}
			if(tmpResult!=0)answerSet.add(tmpResult);
		}
		
		answer = answerSet.stream().mapToInt(i->i).toArray();
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] result = new Solution().solution(progresses, speeds);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

/*
 * {93, 30, 55} {1, 30, 5} {2, 1} 
 * {95, 90, 99, 99, 80, 99} {1, 1, 1, 1, 1, 1} {1, 3, 2}
 */