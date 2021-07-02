/*
https://open.kattis.com/problems/qaly
Category: 1.4b, Repetition Only
Hint: trivial loop
*/

#include <iostream>

using namespace std;

int main(){
    int n;
    double q1, q2, qaly;
    cin >> n;
    int i;
    while (i < n){
        cin >> q1 >> q2;
        qaly += q1 * q2;
        i++;
    }
    cout << qaly;
    return 0;
}