package Problem3_LinkedList;

import java.util.Stack;

public class LinkedList<T> {
    private Node<T> head;

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public LinkedList<T> reverse(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<T>();
        Node<T> current = list.head;

        Stack<T> stack = new Stack<>();

        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        while (!stack.isEmpty()) {
            reversedList.insert(stack.pop());
        }

        return reversedList;
    }

    public void printList() {
        Node<T> current = head;

        while (current != null) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
    }
}
