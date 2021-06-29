/*
https://open.kattis.com/problems/r2
Category: 1.4a, I/O + Sequences Only
Hint: just print 2*S-R1
*/

#include <iostream>
using namespace std;
int main(){
    //mean is gotten by
    //(R1+R2)/2
    //in this problem, we have R1 and mean, but no R2
    int r1, mean;
    cin >> r1 >> mean;
    cout << 2 * mean - r1;
    return 0;   
}