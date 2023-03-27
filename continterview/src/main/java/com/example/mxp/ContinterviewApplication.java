package com.example.mxp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.iface.IBinaryTree;
import domain.iface.INode;
import domain.impl.BinaryTree;
import domain.impl.Node;
import util.parser.iface.*;
import util.parser.impl.*;

@SpringBootApplication
public class ContinterviewApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ContinterviewApplication.class, args);        
        
        IBinaryTree tree3 = new BinaryTree();
        tree3.setRoot(new Node("+"));
        tree3.getRoot().setLeft(new Node("2"));
        tree3.getRoot().setRight(new Node("3"));
        
        NodeTraversal nt = new NodeTraversal();
        INode result = nt.whatsInside(tree3.getRoot());
        System.out.println("result is " + result.getValue());
        
        /*
         							x
     							/		\
 							 +			5
						 /		\
						 2		3
         */
        IBinaryTree tree1 = new BinaryTree();
        tree1.setRoot(new Node("x"));
        tree1.getRoot().setLeft(new Node("+"));
        tree1.getRoot().setRight(new Node("5"));
        tree1.getRoot().getLeft().setLeft(new Node("2"));
        tree1.getRoot().getLeft().setRight(new Node("3"));
        
        INode result1 = nt.whatsInside(tree1.getRoot());
        System.out.println("result1 is " + result1.getValue());
	}

}
