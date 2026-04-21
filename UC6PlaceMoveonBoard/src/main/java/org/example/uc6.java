#include <iostream>
using namespace std;

// Method to update the board
void updateBoard(char board[3][3], int row, int col, char symbol) {
    board[row][col] = symbol;
}

// Method to display the board
void displayBoard(char board[3][3]) {
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            cout << board[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    char board[3][3] = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    int row = 1, col = 1;
    char symbol = 'X';

    updateBoard(board, row, col, symbol);

    cout << "Updated Board:" << endl;
    displayBoard(board);

    return 0;
}

void main() {
}