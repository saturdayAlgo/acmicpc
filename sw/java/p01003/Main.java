package p01003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
	int zeroCnt;
	int oneCnt;
	
	public Node(int zeroCnt, int oneCnt){
		this.zeroCnt = zeroCnt;
		this.oneCnt  = oneCnt;
	}
}
public class Main {
	public static void main(String[] args){
		Node[] data = new Node[41];
		data[0] = new Node(1, 0);
		data[1] = new Node(0, 1);
		
		for(int i=2; i<41; i++){
			data[i] = new Node(data[i-1].zeroCnt+data[i-2].zeroCnt, data[i-1].oneCnt + data[i-2].oneCnt);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		try {
			int T = Integer.parseInt(br.readLine());
			
			for (int i=0; i<T; i++){
				int N = Integer.parseInt(br.readLine());
				sb.append(data[N].zeroCnt).append(" ").append(data[N].oneCnt).append("\n");
			}
			
			System.out.print(sb.toString());
		} catch (IOException e) {
		}
	}
}
