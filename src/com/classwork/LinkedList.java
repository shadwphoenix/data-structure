package com.classwork;

public class LinkedList {

    static class Node{
        int data;
        Node next;
    }

    Node head;
    Node tail;

    public static void insert (LinkedList list, int data){

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = list.head;
        if(list.head == null){
            list.head = newNode;
        }
        else {
            list.tail.next = newNode;
        }
        list.tail = newNode;

    }
     public static void insertAtStart(LinkedList list , int data){

        Node newNode = new Node();
        newNode.data = data;
        if (list.head == null){
            list.tail = newNode;
        }
        else{
            newNode.next = list.head;
        }
        list.head = newNode;
        Node last = list.tail;
        last.next = list.head;

     }

     public  static void insertAtIndex(LinkedList list , int data,int index){

        Node newNode = new Node();
        newNode.data = data;
        Node trav = list.head;
        for (int i = 1 ; i<index ; i++){
            trav = trav.next;
         }
        newNode.next = trav.next;
        trav.next = newNode;

     }

     public static void deleteAt(LinkedList list , int index){

        if (list.head != null) {
            Node trav1 = list.head.next;
            Node trav2 = list.head;
            for (int i = 1; i < index; i++) {
                trav1 = trav1.next;
                trav2 = trav2.next;
            }
            trav1 = trav1.next;
            trav2.next = trav1;
        }
     }

    public static void show(LinkedList list){

        Node trav = list.head;
        while (trav != list.tail){
            System.out.println(trav.data);
            trav = trav.next;
        }
        System.out.println(trav.data);

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        insert(list, 12);
        insert(list, 13);
        insert(list, 14);
        insertAtStart(list,11);
        insert(list, 15);
        insertAtIndex(list,12,3);
        deleteAt(list,3);
        show(list);
    }

}
