package com.classwork;

public class NewStack {

    static int[] stack = new int[100];
    static int top = 0;

    static Integer pop(){
        top--;
        if(top == -1){
            System.out.print("stack empty ");
            return null;
        }
        return stack[top];
    }

    static void push(int value){
        stack[top]=value;
        top++;
    }

    public static void main(String[] args) {

        push(100);
        push(200);
        System.out.println(pop());
        System.out.println(pop());


    }

}
