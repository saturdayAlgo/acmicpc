#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <stack>
#include <functional>

#define endl "\n"
typedef long long ll;
using namespace std;

int n, m;
int max, cnt;
int pic[501][501];
int visited[501][501];

queue<int> q;

void func(int i, int j){
    visited[1][1] = 1;

    
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

    cin >> n >> m;

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            cin >> pic[i][j];
        }
    }

    
	
    return 0;
}