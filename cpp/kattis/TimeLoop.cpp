# include <iostream>

using namespace std;
int main(){
  int count = 0;
  int n;
  cin >> n;
  while(count < n){
    count++;
    //for printing new line, use \n
    cout << count << " " << "Abracadabra\n";
  }
  return 0;
}
