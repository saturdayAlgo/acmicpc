#include <iostream>
#include <algorithm>
#include <vector>

#define endl "\n"
typedef long long ll;
using namespace std;

void func(){
}

int main(void){
	ios::sync_with_stdio(false);
	cin.tie(0);

    int N, K;
    ll dp[201][201];

    cin >> N >> K;

    //1이 나오려면 무조건 지혼자만 더해야함...쓰바..
    for(int i = 1; i <= N; i++){
        dp[1][i] = 1;
    }

    //점화식 개어렵네...
    for(int i = 1; i <= K; i ++){
        for(int j = 2; j <= N; j++){
            for(int m = 0; m <= j; m++){
                dp[i][j] += dp[i-1][j];
            }
            dp[K][N] = dp[K][N] % 1000000000;
        }
    }
    
    cout << dp[K][N] << endl; 

}