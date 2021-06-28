//https://open.kattis.com/problems/jackolanternjuxtaposition
# include <iostream>


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
