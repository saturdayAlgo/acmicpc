#include<iostream>
#include<vector>

#define endl "\n"

using namespace std;

int N,M;
int arr[8];
bool visited[8];

void func(int cnt){
	if(cnt == M){
		for(int i=0; i<M; i++){
			cout << arr[i] << " ";
		}
		cout << endl;
		return;
	}

	for(int i=1; i<=N; i++){
		if(!visited[i]){
			visited[i] = true;
			arr[cnt] = i;
			func(cnt+1);
			visited[i] = false;
		}
	}
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);


	cin >> N >> M;

	func(0);			

	return 0;
}
