package p10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
//	public static void main(String[] args){
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N;
//		int[] dataSet;
//		int tail=-1;
//		String space = "\n";
//		StringBuilder sb = new StringBuilder();
//		try {
//			N = Integer.parseInt(br.readLine());
//			dataSet = new int[N];
//			while(N-->0){
//				String[] line = br.readLine().split(" ");
//				
//				if(line[0].equals("push_back")){
//					dataSet[++tail] = Integer.parseInt(line[1]);
//				}else if(line[0].equals("push_front")){
//					for(int i=0; i<=tail; i++)dataSet[i+1] = dataSet[i]; 
//					tail++;
//					dataSet[0] = Integer.parseInt(line[1]);
//				}else if(line[0].equals("pop_front")){
//					if(tail>=0) {
//						sb.append(dataSet[0]).append(space);
//						for(int i=0; i<tail; i++){
//							dataSet[i] = dataSet[i+1];
//						}
//						tail--;
//					}else sb.append(-1).append(space);
//				}else if(line[0].equals("pop_back")){
//					if(tail>=0){
//						sb.append(dataSet[tail]).append(space);
//						dataSet[tail] = 0;
//						tail--;
//					}else sb.append(-1).append(space);
//				}else if(line[0].equals("size")){
//					if(tail>-1)sb.append(tail+1).append(space);
//					else sb.append(0).append(space);
//				}else if(line[0].equals("empty")){
//					if(tail>-1)sb.append(0).append(space);
//					else sb.append(1).append(space);
//				}else if(line[0].equals("front")){
//					if(tail>-1)sb.append(dataSet[0]).append(space);
//					else sb.append(-1).append(space);
//				}else if(line[0].equals("back")){
//					if(tail>-1)sb.append(dataSet[tail]).append(space);
//					else sb.append(tail).append(space);
//				}
//			}
//			System.out.print(sb.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String space = "\n";
		StringBuilder sb = new StringBuilder();
		int N;
		try {
			N = Integer.parseInt(br.readLine());
			
			while(N-->0) {
				String[] line = br.readLine().split(" ");
				if(line[0].equals("push_back")){
					deque.addLast(Integer.parseInt(line[1]));
				}else if(line[0].equals("push_front")){
					deque.addFirst(Integer.parseInt(line[1]));
				}else if(line[0].equals("pop_front")){
					sb.append(deque.isEmpty()?-1:deque.pollFirst()).append(space);
				}else if(line[0].equals("pop_back")){
					sb.append(deque.isEmpty()?-1:deque.pollLast()).append(space);
				}else if(line[0].equals("size")){
					sb.append(deque.size()).append(space);
				}else if(line[0].equals("empty")){
					sb.append(deque.isEmpty()?1:0).append(space);
				}else if(line[0].equals("front")){
					sb.append(deque.isEmpty()?-1:deque.peekFirst()).append(space);
				}else if(line[0].equals("back")){
					sb.append(deque.isEmpty()?-1:deque.peekLast()).append(space);
				}
			}
			
			System.out.print(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
