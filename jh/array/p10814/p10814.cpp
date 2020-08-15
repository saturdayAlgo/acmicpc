#include <iostream>
#include <algorithm>
#include <vector>

#define endl "\n"

using namespace std;

bool func(pair<int, string> a, pair<int, string> b){
		return a.first < b.first;
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

    int N;
    vector<pair<int, string> > quest;

    cin >> N;

    for(int i = 0; i < N; i++){
        pair<int, string> input;
        cin >> input.first >> input.second;
        quest.push_back(input);
    }

    sort(quest.begin(), quest.end(), func);

    for(int i = 0; i < N; i++){
        cout << quest[i].first << " " << quest[i].second << endl;
    }
}