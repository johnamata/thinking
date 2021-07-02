/*
https://open.kattis.com/problems/jumbojavelin
Category: 1.4b, Repetition Only
Hint: sum and offset by (N-1)
*/

#include <iostream>

using namespace std;

int main(){
    int N=0, i = 0, l=0, length = 0;
    cin >> N;
    while (i < N){
        cin >> l;
        length += l;
        i++;
    }
    cout << length - i + 1;
    return 0;
}