package p10026.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Point{
	int x, y;
	Point(int x, int y){
		this.x = x;this.y = y;
	}
}

public class Main {
	static int[][] dir = {{-1,0},{1,0}, {0,-1}, {0,1}};
	static char[][] map;
	static int[][] visited;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			for(int j=0; j<N; j++) {
				map[i][j] = line.charAt(j);
			}
		}
		
		visited = new int[N][N];
		
		int result = 0;
		for(int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				Queue<Point> qu = new LinkedList<Point>();
				if(visited[i][j] == 0) {
					qu.add(new Point(i,j));
					visited[i][j]++;
					result++;
				}
				while(!qu.isEmpty()) {
					Point tgt = qu.poll();
					for(int k=0; k<4; k++) {
						int nextX = tgt.x + dir[k][0];
						int nextY = tgt.y + dir[k][1];
						
						if(nextX<N && nextY<N && nextX>=0 && nextY>=0 && visited[nextX][nextY]==0 && map[tgt.x][tgt.y]==map[nextX][nextY]) {
							qu.add(new Point(nextX, nextY));
							visited[nextX][nextY]++;
						}
					}
				}
			}
		}
		System.out.print(result+" ");
		
		visited = new int[N][N];
		
		result = 0;
		for(int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				Queue<Point> qu = new LinkedList<Point>();
				if(visited[i][j] == 0) {
					qu.add(new Point(i,j));
					visited[i][j]++;
					result++;
				}
				while(!qu.isEmpty()) {
					Point tgt = qu.poll();
					for(int k=0; k<4; k++) {
						int nextX = tgt.x + dir[k][0];
						int nextY = tgt.y + dir[k][1];
						if(nextX<N && nextY<N && nextX>=0 && nextY>=0 && visited[nextX][nextY]==0) {
							boolean nextChk = false;
							if(map[tgt.x][tgt.y]=='R' || map[tgt.x][tgt.y]=='G' ) {
								if(map[nextX][nextY]=='R' || map[nextX][nextY]=='G') {
									nextChk = true;
								}
							} else if(map[tgt.x][tgt.y]==map[nextX][nextY]){
								nextChk = true;
							}
							if(nextChk) {
								qu.add(new Point(nextX, nextY));
								visited[nextX][nextY]++;
							}
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}
