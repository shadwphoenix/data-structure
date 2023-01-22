package com.classwork;

import java.util.Stack;

public class Main {

    static boolean isOperator(char c){

        return switch (c) {
            case '+', '-', '*', '/', '^', '%' -> true;
            default -> false;
        };
    }

    public static void infixToPostfix(String str){

        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i<str.length();i++){
            char c = str.charAt(i);
            if(isOperator(c))
                stack.push(c);
            else if (c == ')')
                System.out.print(stack.pop());
            else
                if(c != '(')
                    System.out.print(c);

        }

    }

    public static void infixToPrefix(String str){
        Stack<Character> stack = new Stack<>();
        Stack<Character> result = new Stack<>();
        for(int i = str.length()-1 ; i>=0 ; i--){
            char c = str.charAt(i);
            if(isOperator(c))
                stack.push(c);
            else if(c == '(')
                result.push(stack.pop());
            else
                if(c != ')')
                    result.push(c);

        }

        while (!result.isEmpty())
            System.out.print
                    (result.pop());

    }

    public static void main(String[] args) {

        String str = "((A-(B%C))*((D/E)-F))";
        infixToPostfix(str);
        System.out.println();
        infixToPrefix(str);
    }
}
