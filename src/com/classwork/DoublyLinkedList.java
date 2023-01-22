package com.classwork;

public class DoublyLinkedList {

    public static class Node{
        int data;
        Node next;
        Node previous;
    }

    Node head;
    Node tail;

    public static void insert(DoublyLinkedList dList,int data){

        Node newNode = new Node();
        newNode.data = data;
        if(dList.head == null)
            dList.head = newNode;
        else {
            Node last = dList.tail;
            newNode.previous = last;
            last.next = newNode;
        }
        dList.tail = newNode;

    }

    public static void insertAtStart(DoublyLinkedList dList,int data){

        Node newNode = new Node();
        newNode.data = data;
        if(dList.head == null){
            dList.tail = newNode;
        }
        else {
            newNode.next = dList.head;
            dList.head.previous = newNode;
        }
        dList.head = newNode;

    }

    public static void insertAtIndex(DoublyLinkedList dList , int data , int index){

        Node newNode = new Node();
        newNode.data = data;
        Node trav2 = dList.head;
        Node trav1 = dList.head.next;
        for (int i = 1 ; i<index ; i++){
            trav1 = trav1.next;
            trav2 = trav2.next;
        }
        newNode.previous = trav2;
        trav2.next = newNode;
        trav1.previous =newNode;
        newNode.next = trav1;

    }

    public static void showRe(DoublyLinkedList dList){

        Node trav = dList.tail;
        while (trav != dList.head){
            System.out.println(trav.data);
            trav = trav.previous;
        }
        System.out.println(trav.data);

    }

    public static void delete(DoublyLinkedList dList,int index){

        Node trav = dList.head;
        for(int i = 0 ; i<index ; i++){
            trav = trav.next;
        }
        trav.previous.next = trav.next;
        trav.next.previous = trav.previous;

    }

    public static void show(DoublyLinkedList dList){

        Node trav = dList.head;
        while (trav != dList.tail){
            System.out.println(trav.data);
            trav = trav.next;
        }
        System.out.println(trav.data);
    }

    public static void main(String[] args) {

        DoublyLinkedList dList = new DoublyLinkedList();

        insert(dList,10);
        insert(dList,11);
        insert(dList,12);
        insert(dList,13);
        insertAtStart(dList,9);
        insertAtIndex(dList,12,3);
        delete(dList,2);
        show(dList);

    }

}
