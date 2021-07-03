/*
https://open.kattis.com/problems/judgingmoose
Category: 1.4c, Selection Only
Hint: if-else if-else; 3 cases
*/
#include <iostream>
using namespace std;

int main(){
    int l,r;
    cin >> l >> r;
    if(l + r == 0){
        cout << "Not a moose";
    } else if (l == r){
        cout << "Even " << max(l,r) * 2;
    } else {
        cout << "Odd " << max(l,r) * 2;
    }
    return 0;
}
