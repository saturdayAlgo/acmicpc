#include<iostream>
using namespace std;

int main(){

	long a, b;
	long min, max;

	cin >> a;
	cin >> b;

	if(a > b){
		min = b;
		max = a;
	}

	else if(a < b){
		min = a;
		max = b;
	}
	else{
		cout << "0";
		return 0;
	}


	cout << max - min - 1 << '\n';

	for(int i = min+1; i <= max-1; i++){
		cout << i << " ";
	}

	return 0;
}
