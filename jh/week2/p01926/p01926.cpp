#include<iostream>
#include<string>
#include<queue>
#include<algorithm>

using namespace std;

int pic[500][501];
bool visit[500][500] = {0, };

int r, c;

int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int cnt = 0;
int k = 0;

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);
	queue<pair<int, int> > q;

	cin >> r >> c;

	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
			cin >> pic[i][j];
		}
	}

	for(int i=0; i<r;i++){
		for(int j=0; j<c; j++){
			if(pic[i][j] == 1 && visit[i][j] == 0){
				cnt++;
				visit[i][j] = 1;

				q.push({ i,j });
				int a=0;
				while(!q.empty()){
					a++;
					pair<int, int> cur = q.front();
					q.pop();

					for(int i=0; i<4; i++){
						int nx = cur.first + dx[i];
						int ny = cur.second + dy[i];

						if(nx < 0 || nx >= r || ny < 0 || ny >= c)
							continue;
						if(visit[nx][ny] == 1 || pic[nx][ny] != 1)
							continue;

						visit[nx][ny] = 1;

						q.push({ nx, ny });
					}
				}
				k = max(k, a);
			}
		}
	}
	cout << cnt << '\n' << k;
}
