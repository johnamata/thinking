//https://open.kattis.com/problems/addtwonumbers

#include <iostream>

using namespace std; 
//pretty much a requirement after #include <iostream> if we want to use cin and cout 
//unless we do 
//std::cin 
//and 
//std::cout

int main(){
    int a, b;
    cin >> a >> b;
    cout << a + b;
    /*
    //alternatively if we dont have "using namespace std;" we can turn cin and cout into the following
    std::cin >> a >> b;
    std::cout << a + b;
    */
}