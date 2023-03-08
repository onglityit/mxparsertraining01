package domain.impl;

import domain.iface.INode;

public class Node implements INode{
    private String value;
    private INode left;
    private INode right;
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
	}
    public void setRight(INode _right){
    	this.right = _right;
	}
    
    public String getValue() {
    	return value;
    }
}
