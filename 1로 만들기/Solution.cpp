#include <iostream>
using namespace std;

int main() {
	int destination;
	cin >> destination;

	int* arr = new int[destination + 1];

	for (int i = 2; i <= destination; i++) {

		int min = arr[i - 1];

		if (i % 2 == 0) {
			if (arr[i / 2] < min)
				min = arr[i / 2];
		}
		if (i % 3 == 0) {
			if (arr[i / 3] < min)
				min = arr[i / 3];
		}
		arr[i] = min + 1;
	}

	cout << arr[destination] << " ";
}
