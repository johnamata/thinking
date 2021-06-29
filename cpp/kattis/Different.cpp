    /*
    https://open.kattis.com/problems/different
    Category: 1.4b, Repetition Only
    Hint: use abs function per test case
    */

    #include <iostream>
    using namespace std;

    int main()
    {
        //because int is too small for sample test case 71293781758123
        //and double cant do abs()
        long long i1, i2;
        //keep reading values from cin into the ff variables. as long as they can be read, we loop
        while(cin >> i1 >> i2){
            //endl to go to next stream
            cout << abs(i1-i2) << endl;
        }
        return 0;
    }