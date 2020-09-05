#include <iostream>
#include <algorithm>
#include <vector>

#define endl "\n"

using namespace std;


void func(vector<int> a, vector<int> b){
	
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

    int N;

    vector<vector<int>> quest;

    cin >> N;

    for(int i=0; i < N; i++){
        int r, g, b;
        vector<int> rgb;
        cin >> r >> g >> b;
        rgb.push_back(r);
        rgb.push_back(g);
        rgb.push_back(b);
        quest.push_back(rgb);
    }

    for(int i=0; i< N; i++){
        
        if(N == 1){
            int tmp = min_element(quest[i].begin(), quest[i.end()]);
            cout << min(quest[i].begin(), quest[i].end()) << endl;
        }
        else{

        }
        
    }
}