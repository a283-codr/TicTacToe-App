#include <iostream>
using namespace std;

const int SIZE = 3;

// Function to check if board is full
bool isBoardFull(char board[SIZE][SIZE]) {
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            if (board[i][j] == ' ') {
                return false;
            }
        }
    }
    return true;
}

// Simple winner check (for completeness)
char checkWinner(char board[SIZE][SIZE]) {
    for (int i = 0; i < SIZE; i++) {
        if (board[i][0] == board[i][1] &&
                board[i][1] == board[i][2] &&
                board[i][0] != ' ') {
            return board[i][0];
        }
    }

    for (int j = 0; j < SIZE; j++) {
        if (board[0][j] == board[1][j] &&
                board[1][j] == board[2][j] &&
                board[0][j] != ' ') {
            return board[0][j];
        }
    }

    if (board[0][0] == board[1][1] &&
            board[1][1] == board[2][2] &&
            board[0][0] != ' ') {
        return board[0][0];
    }

    if (board[0][2] == board[1][1] &&
            board[1][1] == board[2][0] &&
            board[0][2] != ' ') {
        return board[0][2];
    }

    return ' ';
}

int main() {
    char board[SIZE][SIZE] = {
        {'X', 'O', 'X'},
        {'O', 'X', 'O'},
        {'O', 'X', 'O'}
    };

    char winner = checkWinner(board);

    bool isDraw = false;

    if ((winner != 'X' && winner != 'O') && isBoardFull(board)) {
        isDraw = true;
    }

    if (isDraw) {
        cout << "Game is a Draw!" << endl;
    } else if (winner == 'X' || winner == 'O') {
        cout << "Player " << winner << " wins!" << endl;
    } else {
        cout << "Game still in progress." << endl;
    }

    return 0;
}

void main() {
}