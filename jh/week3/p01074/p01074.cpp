#include<iostream>

using namespace std;

int m, r, c;
int x, y, rst;

void search(int x, int y, int n){
	if(x == r && y == c){
		cout << rst << '\n' << endl;
		return;
	}

	if(r < x + n && r >= x && c < y + n && c >= y){
		search(x, y, n/2);
		search(x, y+n/2, n/2);
		search(x+n/2, y, n/2);
		search(x+n/2, y+n/2, n/2);
	}

	else rst += n*n;
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

	cin >> m >> r >> c;
	search(0,0,(1<< m));

	return 0;
}
