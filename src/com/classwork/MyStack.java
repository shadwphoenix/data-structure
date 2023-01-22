package com.classwork;


public class MyStack {

    static int[] stack = new int[100];
    static int top = -1;



    static Integer pop(){

        if(top != -1){
            int data = stack[top];
            top--;
            return data;
        }
        System.out.print("stack empty ");
        return null;

    }

    static void push(int value){
        top++;
        stack[top] = value;
    }

    public static void main(String[] args) {

        push(200);
        push(300);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }

}
