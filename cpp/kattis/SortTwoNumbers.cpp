//https://open.kattis.com/problems/sorttwonumbers

#include <iostream>

using namespace std;

int main(){
    int a, b;
    cin >> a >> b;
    //basically sort from lowest to highest
    /*
    if(a > b){
        //almost forgot that there should be a space separating the numbers
        cout << b << ' ' << a;
    } else {
        cout << a << ' ' << b;
    }
    */
    //alternatively
    cout << min(a,b) << ' ' << max(a,b);
    return 0;
}