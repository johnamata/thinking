/*
https://open.kattis.com/problems/timeloop
Category: 1.4b, Repetition Only
Hint: just print 'num Abracadabra' N times
*/

#include <iostream>

using namespace std;

int main(){
    int n, i =1;
    cin >> n;
    while(i <= n){
        /*
        i tried to do 
        cout << i + " Abracadabra" << endl;
        but it gave me the following error

        warning: adding 'int' to a string does not append to the
      string [-Wstring-plus-int]
        cout << i + " Abracadabra"
        */
        cout << i << " Abracadabra" << endl;
        i++;
    }

    return 0;
}