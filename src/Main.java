import Problem3_LinkedList.LinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Problem 1
        System.out.println(Problem1.evaluateExpression("5+20-8+5"));

        System.out.println("Problem1 ------------------------");

        // Problem 2
        var strings = List.of("abbcc", "abc", "abcabc", "cabcbb");

        System.out.println(Problem2.numberOfHappyString(strings));

        System.out.println("Problem2 ------------------------");


        // Problem 3
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        // Return Reverse LinkedList
        LinkedList<Integer> reversedLinkedList = linkedList.reverse(linkedList);

        // Print The reversed LinkedList
        reversedLinkedList.printList();

        System.out.println("\nProblem3 ------------------------");


        // Problem 4
        int[] nums1 = {1, 2, 3, 3, 4, 5};
        int[] nums2 = {3, 4, 4, 5, 6, 7};
        var arr = Problem4.findIntersection(nums1, nums2);
        for (int i : arr) {
            System.out.print(i + ", ");
        }

        System.out.println("\nProblem4 ------------------------");


        // Problem 5
        int[] array = {6, 2, 2, 3, 4, 1};
        System.out.println(Problem5.lenOfLongSubarr(array, 8));

        System.out.println("Problem5 ------------------------");

        // Problem 6
        int[] array1 = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};
        System.out.println(Problem6.isValidSequence(array1, sequence));
        
        System.out.println("Problem6 ------------------------");

    }
}