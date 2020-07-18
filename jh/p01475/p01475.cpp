#include<iostream>
#include<cstdlib>
#include<cmath>
#include<algorithm>

using namespace std;

int main(){

	ios_base::sync_with_stdio(0);
	cin.tie(0);
 	cout.tie(0);

	//다솜이이쁘다
	//은진이이쁘다

	string roomnum;

	int set[10] = {0, };
	
	int i;
	
	int avg, max;

	cin >> roomnum;

	for(i = 0; i < roomnum.length(); i++){
		cout << atoi(roomnum.at(i));
		set[atoi(roomnum.at(i))] += 1;
	}
	
	max = max_element(set, 10);
	avg = (int)ceil((set[6] + set[9])/2);


	if(max >= avg)
		cout << max;

	else
		cout << avg;

	return 0;
}
