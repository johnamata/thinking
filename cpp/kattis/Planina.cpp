/* 
https://open.kattis.com/problems/planina
Category: 1.4a, I/O + Sequences Only
Hint: just print (2^N+1)^2; OEIS A028400 
*/

#include <iostream>
#include <iomanip>
#include <math.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    //set decimal precision to pass test cases in 8 and above
    //alternatively we could probably cast it to int, but i used setprecision here to learn more about C++ libraries
    cout << fixed << setprecision(0) << pow(pow(2, n)+1, 2);
    return 0;   
}