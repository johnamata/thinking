import java.util.*;

public class codeforces_800_520_a_pangram{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	HashSet<Character> hs = new HashSet<Character>();
	
	int n = sc.nextInt();
	//for nextInt()'s newline creation
	sc.nextLine();
	
	//read and clean
	String s = sc.nextLine().toLowerCase();

	//hashset doesnt take duplicate elements, only values
	for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }

	//.size() prints the number of elements in the hashset
        if (hs.size() == 26) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
	//this if-else block could've been shortened to
	//System.out.print(hs.size()==26?"YES":"NO");

    }
}
//this official answer is more interesting though, uncomment it obviously
public class Pangram {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean [] letters = new boolean[26];
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine().toLowerCase();
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
		    //the following if statement checks if the current character is not in the boolean array
		    //this is done by subtracing the characters to 'a' character, as subtraction of characters uses their ASCII value, it's a nice cheat to keep track of where it is in the alphabet.
		    //for example, 'b' - 'a' outputs 1, as 'b' in ASCII is 98 and a in ASCII is 97.
		    //as we can see, subtracting to 'a' makes it easy for us to map the other letters into the boolean[] letters array accordingly to their numbering in the alphabet
		    //note that by default, boolean, starts at false. note that it's boolean the primitive not Boolean the object
			if (!letters[s.charAt(i) - 'a']){
			    //getting here means that the input is a new letter and not mapped alphabetically and holding a true value at letters[] yet
			    letters[s.charAt(i) - 'a'] = true;
			    //we count the occurence, but before this we change the value to true so we dont have to count this letter occurence later
			    counter++;
			}
		}
		//because english alphabet has 26 letters, i think ours is 28.
		if (counter == 26)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
/*
anyhow, i actually found an explanation of it just now lmfao, wasted my time commenting those explanations above but that's ok that makes it easier for me to remember

To check that every letter is present in the string we can just make a boolean array of size 26 and for every letter set the corresponding variable to TRUE. In the end check that there are 26 TRUEs. That is an O(n) solution. Also don't forget to change all letters to lowercase (or all to uppercase).

To make all the letters lowercase, one could use standard functions, like tolower in Python. Also, it is known that the letters from a to z have consecutive ASCII numbers, as well as A to Z; an ASCII number of symbol is ord(c) in most languages. So, to get the number of a lowercase letter in the alphabet one can use ord(c) - ord('a') in most languages, or simply c - 'a' in C++ or C (because a char in C/C++ can be treated as a number); to check if a letter is lowercase, the inequality ord('a') <= ord(c) && ord(c) <= ord('z') should be checked.
 */
