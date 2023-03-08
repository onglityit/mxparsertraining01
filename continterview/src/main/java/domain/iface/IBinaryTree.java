package domain.iface;

import domain.impl.Node;

public interface IBinaryTree {
	INode root = null;
	INode getRoot();
	void setRoot(INode _root);
	void postOrder(INode root);
	void inOrder(INode root);
    void preOrder(INode root);
    void postOrder_traversal(); 
    void inOrder_traversal();
    void preOrder_traversal();
}
