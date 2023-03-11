package com.example.mxp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import domain.iface.IBinaryTree;
import domain.iface.INode;
import domain.impl.BinaryTree;
import domain.impl.Node;
import util.parser.impl.NodeTraversal;

@SpringBootTest
class ContinterviewApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void TestSingleLevel() {

        IBinaryTree tree3 = new BinaryTree();
        tree3.setRoot(new Node("+"));
        tree3.getRoot().setLeft(new Node("2"));
        tree3.getRoot().setRight(new Node("3"));
        
        NodeTraversal nt = new NodeTraversal();
        INode result = nt.whatsInside(tree3.getRoot());
        
        assertEquals(result.getValue(), "5", "result should be 5");
	}

}
