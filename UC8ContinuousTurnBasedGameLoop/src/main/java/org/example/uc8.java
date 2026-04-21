#include <iostream>
using namespace std;

// Display board
void displayBoard(char board[3][3]) {
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            cout << board[i][j] << " ";
        }
        cout << endl;
    }
}

// Check win
bool checkWin(char board[3][3], char symbol) {
    for(int i = 0; i < 3; i++) {
        if(board[i][0]==symbol && board[i][1]==symbol && board[i][2]==symbol)
            return true;
        if(board[0][i]==symbol && board[1][i]==symbol && board[2][i]==symbol)
            return true;
    }
    if(board[0][0]==symbol && board[1][1]==symbol && board[2][2]==symbol)
        return true;
    if(board[0][2]==symbol && board[1][1]==symbol && board[2][0]==symbol)
        return true;

    return false;
}

// Check draw
bool checkDraw(char board[3][3]) {
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            if(board[i][j] == '-')
                return false;
        }
    }
    return true;
}

int main() {
    char board[3][3] = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    int row, col;
    char currentPlayer = 'X';
    bool gameOver = false;

    while(!gameOver) {
        displayBoard(board);

        cout << "Player " << currentPlayer << " turn" << endl;
        cout << "Enter row (0-2) and column (0-2): ";
        cin >> row >> col;

        if(board[row][col] == '-') {
            board[row][col] = currentPlayer;

            if(checkWin(board, currentPlayer)) {
                displayBoard(board);
                cout << "Player " << currentPlayer << " wins!" << endl;
                gameOver = true;
            } else if(checkDraw(board)) {
                displayBoard(board);
                cout << "Game is a draw!" << endl;
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        } else {
            cout << "Invalid move, try again!" << endl;
        }
    }

    return 0;
}

void main() {
}