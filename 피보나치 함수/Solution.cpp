#include <iostream>
using namespace std;

int main() {
	int cases;
	cin >> cases;

	for (int i = 0; i < cases; i++) {
		int n;
		cin >> n;

		int zeroCnt[100] = { 0 };
		int oneCnt[100] = { 0 };

		for (int j = 0; j <= n; j++) {
			if (j == 0) {
				zeroCnt[j] = 1;
				oneCnt[j] = 0;
			}
			else if (j == 1) {
				zeroCnt[j] = 0;
				oneCnt[j] = 1;
			}
			else {
				zeroCnt[j] = zeroCnt[j - 1] + zeroCnt[j - 2];
				oneCnt[j] = oneCnt[j - 1] + oneCnt[j - 2];
			}
		}
		cout << zeroCnt[n] << " " << oneCnt[n] << endl;
	}
}
