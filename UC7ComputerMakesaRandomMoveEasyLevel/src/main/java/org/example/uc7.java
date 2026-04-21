#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

// Convert slot to row and column
void convertSlot(int slot, int &row, int &col) {
    row = (slot - 1) / 3;
    col = (slot - 1) % 3;
}

// Check if move is valid
bool isValidMove(int row, int col, char board[3][3]) {
    return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
}

// Update board
void updateBoard(char board[3][3], int row, int col, char symbol) {
    board[row][col] = symbol;
}

// Display board
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

    srand(time(0));
    int slot, row, col;

    // Computer makes a random valid move
    do {
        slot = rand() % 9 + 1; // 1–9
        convertSlot(slot, row, col);
    } while (!isValidMove(row, col, board));

    updateBoard(board, row, col, 'O');

    cout << "Computer chose slot: " << slot << endl;
    displayBoard(board);

    return 0;
}

void main() {
}