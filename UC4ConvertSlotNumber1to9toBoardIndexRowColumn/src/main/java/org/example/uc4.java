#include <iostream>
using namespace std;

// Method to convert slot to row and column
void convertSlot(int slot, int &row, int &col) {
    row = (slot - 1) / 3;
    col = (slot - 1) % 3;
}

int main() {
    int slot, row, col;

    cout << "Enter slot number (1-9): ";
    cin >> slot;

    convertSlot(slot, row, col);

    cout << "Row: " << row << endl;
    cout << "Column: " << col << endl;

    return 0;
}

void main() {
}