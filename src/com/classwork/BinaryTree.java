package com.classwork;

import java.util.Stack;

public class BinaryTree {

    public static class Node{

        int data;
        Node rChild;
        Node lChild;

    }

    static Node root;

    public static void insert(BinaryTree binaryTree , int data){

        Node newNode = new Node();
        newNode.data = data;
        if(root == null){
            root = newNode;
        }
        else {
            Node trav = root;
            Node previous = null;
            while (trav != null){
                if(trav.data >= data){
                    previous = trav;
                    trav = trav.lChild;
                }
                else {
                    previous = trav;
                    trav = trav.rChild;
                }
            }
            if(previous.data >= data)
                previous.lChild = newNode;
            else
                previous.rChild = newNode;
        }

    }

    public static void show(BinaryTree binaryTree){

        Stack<Node> tree = new Stack<>();
        Node trav = root;
        while (trav != null || !tree.isEmpty()){
            if(trav != null){
                tree.add(trav);
                trav = trav.lChild;
            }
            else {
                trav = tree.pop();
                System.out.println(trav.data);
                trav = trav.rChild;
            }
        }

    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        insert(binaryTree , 10);
        insert(binaryTree,11);
        insert(binaryTree,5);
        insert(binaryTree,8);
        show(binaryTree);

    }

}
