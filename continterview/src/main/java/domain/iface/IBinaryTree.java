package domain.iface;

import domain.impl.Node;

public interface IBinaryTree {
	INode root = null;
	INode getRoot();
	void setRoot(INode _root);
	void postOrder(INode root);
	void inOrder(INode root);
    void preOrder(INode root);
    void postOrderTraversal(); 
    void inOrderTraversal();
    void preOrderTraversal();
    void reverseOrderTraversal(INode node);
}
