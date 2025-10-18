import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class Node{

        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    static class SingleyLinkedList{
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
                current.next = newNode;
            }
        }
    }

    static void checkForThree(SingleyLinkedList original, SingleyLinkedList secondList){

        Node current = original.head;
        while(current != null){
            if(Integer.toString(current.value).contains("3")){
                secondList.addNode(current.value);
            }
            current = current.next;
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SingleyLinkedList primeList = new SingleyLinkedList();
        SingleyLinkedList secondList = new SingleyLinkedList();

        System.out.println("Enter the number of nodes: ");
        int n = scnr.nextInt();

        System.out.println("Enter the numbers in the nodes: ");
        for(int i = 0; i < n; i++){
            primeList.addNode(scnr.nextInt());
        }

        checkForThree(primeList, secondList);

        Node current = secondList.head;
        System.out.println("The numbers in the second list containing 3 are: ");
        while(current != null){
            System.out.println(current.value);
            current = current.next;

        }

    }
}