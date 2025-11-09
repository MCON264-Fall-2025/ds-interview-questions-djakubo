package edu.touro.mcon264.s3_balanced_parentheses;

import java.util.Stack;

public class Solution {
    private String string;
    private final char[] openingParantheses = {'(', '{', '['};
    private final char[] closingParantheses = {')', '}', ']'};

    public Solution(String string){
        this.string = string;
    }

    private boolean isMatching(char a, char b){
        return ( a == openingParantheses[0] && b == closingParantheses[0]||
                a == openingParantheses[1] && b == closingParantheses[1]||
                a == openingParantheses[2] && b == closingParantheses[2]
        );
    }

    public boolean isBalanced() {

        Stack<Character> stack = new Stack<Character>();

        for (char c : string.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatching(stack.peek(), c)) {
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else{
                throw new IllegalArgumentException("Input must only contain parentheses, brackets or braces");
            }
        }
        return stack.isEmpty();
    }
}