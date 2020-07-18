#include<iostream>
#include<deque>
#include<string>

using namespace std;

int main(void){
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int n;

	cin >> n; //갯수입력
	
	deque<int> dq;
	int rst, num;

	for(int i=0; i<n; i++){
		string op;

		cin >> op;

		if(op == "push_front"){
			cin >> num;
			dq.push_front(num);

		}
		else if(op == "push_back"){
			cin >> num;
			dq.push_back(num);
		}
		else if(op == "pop_front"){
			if(dq.size() == 0)
				rst = -1;
			else{
				rst = dq.front();
				dq.pop_front();
			}

			cout << rst << endl;
		}
		else if(op == "pop_back"){
			if(dq.size() == 0)
				rst = -1;
			else{
				rst = dq.back();
				dq.pop_back();
			}

			cout << rst << endl;
		}
		else if(op == "size"){
			rst = dq.size();
			
			cout << rst << endl;
		}
		else if(op == "empty"){
			if(dq.size() == 0)
				rst = 1;
			else
				rst = 0;
			
			cout << rst << endl;

		}
		else if(op == "front"){
			if(dq.size() == 0)
				rst = -1;
			else
				rst = dq.front();
			
			cout << rst << endl;

		}
		else if(op == "back"){
			if(dq.size() == 0)
				rst = -1;
			else
				rst = dq.back();

			cout << rst << endl;
		}
	}


	return 0;
}
