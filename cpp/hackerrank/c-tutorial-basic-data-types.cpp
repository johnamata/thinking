//https://www.hackerrank.com/challenges/c-tutorial-basic-data-types/problem

#include <iostream>
#include <cstdio>
#include <iomanip> 

using namespace std;

int main() {
    // Complete the code.
    int a; long b; char c; float d; double e;
    cin >> a >> b >> c >> d >>e;
    cout << a << "\n" <<b << "\n" <<c << "\n";
    cout << fixed << setprecision(2) << d << "\n";
    cout << fixed << setprecision(2) << e << "\n";
    return 0;
}