/*
https://open.kattis.com/problems/thelastproblem
Category: 1.4a, I/O + Sequences Only
Hint: S can have space(s)
*/

#include <iostream>
using namespace std;

int main()
{
	string s;
    //have to do getline() instead of basic 
    //cin >> s;
    //because it passes the test cases in #4 or #5 i think
    //apparently it's because the test cases in #4 or #5 has a lot of spaces, and just doing "cin >> s" doesnt take up all the spaces
    //read this shit:
    //https://stackoverflow.com/questions/2765462/how-to-cin-space-in-c
    getline(cin, s);
    //getline()
    //from: https://eecs.oregonstate.edu/ecampus-video/CS161/template/chapter_3/strings.html
    //The getline function reads in an entire line including all leading and trailing whitespace up to the point where return is entered by the user. The result is returned as a string object.
    //syntax: getline(cin, stringVariable);
    cout << "Thank you, " + s + ", and farewell!";
}