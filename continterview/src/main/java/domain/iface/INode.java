package domain.iface;

public interface INode {
    String value = "";
    INode left = null;
    INode right = null;	
    INode parent = null;
    
    INode getLeft();
    INode getRight();
    
    void setLeft(INode _left);
    void setRight(INode _right);
    
    String getValue();
    void setValue(String _value);
    
    INode getParent();
	public void setParent(INode _parent);
}
