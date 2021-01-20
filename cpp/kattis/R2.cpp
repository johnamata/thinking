# include <iostream>

using namespace std;
//given r1, and s, find r2 that satisfies
//s = (r1 + r2)/2
int main(){
  int r, s;
  cin >> r >> s;
  cout << 2 * s - r;
  return 0;
}
