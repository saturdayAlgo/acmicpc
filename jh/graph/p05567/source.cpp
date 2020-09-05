#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <stack>
#include <functional>

#define endl "\n"
typedef long long ll;
using namespace std;

int n;
int g[501][501];
int f[501];

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

	int m;

	cin >> n;
	cin >> m;

	for(int i=0; i<m; i++){
		int a, b;
		cin >> a >> b;

		g[a][b] = 1;
		g[b][a] = 1;

		if(a == 1){
			f[b] = 1;
		}		
	}

	for(int i=2; i<; i++){

	}

//1번이랑 연결되어있는애들 1로 바꾸고
//걔네들이랑 연결되어있는애들 1로 바꾼다음에
//1세면될거같은데 효율이..?
    return 0;
}