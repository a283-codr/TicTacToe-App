#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    srand(time(0)); // Seed for randomness

    int toss = rand() % 2; // 0 or 1
    char player1Symbol, player2Symbol;
    int currentPlayer;

    if (toss == 0) {
        currentPlayer = 1;
        player1Symbol = 'X';
        player2Symbol = 'O';
    } else {
        currentPlayer = 2;
        player2Symbol = 'X';
        player1Symbol = 'O';
    }

    cout << "Player " << currentPlayer << " starts the game." << endl;
    cout << "Player 1 Symbol: " << player1Symbol << endl;
    cout << "Player 2 Symbol: " << player2Symbol << endl;

    return 0;
}

void main() {
}