// In form of collection frame work
import java.util.*;

public class LL{
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);


        list.addLast("list");
        list.addFirst("this");
        System.out.println(list);


        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");

        // list.removeFirst();
        // list.removeLast();

        list.remove(3);
        System.out.println(list);
    }
}















// public class LL {
//        Node head;
//        private int size;

//        LL(){
//        this.size=0;
//        }

//     class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data=data;
//             this.next=null;
//             size++;
//         }
//     }

    // add  first node

 
    // public void addfirst(String data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head=newNode;
    //         return;
    //     }
    //     newNode.next=head;
    //     head=newNode;

    // }

    // add  last node

    // public void addlast(String data){
    //    Node newNode = new Node(data);
    //    if(head == null){
    //     head = newNode;
    //     return;
    //    }
    //    Node currNode = head;
    //    while(currNode.next != null){
    //     currNode = currNode.next;
    //    }
    //    currNode.next=newNode;
    // }

// delete first node

// public void deletefirst(){
//     if(head==null){
//         System.out.println("the list is empty");
//         return;
//     }
//     size--;
//     head=head.next;
// }

//delete last node
// public void deletelast(){
//     if(head==null){
//         System.out.println("the list is empty");
//         return;
//     }
//     size--;

//     if(head.next == null){
//         head=null;
//         return;
//     }
//     Node secondlast = head;
//     Node lastNode = head.next;
//     while(lastNode.next != null){
//         lastNode = lastNode.next;
//         secondlast = secondlast.next;
//     }
//     secondlast.next = null;
// }

// public int getsize(){
//     return size;
// }


// print

//     public void printlist(){
//         if(head==null){
//             System.out.println("list is empty");
//             return;
//         }
//        Node currNode = head;
//        while(currNode != null){
//         System.out.print(currNode.data + "-> ");
//         currNode = currNode.next;
//        }
//        System.out.println("Null");
//     }
    






//     public static void main(String[] args) {

//         LL list = new LL();
//         list.addfirst("a");
//         list.addfirst("is");
//         list.printlist();
  
//         list.addlast("list");
//         list.printlist();

//         list.addfirst("this");
//         list.printlist();

//         list.deletefirst();
//         list.printlist();

//         list.deletelast();
//         list.printlist();
//         System.out.println(list.getsize());
//         list.addfirst("this");
//         list.printlist();
//         System.out.println(list.getsize());
//     }
        
// } 

