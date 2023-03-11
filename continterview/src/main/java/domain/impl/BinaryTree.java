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
    public void postOrderTraversal()  {    
        postOrder(root);  } 
    public void inOrderTraversal() { 
        inOrder(root);   } 
    public void preOrderTraversal() {
        preOrder(root);  } 
    
    
    public void reverseOrderTraversal(INode node)
    {
        int h = height(node);
        int i;
        for (i = h; i >= 1; i--)
        //THE ONLY LINE DIFFERENT FROM NORMAL LEVEL ORDER
        {
            printGivenLevel(node, i);
        }
    }
  
    /* Print nodes at a given level */
    private void printGivenLevel(INode node, int level)
    {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.getValue() + " ");
        else if (level > 1)
        {
            printGivenLevel(node.getLeft(), level - 1);
            printGivenLevel(node.getRight(), level - 1);
        }
    }
  
    /* Compute the "height" of a tree -- the number of
     nodes along the longest path from the root node
     down to the farthest leaf node.*/
    private int height(INode node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the height of each subtree */
            int lheight = height(node.getLeft());
            int rheight = height(node.getRight());
  
            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
}
