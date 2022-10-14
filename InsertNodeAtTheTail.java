/*
Problem Statement
Given a singly linked list and an element K, your task is to insert the element at the tail of the linked list.
*/

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k) {
//enter your code here
    Node newNode  = new Node(k);
    if(head == null){
        head = newNode;
    }else{
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    return head;
}