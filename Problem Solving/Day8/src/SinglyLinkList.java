
/*Q2.	Write a program to maintain a singly linked list having the following functions:
        a.	Creation of the list
        b.	 Displaying the list.
        c.	Sort list
        d.	Insert node
        e.	Delete node*/


import java.util.Scanner;

public class SinglyLinkList
{
    //subclass

    public static Node head ;
    public static Node tail ;

    static class Node {

        int data ;
        Node next;


        //getter and seter
        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        //constructor
        public Node(int data) {
            this.data = data;
            this.next = null;   //
        }

    }



    public static void main(String[] args)
    {
        SinglyLinkList singlyLinkList1 = new SinglyLinkList();

        singlyLinkList1.head = new Node(12);
        Node node = new Node(10);
        Node node3 = new Node(14);

        int data = node.data;
        System.out.println("data   "+data);

        //connect nodes
        singlyLinkList1.head=head;
        singlyLinkList1.head.next= node;
        node.next =node3;
        node3=tail;
//        System.out.println(singlyLinkList1.toString().toCharArray());

        Scanner scanner = new Scanner(System.in);
        System.out.println("" +
                "        a.\tCreation of the list\n" +
                "        b.\t Displaying the list.\n" +
                "        c.\tSort list\n" +
                "        d.\tInsert node\n" +
                "        e.\tDelete node ");

        System.out.println("Enter your choice :- ");
        char s = scanner.next().charAt(0);

        char ch=s ;
        switch (ch){
            case 'a' :
                System.out.println("a.\tCreation of the list\n");
                createLinkList();
                break;

            case 'b' :
                System.out.println(" b.\\t Displaying the list.\\n\"");
                displayLinkList();
                break;
            case 'c' :
                System.out.println(" b.\\t Displaying the list.\\n\"");
                sortLinkList();
                displayLinkList();
                break;
            case 'd' :
                System.out.println("d.\tInsert node\n");
//                insertNodeAtHead(singlyLinkList1);  //working
                System.out.println("===============");
//                displayLinkList();               // static to static --------------no need to add obj.method
//                System.out.println(node);
                System.out.println("===============");
//                insertNodeAtEnd(12,singlyLinkList1);  //working
                insertNodeAfter(node,134,singlyLinkList1);
                displayLinkList();
                break;
            case 'e' :
                System.out.println("        e.\tDelete node ");
                deleteLinkList(singlyLinkList1,node3);
                displayLinkList();
                break;


            default:
                System.out.println("Enter Correct Choice ");
        }

    }


    private static void createLinkList()

    {
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        singlyLinkList.head  = new Node( 12);
        Node node2 = new Node(23);
        Node node3 = new Node(25);

        //connect nodes
        head.next = node2;
        node2.next= node3;
        node3.next =null;
        node3=tail;

        //to dislay singlylinklist
        while (singlyLinkList.head !=null){
            System.out.println(singlyLinkList.head.data +"" );
            singlyLinkList.head = singlyLinkList.head.next;
        }


    }


    private static void displayLinkList() {

   //Node current will point to head
        Node current = head;


        if (head == null){
            System.out.println("List Empty");
        }
        else {
            while (current!=null){
                current.data = current.getData();
                System.out.println(current.data+ " ");
                current = current.next;
            }
        }
    }



    private static void sortLinkList() {
        int temp;

        Node current = head ;
        Node index= null;


        while (current!=null){  //head not null

            index= current.next;

            while (index!=null){

                while (current.data> index.data){  //
                    temp = current.data;
                    current.data = index.data;    // swap logics if current data is greater than index
                    index.data=temp;

                }
                index=index.next;  //point index to next

            }
            current= current.next;   //point current to next

        }




    }

    private static SinglyLinkList  insertNodeAtHead( SinglyLinkList singlyLinkList) {  //TC O(1)

        Node newNode = new Node(23);
        singlyLinkList.head= head;

        if (head==null)
        {
            head=newNode;
            tail=newNode;
        }

        else {

                 head.next = newNode;     //new node --link to head cha next
                 head = newNode;         //now newnode become head.


            }


        return singlyLinkList;

    }

    private static void insertNodeAfter(Node node,int data,SinglyLinkList list) {
        Node  newNode = new Node(data);
        Node last= node;
        Node nodetrv =list.head;




        if (node ==null){
            System.out.println("Node is null");
        }

        System.out.println(nodetrv.next +" is null ?" );

        while (nodetrv.next!=null){   //traversing upto last node

           if (nodetrv.next==last) {  // if next node is last=node
//               newNode.next = last.next;   //both point to same
               last.next = newNode;
//               newNode = tail;
//               newNode.next = SinglyLinkList.tail;
              SinglyLinkList.tail=  newNode.next;
               System.out.println(SinglyLinkList.tail);
               System.out.println(SinglyLinkList.tail==newNode.next);
               break;
           }
           newNode.next = SinglyLinkList.tail;
           newNode.next=list.tail;
//            System.out.println(newNode.next);
            newNode.next=tail;


        }
        //12
        //10
        //134  only addition of element not a attachin to tail

    }
    private static void insertNodeAtEnd(int data ,SinglyLinkList list) {
       //creating a newnode
        Node newNode = new Node(data);
        newNode.next=null;

        //if list is empty
        if (head == null) {
           list.head= newNode;   //head node will be newnode


        } else {

            Node last = list.head;   //list.head we are storing into last
            while (last.next!=null)  //travese upto last element
            {
                last= last.next;
            }
            System.out.println(last.next ==newNode.next);//if both point to same null
            last.next=newNode;    //now pointing newnode in last.next //kind of linking done here

            }
        }

    private static void deleteLinkList(SinglyLinkList singlyLinkList1, Node node3) {
        Node last= SinglyLinkList.head;

        System.out.println("=====");
        while (last.next!=tail ){  //for traversing list

            System.out.println("=In while===");
            System.out.println(SinglyLinkList.tail);


//                System.out.println("===in if");
//                last.next=node3.next;
//                node3=last;
            System.out.println(last.data +" ");


            last=last.next;

        }

        singlyLinkList1.tail = last;
        System.out.println(last.data  +"-- ");
        singlyLinkList1.tail.next = null;
        tail=last;
        System.out.println("End" +tail.getData());
        //not working yet

    }



}
