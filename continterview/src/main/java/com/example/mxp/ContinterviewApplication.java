package com.example.mxp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.iface.IBinaryTree;
import domain.impl.BinaryTree;
import domain.impl.Node;

@SpringBootApplication
public class ContinterviewApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ContinterviewApplication.class, args);

		System.out.println("aaaaaa");
		//construct a BST
		IBinaryTree tree = new BinaryTree(); 
        /*        x
                //  \\
                x   90  
               // \\
               7   12      */
        tree.setRoot(new Node("x")); 
        tree.getRoot().setLeft(new Node("x")); 
        tree.getRoot().setRight(new Node("+")); 
        tree.getRoot().getLeft().setLeft(new Node("-1")); 
        tree.getRoot().getLeft().setRight(new Node("5"));
        tree.getRoot().getRight().setLeft(new Node("2")); 
        tree.getRoot().getRight().setRight(new Node("3")); 
        //PreOrder Traversal
        System.out.println("BST => PreOrder Traversal:"); 
        tree.preOrder_traversal(); 
        //InOrder Traversal
        System.out.println("\nBST => InOrder Traversal:"); 
        tree.inOrder_traversal(); 
        //PostOrder Traversal
        System.out.println("\nBST => PostOrder Traversal:"); 
        tree.postOrder_traversal(); 
	}

}
