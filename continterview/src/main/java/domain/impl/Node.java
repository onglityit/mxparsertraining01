package domain.impl;

import domain.iface.INode;

public class Node implements INode{
    private String value;
    private INode left;
    private INode right;
    private INode parent;
    public Node(String value) {
        this.value = value;
        right = null;
        left = null;
    }

    public INode getLeft(){
    	return left;
	}
    public INode getRight(){
    	return right;
	}
    
    public void setLeft(INode _left){
    	this.left = _left;
    	if(this.left != null) this.left.setParent(this);
	}
    public void setRight(INode _right){
    	this.right = _right;
    	if(this.right != null) this.right.setParent(this);
	}
    
    public String getValue() {
    	return value;
    }
    public void setValue(String _val) {
    	this.value = _val;
    }

	public INode getParent() {
		return parent;
	}

	public void setParent(INode _parent) {
		this.parent = _parent;
	}
}
