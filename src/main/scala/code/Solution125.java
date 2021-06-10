package code;

import java.util.Stack;

public class Solution125 {
    public boolean isPalindrome(String s) {
        //A valid palindrome is characters that reads forwards, same way it reads backward.
        s  = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
        Stack<Character> characterStacks = new Stack<>();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            characterStacks.push(chars[i]);
        }
        int n = characterStacks.size();
        int inc = 0;
        while(n > 0){
            if(characterStacks.pop() != chars[inc]) return false;
            n--;
            inc++;
        }
        return true;
    }
}
