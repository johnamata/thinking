/*
https://open.kattis.com/problems/qaly
Category: 1.4b, Repetition Only
Hint: trivial loop
*/

#include <iostream>

using namespace std;

int main(){
    /*
    thinking, in case i forget the steps
    - sum the total megs first plus extra month
    - sum the total usage first
    - subtract the total megs and total usage
    */
    int plan, months, ans, usage, total_usage = 0, i = 0;
    cin >> plan >> months;
    int total_megs = plan * (months + 1);
    while(i < months){
        cin >> usage;
        total_usage += usage;
        
        i++;
    }
    cout << total_megs - total_usage ;
    return 0;
}