//https://open.kattis.com/problems/echoechoecho

# include <iostream>

using namespace std;

int main(){
    //
    string word;
    cin >> word;
    //basically just repeat the word 3x
    cout << word << " " << word << " " << word;
    return 0;
}