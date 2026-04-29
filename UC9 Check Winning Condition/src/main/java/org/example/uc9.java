#include <iostream>
using namespace std;

const int SIZE = 3;

// Function to check winner
char checkWinner(char board[SIZE][SIZE]) {

    // Check rows
    for (int i = 0; i < SIZE; i++) {
        if (board[i][0] == board[i][1] &&
                board[i][1] == board[i][2] &&
                board[i][0] != ' ') {
            return board[i][0];
        }
    }

    // Check columns
    for (int j = 0; j < SIZE; j++) {
        if (board[0][j] == board[1][j] &&
                board[1][j] == board[2][j] &&
                board[0][j] != ' ') {
            return board[0][j];
        }
    }

    // Check main diagonal
    if (board[0][0] == board[1][1] &&
            board[1][1] == board[2][2] &&
            board[0][0] != ' ') {
        return board[0][0];
    }

    // Check secondary diagonal
    if (board[0][2] == board[1][1] &&
            board[1][1] == board[2][0] &&
            board[0][2] != ' ') {
        return board[0][2];
    }

    return ' '; // No winner
}

int main() {
    char board[SIZE][SIZE] = {
        {'X', 'O', 'X'},
        {'O', 'X', 'O'},
        {'O', 'X', 'X'}
    };

    char winner = checkWinner(board);

    if (winner == 'X' || winner == 'O') {
        cout << "Player " << winner << " wins!" << endl;
    } else {
        cout << "No winner yet." << endl;
    }

    return 0;
}

void main() {
}