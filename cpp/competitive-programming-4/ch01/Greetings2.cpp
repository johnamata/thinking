/*
https://open.kattis.com/problems/greetings2
Category: 1.4a, I/O + Sequences Only
Hint: just reprint the input as requested
*/
#include <iostream>
using namespace std;
int main(){
    string s;
    int count;
    cin >> s;
    cout << "h";
    //there's probably a C++ inbuilt function the solution cleaner
    //but as of now, this is the current state of my C++ knowledge lmao, i actually just learned about .length() thanks to this question
    for(int i = 1; i < s.length() - 1; i++) cout << "e";
    for(int i = 1; i < s.length() - 1; i++) cout << "e";
    cout << "y";
    return 0;   
}