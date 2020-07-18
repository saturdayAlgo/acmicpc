#include<iostream>
#include<stack>
#include<string>

using namespace std;

int main(void){

	int cnt;
	
	cin >> cnt;

	for(int i=0; i<cnt; i++){
		string string;
		cin >> string;

		int size = string.length();
		stack<char> paren;

		for(int j=0; j<size; i++){
			char c = string[j];

			if(c == '(')
				paren.push(string[i]);
			else{
				if(paren.empty()){
					cout << "NO" << endl;
					break;
				}
				else
					paren.pop();
			}

		}
		if(paren.empty())
			cout << "YES" << endl;
		else
			cout << "NO" << endl;

	}

	return 0;
}
