#include<iostream>
#include<queue>
#include<string>

using namespace std;

int main(void){
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int n;

	cin >> n; //갯수입력
	
	queue<int> q;
	int num;

	for(int i=0; i<n; i++){
		string op;

		cin >> op;

		if(op == "push"){
			int data;
			cin >> data;
			q.push(data);
		}
		else if(op == "pop"){
			if(q.size() != 0){
				num = q.front();
				q.pop();
			}
			else{
				num = -1;
			}
			cout << num << endl;
		}
		else if(op == "size"){
			cout << q.size() << endl;
		}
		else if(op == "empty"){
			if(q.size() == 0){
				num = 1;
			}
			else{
				num = 0;
			}
			cout << num << endl;
		}
		else if(op == "front"){
			if(q.size() == 0){
				num = -1;
			}
			else{
				num = q.front();
			}
			cout << num << endl;
		}
		else if(op == "back"){
			if(q.size() == 0){
				num = -1;
			}
			else{
				num = q.back();
			}
			cout << num << endl;

		}
	}


	return 0;
}
