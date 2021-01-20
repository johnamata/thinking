# include <iostream>
using namespace std;

int main(){
  int i = 10;
  cout <<"Value of variable i is " << i << endl;
  //sizeof() outputs the size of int in bytes, which is 4 bytes
  cout << "size of data type int is " << sizeof(i) << endl;
  //alternatively, we couldve done sizeof(int)

  //short int data type takes 2 bytes of memory
  short int s = 25;
  cout << "value of variable s is " << s <<endl;
  cout << "size of data types hort int is " << sizeof(short int) << endl;

  //long long int = 8 bytes
  //short int stores less values than int, and int stores less values than long long int

  //int cant store floating values like 1.23
  //for floating values, we can use float and double
  //sizeof(float) has 4 bytes
  //sizeof(double) has 8 bytes

  //for storing characters such as 'a' or '$', we can use char
  char c = 'a';
  cout << "value of variable c is " << c;
  cout << "size of data type char is " << sizeof(char) << endl; //prints 1

  //for storing true and false values, we use "bool" which stands for boolean
  bool d = false;
  cout << "value of variable d is " << c;
  cout << "size of data type bool/boolean is " << sizeof(bool) << endl; //prints 1

  int j;
  //we didnt initialize j with any value, but if we print it, it'll give a value. the value is a garbage value of anything in the data type it uses' range. the value changes every time we run it. this happens with every data type.
  cout << j << endl;
  return 0;
}
    
