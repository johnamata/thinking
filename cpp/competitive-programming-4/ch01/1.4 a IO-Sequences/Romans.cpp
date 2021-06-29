/*
https://open.kattis.com/problems/romans
Category: 1.4a, I/O + Sequences Only
Hint: just print round(X * 1087.7626)
*/

#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    double x;
    cin >> x;
    /*
    we get 1087.7626 because from the problem description
    "Therefore a distance of X English miles would correspond to 1000*(5280/4854) Roman paces."
    */
   //i failed last test case with just
   //round(x * 1087.7626);
   //had to (int)
    cout << (int) round(x * 1087.7626);
    return 0;
}