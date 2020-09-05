#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <stack>
#include <functional>

#define endl "\n"
typedef long long ll;
using namespace std;

queue<int> q;
vector<vector<int>> tube;
int visited[1000];
vector<int> station;

int bfs(){
	//시작점
	q.push(1);
	visited[1] = 1;

	while(!q.empty()){
		int v = q.front();
		q.pop();

		for(int i=1; i<=tube.size(); i++){
            int n = 
        }
	}
	
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

	int n, k, m;

	cin >> m >> k >> m;

	int sta[9];

	for(int i=0; i<m; i++){
		
		vector<int> row;
		
		for(int j=0; j<k; j++){
			int a;
			cin >> a;
			row.push_back(a);
		}

		for(int j=0; j<k; j++){
			if(j == k){
				continue;
			}
			else{
				station[row[j]].push_back(row[k]);
			}
		}

		tube.push_back(row);
	}


	
    return 0;
}