package com.biswajit.condigpatterns.fasrandslowpointer;

import com.biswajit.condigpatterns.common.linkedlist.LinkedList;
import com.biswajit.condigpatterns.common.linkedlist.LinkedListNode;
import com.biswajit.condigpatterns.common.linkedlist.PrintList;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5, 6}, {3, 2, 1}, {10}, {1, 2}};

        for(int i=0; i<input.length; i++){
            System.out.print(i+1);
            LinkedList<Integer> list = new LinkedList<Integer>();
            list.createLinkedList(input[i]);
            System.out.print(".\tInput linked list:  ");
            PrintList.printListWithForwardArrow(list.head);
            System.out.print("\tMiddle of the linked list is:  " );
            System.out.println(middleOfLinkedList(list.head).data);
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

    public static LinkedListNode middleOfLinkedList(LinkedListNode head){
        if(head == null){

            return null;
        }
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }
}
