/*
https://open.kattis.com/problems/isithalloween
Category: 1.4c, Selection Only
Hint: if-else; 2 cases
*/

#include <iostream>

using namespace std;

int main(){
    string s;
    //because cin stops at empty space
    getline(cin, s);
    if(s == "OCT 31" || s == "DEC 25"){
        cout << "yup";
    } else {
        cout << "nope";
    }
    return 0;
}
