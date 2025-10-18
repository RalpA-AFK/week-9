import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    class Node{

        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    class singleyLinkedList{
        Node head;

        void addNode(int value){
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
            } else{
                Node current = head;
                while(current.next != null){
                    current = current.next;
                }
            }
        }
    }

    static void checkForThree(SingleyLinkedList original, SingleyLinkedList secondList){

        Node current = original.head;
        while(current != null){
            if(Integer.toString(current.value).contains("3"))
                secondlist.add(current.value);
        }
        current = current.next;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SingleyLinkedList

    }
}