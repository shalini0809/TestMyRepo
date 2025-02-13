package com.cg.Heap;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxHeapWithTree {

    Node root;
    ArrayList<Node> heap;

    MaxHeapWithTree() {
        heap = new ArrayList<>();
    }

    // Method to insert a new value into the heap
    void insert(int item) {
        Node newNode = new Node(item);
        heap.add(newNode);
        int index = heap.size() - 1;
        bubbleUp(index);
        root = heap.get(0); // Update root after insertion
    }

    // Bubble up to maintain the heap property
    /*
     * The bubbleUp method is used to maintain the heap property when a new node is inserted into the heap. Specifically,
     *  in a max-heap, the parent node must be larger than its children. So, after inserting a new node, we may need to move 
     *  it upwards until the max-heap property is restored
     * */
    private void bubbleUp(int index) {
        if (index == 0) return; // If it's the root node
        int parentIndex = (index - 1) / 2;
        if (heap.get(index).data > heap.get(parentIndex).data) {
            swap(index, parentIndex);
            bubbleUp(parentIndex);
        }
    }

    // Method to delete the maximum value (root)
    void deleteMax() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty!");
            return;
        }
        int lastIndex = heap.size() - 1;
        heap.set(0, heap.get(lastIndex)); // Move the last element to root
        heap.remove(lastIndex); // Remove the last element
        bubbleDown(0); // Restore heap property
        root = heap.isEmpty() ? null : heap.get(0); // Update root
    }

    // Bubble down to maintain the heap property
    /*The bubbleDown method is used to restore the heap property after the root (maximum) element has been deleted.
     *  When we delete the maximum value (the root of the heap), the last node in the heap is moved to the root, 
     *  which may violate the heap property. To fix this, we use bubbleDown to move the new root down to its correct position
     * */
    private void bubbleDown(int index) {
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;
        int largest = index;

        if (leftIndex < heap.size() && heap.get(leftIndex).data > heap.get(largest).data) {
            largest = leftIndex;
        }
        if (rightIndex < heap.size() && heap.get(rightIndex).data > heap.get(largest).data) {
            largest = rightIndex;
        }
        if (largest != index) {
            swap(index, largest);
            bubbleDown(largest);
        }
    }

    // Swap two nodes in the heap
    private void swap(int index1, int index2) {
        Node temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    // Method for in-order traversal
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Utility method to start in-order traversal
    void inorder() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty.");
        } else {
            System.out.println("In-order traversal:");
            inorderTraversal(root);
            System.out.println();
        }
    }

    public static void main(String[] args) {
    	MaxHeapWithTree maxHeap = new MaxHeapWithTree();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("Menu:");
            System.out.println("1. Insert a value");
            System.out.println("2. Delete the maximum value");
            System.out.println("3. Display in-order traversal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    maxHeap.insert(value);
                    System.out.println("Inserted: " + value);
                    break;
                case 2:
                    maxHeap.deleteMax();
                    System.out.println("Deleted maximum value.");
                    break;
                case 3:
                    maxHeap.inorder();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

}
