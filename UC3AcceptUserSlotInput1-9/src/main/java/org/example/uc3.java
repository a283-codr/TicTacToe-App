#include <iostream>
using namespace std;

// Method to get user input
int getSlot() {
    int slot;
    cout << "Enter slot number (1-9): ";
    cin >> slot;
    return slot;
}

int main() {
    int chosenSlot = getSlot();
    cout << "You selected slot: " << chosenSlot << endl;
    return 0;
}

void main() {
}