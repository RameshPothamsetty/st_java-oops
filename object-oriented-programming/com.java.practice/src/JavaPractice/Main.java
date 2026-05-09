package JavaPractice;


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        // Insert at end
        void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Delete first node with given value
        void deleteByValue(int data) {
            if (head == null) return;

            // If head node itself holds the value
            if (head.data == data) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }

        // Reverse the list in-place
        void reverse() {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next; // store next node
                current.next = prev; // reverse link
                prev = current;      // move prev forward
                current = next;      // move current forward
            }
            head = prev; // new head
        }

        // Print all values space-separated
        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public class Main {
        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            // Insert 1,2,3,4,5
            System.out.print("After insert: ");
            for (int i = 1; i <= 5; i++) {
                list.insertAtEnd(i);
            }
            list.printList(); // 1 2 3 4 5

            // Delete 3
            list.deleteByValue(3);
            System.out.print("After delete 3: ");
            list.printList(); // 1 2 4 5

            // Reverse
            list.reverse();
            System.out.print("After reverse: ");
            list.printList(); // 5 4 2 1
        }
    }
