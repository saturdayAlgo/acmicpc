#include <iostream>
#include <algorithm>
#include <vector>

#define endl "\n"

using namespace std;

int func(int a, int b){
		if(a > b){
            return b;
        }
        else{
            return a;
        }
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

    int N;
    int dp[1000001] = {0, };

    cin >> N;
    dp[1] = 0;

    for(int i = 2; i <= N; i ++){
        dp[i] = dp[i-1] + 1;
        if(i % 2 == 0){
            dp[i] = func(dp[i], dp[i/2] + 1);
        }

        if(i % 3 == 0){
            dp[i] = func(dp[i], dp[i/3] + 1);
        }
    }
    
    cout << dp[N] << endl; 

}