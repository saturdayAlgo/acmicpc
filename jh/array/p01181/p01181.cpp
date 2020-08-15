#include <iostream>
#include <algorithm>
#include <vector>

#define endl "\n"

using namespace std;

bool func(string a, string b){
    if(a.size() == b.size()){
		return a < b;
	}
	else{
		return a.size() < b.size();
	}
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

	vector<string> quest;
	int N;

	cin >> N;

	for(int i = 0; i < N; i++){
		string str;
		cin >> str;
		quest.push_back(str);
	}
	
	sort(quest.begin(), quest.end(), func);

	string tmp;
	for(int i = 0; i < N; i++){
		if(quest[i] != tmp){
			cout << quest[i] << endl;
		}
		tmp = quest[i];
	}

    
}