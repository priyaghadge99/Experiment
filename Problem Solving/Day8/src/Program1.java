//Q1.	Write a program to maintain a singly linked list having the following functions:
//a. Creation of the list
//b. Displaying the list.
//c. Traverse through the linked list and subtract two consecutive nodes. The result
//should be inserted just before the nodes subtracted.
//E.g.: 4 15 8 14 2 6
//Output: -11 4 15 -6 8 14 -4

import java.util.Scanner;



public class Program1 {
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        int i = singlyLinkList.toString().length();

        System.out.println("Enter your choice");
        char choice = scanner.next().charAt(0);

    while (choice!=-1) {

        switch (choice) {
        case '1':
            System.out.println("Creation of list");
            createList();


        case '2':
            System.out.println("Display of list");
            displyList();
            break;

        case '3':
            System.out.println("Deletion of list");
            deleteListNode(singlyLinkList);
            displyList();

            break;
        case '4':
            System.out.println("Insert of list");
            insertListNode();
            break;

           default:
               System.out.println("Enter correct choice");



    }
        System.out.println("Enter  choice");

        choice = scanner.next().charAt(0);


}
    }

    private static void insertListNode() {
    }

    private static void deleteListNode(SinglyLinkList list) {
      list.head = head;
        if (head == null){
            System.out.println("Lsit is empty");
            return;
        }
        else {
            // if list not conatin only one
            if (head != tail){
//                int length = list.toString().length();
//                System.out.println(length+" length");
//                Node current = head;
//                current=current.next;
//                tail=current;   //store cuurent in tail
                head =head.next;
            }
            else {
                head=tail=null;
                System.out.println("Deleted head+tail");



            }
        }


    }

    private static void displyList() {
        Node current = SinglyLinkList.head;
        while (current!=null){
            System.out.println(current.data +" ");
            current=current.next;
        }

    }

    private static void createList() {
        Node node = new Node(23);
        Node node1 = new Node(44);
        Node node2 = new Node(89);
        Node node3 = new Node(88);

        SinglyLinkList.head=node;
        SinglyLinkList.head.next= node1;
        node1.next = node2;
        node2 =tail;




    }
}
