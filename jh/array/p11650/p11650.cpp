#include <iostream>
#include <algorithm>
#include <vector>

#define endl "\n"

using namespace std;

bool func(pair<int, int> a, pair<int, int> b){
    if(a.first == b.first){
        return a.second < b.second;
    }else{
		return a.first < b.first;
    }
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

    int N;
    vector<pair<int, int> > quest;

    cin >> N;

    for(int i = 0; i < N; i++){
        pair<int, int> input;
        cin >> input.first >> input.second;
        quest.push_back(input);
    }

    sort(quest.begin(), quest.end(), func);

    for(int i = 0; i < N; i++){
        cout << quest[i].first << " " << quest[i].second << endl;
    }
}