package p01926;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node{
	int x, y;
	public Node(int x, int y) {
		this.x = x; this.y = y;
	}
	@Override
	public String toString() {
		return "Node [x=" + x + ", y=" + y + "]";
	}
}
public class Main {
	public static void main(String[] args) {
		final int direction[][] = {{0,1}, {0,-1}, {1,0}, {-1,0}};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int visited[][];
		int data[][];
		try {
			String[] line = br.readLine().split(" ");
			
			int N, M;
			N = Integer.parseInt(line[0]);
			M = Integer.parseInt(line[1]);
			
			data = new int[N][M];
			visited = new int[N][M];
			
			Queue<Node> qu = new LinkedList<Node>(); 
			for(int i=0; i<N; i++) {
				line = br.readLine().split(" ");
				for(int j=0; j<M; j++) {
					data[i][j] = Integer.parseInt(line[j]);
				}
			}
			int maxResult = 0;
			int link = 0;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(data[i][j]==1 && visited[i][j] == 0) {
						qu.add(new Node(i,j));
						visited[i][j]++;
						
						int tmpRes = 0;
						while(!qu.isEmpty()) {
							Node target = qu.poll();
							tmpRes++;
							for(int x = 0; x<4; x++) {
								int nX = target.x+direction[x][0];
								int nY = target.y+direction[x][1];
								
								if(nX>=0 && nY>=0 && nX<N && nY<M && visited[nX][nY]<=0 && data[nX][nY]>0) {
									qu.add(new Node(nX, nY));
									visited[nX][nY]++;
								}
							}
						}
						
						maxResult = maxResult<tmpRes?tmpRes:maxResult;
						link = tmpRes>0?link+1:link;
					}
				}
			}
			
			System.out.println(link);
			System.out.println(maxResult);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
