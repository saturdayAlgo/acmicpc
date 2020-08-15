package p01927;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		try {
			int N = Integer.parseInt(br.readLine());
			Queue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());
			
			for (int i = 0; i < N; i++) {
				int tgt = Integer.parseInt(br.readLine());

				if (tgt != 0) {
					queue.add(tgt);
				} else {
					if (queue.isEmpty()) {
						sb.append(0).append("\n");
					} else {
						sb.append(queue.poll()).append("\n");
					}
				}
			}
			System.out.println(sb);
		} catch (IOException e) {
		}
	}
}
