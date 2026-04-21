#include <iostream>
using namespace std;

// Method to validate move
bool isValidMove(int row, int col, char board[3][3]) {
    if (row >= 0 && row < 3 && col >= 0 && col < 3) {
        if (board[row][col] == '-') {
            return true;
        }
    }
    return false;
}

int main() {
    char board[3][3] = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    int row, col;
    cout << "Enter row (0-2): ";
    cin >> row;
    cout << "Enter column (0-2): ";
    cin >> col;

    if (isValidMove(row, col, board)) {
        cout << "Valid Move" << endl;
    } else {
        cout << "Invalid Move" << endl;
    }

    return 0;
}

void main() {
}