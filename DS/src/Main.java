

class Node {
    int data;
    Node next;



    Node(int data){

        this.data = data;

    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next=node4;
        Node node5 = new Node(5);
        node4.next = node5;

        deletenode(node1,2);
        printAllNode(node1);



    }

    private static void printAllNode(Node node1) {
        Node currentNode = node1;
        Node nextNode = node1.next;
        while(currentNode.next != null){
            System.out.println("Node data="+currentNode.data);
            currentNode = nextNode;
            nextNode = nextNode.next;

        }

        System.out.println("Node data="+currentNode.data);
    }

    private static void deletenode(Node node1, int nodeToDelete) {
        Node currentNode = node1;
        Node nextNode = currentNode.next;
        Node prevNode = null;
        int counter = 1;
        while(currentNode.next != null){
            counter++;
            if(counter% nodeToDelete == 0) {
                prevNode = currentNode;
                nextNode = nextNode.next;
                prevNode.next = nextNode;
            } else {
                prevNode = currentNode;
                currentNode =  prevNode.next;
                nextNode = currentNode.next;
            }


        }



        }


    }
