#include <iostream>
#include <algorithm>
#include <vector>

#define endl "\n"

using namespace std;

bool func(int a, int b){
		return a < b;
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

    int N;
    vector<int> quest;

    cin >> N;

    for(int i = 0; i < N; i++){
        int j;
        cin >> j;
        quest.push_back(j);
    }

    sort(quest.begin(), quest.end(), func);

    for(int i = 0; i < N; i++){
        cout << quest[i] << endl;
    }
}