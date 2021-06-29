/*
https://open.kattis.com/problems/faktor
Category: 1.4a, I/O + Sequences Only
Hint: just print (I-1)*A+1
*/
#include <iostream>
using namespace std;
int main(){
    int a, i;
    cin >> a >> i;
    cout << (i-1)*a+1;
    return 0;   
}