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

    int size_a, size_b;
    vector<int> a;
    vector<int> b;
    vector<int> result;

    cin >> size_a >> size_b;

    for(int i = 0; i < size_a; i++){
        int k;
        cin >> k;
        a.push_back(k);
    }

    for(int i = 0; i < size_b; i++){
        int k;
        cin >> k;
        b.push_back(k);
    }
    a.insert(a.end(), b.begin(), b.end());

    sort(a.begin(), a.end(), func);

    for(int i = 0; i < size_a + size_b; i++){
        cout << a[i] << " ";
        
    }
}