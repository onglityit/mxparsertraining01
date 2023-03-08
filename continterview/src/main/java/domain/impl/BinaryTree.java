package domain.impl;

import domain.iface.IBinaryTree;
import domain.iface.INode;

public class BinaryTree implements IBinaryTree {

    private INode root;
    public INode getRoot() {
    	return root;
    }
    public void setRoot(INode _root) {
    	this.root = _root;
    }
    //PostOrder Traversal - Left:Right:rootNode (LRn)
    public void postOrder(INode node)  { 
        if (node == null) 
            return; 
   
        // first traverse left subtree recursively 
        postOrder(node.getLeft()); 
   
        // then traverse right subtree recursively 
        postOrder(node.getRight()); 
   
        // now process root node 
        System.out.print(node.getValue() + " "); 
    } 
  // InOrder Traversal - Left:rootNode:Right (LnR) 
    public void inOrder(INode node)  { 
        if (node == null) 
            return; 
        //first traverse left subtree recursively
        inOrder(node.getLeft()); 
   
        //then go for root node
        System.out.print(node.getValue() + " "); 
   
        //next traverse right subtree recursively
        inOrder(node.getRight()); 
    } 
   
//PreOrder Traversal - rootNode:Left:Right (nLR)
    public void preOrder(INode node)  { 
        if (node == null) 
            return; 
   
        //first print root node first
        System.out.print(node.getValue() + " "); 
        // then traverse left subtree recursively
        preOrder(node.getLeft()); 
        // next traverse right subtree recursively
        preOrder(node.getRight()); 
    } 
   // Wrappers for recursive functions 
    public void postOrder_traversal()  {    
        postOrder(root);  } 
    public void inOrder_traversal() { 
        inOrder(root);   } 
    public void preOrder_traversal() {
        preOrder(root);  } 
}
