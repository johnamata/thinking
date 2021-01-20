//iostream means input output stream
# include <iostream>

//to have a namespace for cout. not really important to know for now
using namespace std;

//main is the starting point
int main(){

  //cout is an inbuilt function written in a file called iostream
  //thus we have to write the code to say that we want to include the file (seen at the top of this code)
  cout << "Hello World!";

  //for a newline, use \n
  cout << "\n";

  cout << "hi";

  //endl (or end line) can also be use for a newline
  cout << endl;
  cout << "heya\n";
  //alternatively, we can use one cout, print all of the above in one line.
  cout << "Hello World" << "\n" << "hi" << endl << "heya";
  return 0;
}
