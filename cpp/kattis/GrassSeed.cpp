# include <iostream>

using namespace std;
int main(){
  double c, l;
  int i = 0;
  double ans  = 0;
  cin >> c; //cost to sow 1 metre of lawn
  cin >> l; //number of lawns to sow
  
  while (i < l){
    double w, l;
    cin >> w >> l;
    ans += w * l * c;
    i++;
  }

  //fixed
  //note from c++ reference: https://www.cplusplus.com/reference/ios/fixed/
  //When floatfield is set to fixed, floating-point values are written using fixed-point notation: the value is represented with exactly as many digits in the decimal part as specified by the precision field (precision) and with no exponent part.
  cout << std::fixed << ans;
  return 0;
}
