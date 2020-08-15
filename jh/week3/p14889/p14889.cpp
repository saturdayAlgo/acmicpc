#include<iostream>

using namespace std;

int n, m;

void func(int* arr, bool* issused, int k){
	if(k == m){
		for(int i = 0; i < m; i++)
			cout << arr[i] + 1 << ' ';
		cout << '\n';
		return;
	}

	for(int i=0; i<n; i++){
		if(!issused[i]){
			arr[k]=i;
			issused[i] = 1;
			func(arr, issused, k+1);
			issused[i] = 0;
		}
	}
}
int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

	cin >> n >> m;
	int arr[m] = {0, };
	bool issused[n] = {0, };
	func(arr, issused, 0);

	return 0;
}
