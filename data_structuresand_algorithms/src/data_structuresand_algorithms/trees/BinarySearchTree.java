package data_structuresand_algorithms.trees;

import java.util.Scanner;

public class BinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Scanner scanner = new Scanner(System.in);

    Node create(Node root) {
        if (root == null) {
            System.out.println("Enter the node value");
            int data = scanner.nextInt();
            return new Node(data);
        }

        System.out.println("Enter the node value");
        int data = scanner.nextInt();

        if (data < root.data) {
            root.left = create(root.left);
        } else if (data > root.data) {
            root.right = create(root.right);
        }

        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        Node root = null; // Initialize root
        root = b.create(root);
        b.scanner.close();
    }
}

