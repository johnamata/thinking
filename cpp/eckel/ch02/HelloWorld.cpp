/*
- including a header file
- header files contain the external definitions of a library
- it conventionally has a file name extension of ‘h’, such as headerfile.h
- though older code are .hxx or .hpp

#include "local.h"

- The preprocessor will find the iostream header file (often in a subdirectory called “include”) and insert it.
*/
#include <iostream> //stream declarations

//each sset of C++ definitions in a library is wrapped in a namespace
//the "using" keyword lets us declare what we want to use in the namespace
//standard C++ libraries are in the std namespace
using namespace std;

int main()
{
    //cout means console output
    //<< means send to
    cout << "Hello, World! I am "
          << 8 << " Today!" << endl;
          //endl outputs the line and a newline
}