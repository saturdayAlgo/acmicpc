package p11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		int[] costSet = new int[N];

		int result = 0;

		for (int i = 0; i < N; i++) {
			costSet[i] = Integer.parseInt(br.readLine());
		}

		for (int i = N - 1; i >= 0; i--) {
			result += K / costSet[i];
			K %= costSet[i];
		}

		System.out.println(result);
	}
}
