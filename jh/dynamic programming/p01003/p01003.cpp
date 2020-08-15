#include <iostream>
#include <algorithm>
#include <vector>

#define endl "\n"

using namespace std;

void func(){
		
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

    int N;

    int dp[41] = {0, 1, 1};

    vector<int> quest;

    for(int i = 3; i < 41; i ++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    cin >> N;

    for(int i=0; i < N; i++){
        int num;
        cin >> num;
        quest.push_back(num);
    }

    for(int i=0; i<N; i++){
        if(quest[i] == 0){
            cout << "1 0" << endl;
        }
        else if(quest[i] == 1){
            cout << "0 1" << endl;
        }
        else{
            cout << dp[quest[i]-1] << " " << dp[quest[i]] << endl;
        }
    }
}