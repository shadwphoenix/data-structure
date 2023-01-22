package com.classwork;

public class Queue {

    static int[] queue = new int[200];
    static int front = -1 , rear = -1;

    static void enqueue(int data){
        if(rear != queue.length-1){
            rear++;
            queue[rear] = data;
        }
        else
            System.out.println("Queue is full ");
    }

    static Integer dequeue(){
        if(rear == front){
            System.out.print("queue is empty ");
            return null;
        }
        front++;
        return queue[front];
    }

    public static void main(String[] args){

        enqueue(100);
        enqueue(200);
        enqueue(300);
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());

    }

}
