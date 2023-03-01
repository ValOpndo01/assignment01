import java.util.NoSuchElementException;

public class Main {
    public static class LinkedList {

        private Node head; // head of the list

        // Node class to represent each element in the list
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // add a new node to the beginning of the list
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // add a new node to the end of the list
        public void addLast(int data) {
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

        // remove the first node from the list
        public void removeFirst() {
            if (head == null) {
                return;
            }

            head = head.next;
        }

        // remove the last node from the list
        public void removeLast() {
            if (head == null) {
                return;
            }

            if (head.next == null) {
                head = null;
                return;
            }

            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }

        // print the list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }}



    public class Stack extends LinkedList{

        private Node top; // top of the stack

        // Node class to represent each element in the stack
        public class LinkedList {

            private Node head; // head of the list

            // Node class to represent each element in the list
            private static class Node {
                int data;
                Node next;

                Node(int data) {
                    this.data = data;
                    this.next = null;
                }
            }

            // add a new node to the beginning of the list
            public void addFirst(int data) {
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            }

            // add a new node to the end of the list
            public void addLast(int data) {
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

            // remove the first node from the list
            public void removeFirst() {
                if (head == null) {
                    return;
                }

                head = head.next;
            }

            // remove the last node from the list
            public void removeLast() {
                if (head == null) {
                    return;
                }

                if (head.next == null) {
                    head = null;
                    return;
                }

                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }

            // print the list
            public void printList() {
                Node current = head;
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println();
            }

        }}

    public static class StackUsingLinkedList {

        private Node top; // top of the stack

        // Node class to represent each element in the stack
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // push a new element onto the top of the stack
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        // pop the top element from the stack and return its value
        public int pop() {
            if (top == null) {
                throw new NoSuchElementException("Stack is empty");
            }

            int value = top.data;
            top = top.next;
            return value;
        }

        // return the value of the top element in the stack without removing it
        public int peek() {
            if (top == null) {
                throw new NoSuchElementException("Stack is empty");
            }

            return top.data;
        }

        // return true if the stack is empty, false otherwise
        public boolean isEmpty() {
            return top == null;
        }

        // print the contents of the stack
        public void printStack() {
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }}



    public static class QueueUsingLinkedList {

        private Node front; // front of the queue
        private Node rear; // rear of the queue

        // Node class to represent each element in the queue
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // enqueue a new element at the rear of the queue
        public void enqueue(int data) {
            Node newNode = new Node(data);

            if (rear == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        // dequeue the element at the front of the queue and return its value
        public int dequeue() {
            if (front == null) {
                throw new NoSuchElementException("Queue is empty");
            }

            int value = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }

            return value;
        }

        // return the value of the element at the front of the queue without removing it
        public int peek() {
            if (front == null) {
                throw new NoSuchElementException("Queue is empty");
            }

            return front.data;
        }

        // return true if the queue is empty, false otherwise
        public boolean isEmpty() {
            return front == null;
        }

        // print the contents of the queue
        public void printQueue() {
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }



        public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList(); // output: 1 2 3

        list.removeFirst();
        list.printList(); // output: 2 3

        list.addLast(4);
        list.addLast(5);
        list.printList(); // output: 2 3 4 5

        list.removeLast();
        list.printList();

            QueueUsingLinkedList queue = new QueueUsingLinkedList();

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.printQueue(); // output: 1 2 3

            queue.dequeue();
            queue.printQueue(); // output: 2 3

            System.out.println(queue.peek()); // output: 2

            queue.enqueue(4);
            queue.enqueue(5);
            queue.printQueue();

            StackUsingLinkedList stack = new StackUsingLinkedList();

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.printStack(); // output: 3 2 1

            stack.pop();
            stack.printStack(); // output: 2 1

            System.out.println("Top element: " + stack.peek()); // output: Top element: 2

            System.out.println("Is stack empty? " + stack.isEmpty());
        }
}