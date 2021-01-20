# include <iostream>

using namespace std;
int main(){
  int sum = 0; //need to initialize it before we use on line 19
  int length;
  cout << "enter number of elements for your array: ";
  cin >> length;
  int arr[length];
  cout << "enter the values you want to sum in your array: ";
  int count = 0;
  //fill array
  while (count < length){
    cin >> arr[count];
    count++;
  }
  //get sum
  for(int i = 0; i < length; i++){
    sum += arr[i];
  }

  cout << "sum of the array is: " << sum;
  return 0;
}
