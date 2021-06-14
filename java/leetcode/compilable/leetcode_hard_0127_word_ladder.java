//https://leetcode.com/problems/word-ladder/

import java.util.*;

public class leetcode_hard_0127_word_ladder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList){
        //we use hashset data structure to allow us to look for an element in constant time
        HashSet<String> hs = new HashSet<>(wordList);
        //just to check if the endword is not in the list, if true then it's over
        if(!hs.contains(endWord)) return 0;
        //prep for BFS
        //we use queue, as BFS is commonly implemented with queues compared to stacks with DFS
        Queue<String>  q = new LinkedList<>();
        //add begin word to queue
        q.offer(beginWord);
        //tracks the level. start with zero because it'll be used for incrementing
        int level = 0;
        //BFS implementation
        while(!q.isEmpty()) {
            //processing words level by level
            for (int k = q.size(); k > 0; k--) {
                //get reference and remove at queue
                String word = q.poll();
                //FOUND ANSWER: we stop and return the level + 1 because we're also including the beginning level/word
                if (word.equals(endWord)) return level + 1;
                //else we go through the word and find neighbours for it
                for (int i = 0; i < word.length(); i++) {
                    //now because in java strings arent mutable, we convert the word to an array of characters
                    char[] newWord = word.toCharArray();
                    //we iterate through the word, cycling the letters accordingly to the alphabet, to find possible neighbours
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        newWord[i] = ch;
                        //we convert back so we can compare it if it's equal
                        String temp = new String(newWord);
                        //check if the combination exists in the hashset
                        if(hs.contains(temp) && !temp.equals(word)){
                            //put them to queue
                            q.offer(temp);
                            //remove words from hashset that we've visited so "duplicates" wont interfere with the if statement later
                            hs.remove(temp);
                        }
                    }
                }
            }
            //we increment on every level
            level++;
        }
        //if we dont find anything we return 0
        return 0;
    }
    //testing, ignore this for leetcode submission
    public static void main(String[]args){
        String begin = "hit";
        String end = "cog";
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("hot");
        ll.addLast("dot");
        ll.addLast("dog");
        ll.addLast("lot");
        ll.addLast("log");
        ll.addLast("cog");
        System.out.println("input wordList: " + ll);
        System.out.println("input beginWord: " + begin);
        System.out.println("input endWord: " + end);
        System.out.println("Answer: " + ladderLength(begin, end, ll));
    }
}

