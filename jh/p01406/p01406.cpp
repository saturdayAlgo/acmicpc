#include<iostream>
using namespace std;

int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	string txt;
	string a;
	
	string s;

	int cnt, cur;
	int i = 0;

	cin >> txt;

	cur = txt.length();

	cin >> cnt; 
	
	for(i = 0; i < cnt; i++){
		cin >> a;

		if(a == "L"){
			if(cur != 0)
				cur -= 1;	
		}
		else if(a == "D"){
			if(cur != txt.length())
				cur += 1;
		}
		else if(a == "B"){
			if(cur != 0){
				txt.erase(cur-1, 1);
				cur -= 1;
			}
		}
		else if(a == "P"){
			cin >> s;
			txt.insert(cur, s);
			cur += 1;
		}
	}
	
	cout << txt << '\n';

	return 0;
}
