package data_structuresand_algorithms.trees;

import java.util.Scanner;

public class BinaryTree {
	
	class Node{
		int data;
		Node right;
		Node left;
		
		Node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
			}
		
	}

	Node create() {
		Node root= null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value to be inserted");
		
		int data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		root= new Node(data);
		System.out.println("enter the left to be inserted for"+root.data);
		root.left=create();
		
		System.out.println("enter the right to be inserted"+root.data);
		root.right=create();
		return root;
		
		
		
	}
	
	void preorder(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
		
	}
	void inorder(Node root) {
		if(root == null) {
			return;
		}
		
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	}
	void postorder(Node root) {
		if(root == null) {
			return;
		}
		
		
		postorder(root.left);
		
		postorder(root.right);
		System.out.println(root.data);
	}
	public static void main(String[] args) {
		
		BinaryTree b=new BinaryTree();
		Node root=b.create();
		b.preorder(root);
		System.out.println();
		b.postorder(root);
		System.out.println();
		b.inorder(root);
	}

}
