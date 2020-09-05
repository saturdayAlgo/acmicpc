#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <stack>
#include <functional>

#define endl "\n"
typedef long long ll;
using namespace std;

int graph[1001][1001];
int visited[1001];
int N;

void bfs(int v){
    queue<int> q;
    visited[v] = 1;
    //시작점을 큐에넣고시작함
    q.push(v);

    while(!q.empty()){
        //큐에서 빼면서 시작
        v = q.front();
        q.pop();

        //방문했다고 출력
        cout << v << " ";

        for(int i=1; i<=N; i++){
            if(graph[v][i] && !visited[i]){
                q.push(i);
                visited[i] = 1;
            }
        }

    }
}

void dfs(int v){
    stack<int> s;
    //시작점 박고시작
    visited[v] = 1;


    while(!s.empty()){
        //스택에서 빼면서 시작
        v = s.top();
        s.pop();

        //방문했다고 출력
        cout << v << " ";

        for(int i=1; i<=N; i++){
            sort(graph[v][1001].begin(), graph[v][i].end(), greater<int>());
            if(graph[v][i] && !visited[i]){
                s.push(i);
                visited[i] = 1;
            }
        }

    }
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

    int M, V;

    cin >> N >> M >> V;

    for(int i=1; i<=M; i++){
        int a, b;
        cin >> a >> b;
        graph[a][b] =  1;
        graph[b][a] = 1;
    }

    dfs(V);
    cout << endl;
    fill_n(visited, 1001, 0);
    bfs(V);
    return 0;
}