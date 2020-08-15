#include<iostream>
#include<string>

using namespace std;

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

	int a,b,c;
	long rst = 1;

	cin >> a >> b >> c;

	for(int i=0; i<b; i++){
		rst *= a;
	}

	rst = rst%c;

	cout << rst << endl;
}
