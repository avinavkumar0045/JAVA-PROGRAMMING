#include <iostream>
#include <vector>
#include <ctime>   // for clock()
using namespace std;

/* Bubble Sort */
void bubbleSort(vector<int> arr) {
    clock_t start = clock();

    int n = arr.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
            }
        }
    }

    clock_t end = clock();

    cout << "\nSorted Array (Bubble Sort):\n";
    for (int x : arr)
        cout << x << " ";
    
    double cpuTime = double(end - start) / CLOCKS_PER_SEC;
    cout << "\nCPU Time (Bubble Sort): " << cpuTime << " seconds\n";
}

/* Insertion Sort */
void insertionSort(vector<int> arr) {
    clock_t start = clock();

    int n = arr.size();
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    clock_t end = clock();

    cout << "\nSorted Array (Insertion Sort):\n";
    for (int x : arr)
        cout << x << " ";

    double cpuTime = double(end - start) / CLOCKS_PER_SEC;
    cout << "\nCPU Time (Insertion Sort): " << cpuTime << " seconds\n";
}

/* Main Menu */
int main() {
    int n;
    cout << "Enter number of elements (n >= 10000): ";
    cin >> n;

    if (n < 10000) {
        cout << "Error: n must be at least 10000\n";
        return 0;
    }

    vector<int> data(n);
    cout << "Enter " << n << " integers:\n";
    for (int i = 0; i < n; i++)
        cin >> data[i];

    int choice;
    do {
        cout << "\n--- MENU ---\n";
        cout << "1. Bubble Sort\n";
        cout << "2. Insertion Sort\n";
        cout << "3. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                bubbleSort(data);
                break;

            case 2:
                insertionSort(data);
                break;

            case 3:
                cout << "Exiting program...\n";
                break;

            default:
                cout << "Invalid choice!\n";
        }
    } while (choice != 3);

    return 0;
}
