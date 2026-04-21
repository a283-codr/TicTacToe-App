#include <iostream>
using namespace std;

int main() {
    char board[3][3];

    // Initialize board with '-'
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            board[i][j] = '-';
        }
    }

    // Display board
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            cout << board[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}

void main() {
}

