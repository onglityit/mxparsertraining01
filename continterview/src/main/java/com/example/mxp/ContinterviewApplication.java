package com.example.mxp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.iface.IBinaryTree;
import domain.impl.BinaryTree;
import domain.impl.Node;
import util.parser.impl.*;

@SpringBootApplication
public class ContinterviewApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ContinterviewApplication.class, args);

		System.out.println("aaaaaa");
		//construct a BST
		IBinaryTree tree = new BinaryTree();  // -1 x 5 x (2+3)
		/*
		 				x
		 			/				\
		 			x			 	+
 				/		\		/		\	
 			-1			5		2		3

		 
		 */
        tree.setRoot(new Node("X")); 
        tree.getRoot().setLeft(new Node("x")); 
        tree.getRoot().setRight(new Node("+")); 
        tree.getRoot().getLeft().setLeft(new Node("-1")); 
        tree.getRoot().getLeft().setRight(new Node("5"));
        tree.getRoot().getRight().setLeft(new Node("2")); 
        tree.getRoot().getRight().setRight(new Node("3")); 
        //PreOrder Traversal
        System.out.println("\nBST => PreOrder Traversal:"); 
        tree.preOrderTraversal(); 
        //InOrder Traversal
        System.out.println("\nBST => InOrder Traversal:"); 
        tree.inOrderTraversal(); 
        //PostOrder Traversal
        System.out.println("\nBST => PostOrder Traversal:"); 
        tree.postOrderTraversal(); 
        
        
		IBinaryTree tree2 = new BinaryTree();  // -1 x 5 x (2+3)
		/*
		 					X
		 			/				\
		 			-1			 	x
 								/		\	
 			  					5		+
 			  						/		\
 			  						2		3

		 
		 */
        tree2.setRoot(new Node("X")); 
        tree2.getRoot().setLeft(new Node("-1")); 
        tree2.getRoot().setRight(new Node("x")); 
        tree2.getRoot().getRight().setLeft(new Node("5")); 
        tree2.getRoot().getRight().setRight(new Node("+"));
        tree2.getRoot().getRight().getRight().setLeft(new Node("2")); 
        tree2.getRoot().getRight().getRight().setRight(new Node("3")); 
        //PreOrder Traversal
        System.out.println("\nBST => PreOrder Traversal:"); 
        tree2.preOrderTraversal(); 
        //InOrder Traversal
        System.out.println("\nBST => InOrder Traversal:"); 
        tree2.inOrderTraversal(); 
        //PostOrder Traversal
        System.out.println("\nBST => PostOrder Traversal:"); 
        tree2.postOrderTraversal(); 
        System.out.println("\nReverse Order:");
        tree2.reverseOrderTraversal(tree2.getRoot());
        
        ArithMediator am = new ArithMediator(tree2.getRoot());
	}

}
