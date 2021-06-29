/*
https://open.kattis.com/problems/jackolanternjuxtaposition
Category: 1.4a, I/O + Sequences Only
Hint: just print N*T*M
*/
#include <iostream>
using namespace std;
int main(){
  int n, t, m;
  //n = eye designs
  //t = nose designs
  //m = mouth designs
  cin >> n >> t >> m;
  //outputs all probable cases
  cout << (n * t * m);
  return 0;
}