package util.parser.impl;

import domain.ArithOperator;
import domain.iface.INode;
import domain.impl.Node;
import util.parser.iface.INodeTraversal;

public class NodeTraversal implements INodeTraversal{
	public INode calcBottomOperatorNode(INode _node) {
		//calculate and get the integer result
		int result = calculateSingleNode(_node);
		//replace the node with result
		
		INode parent = _node.getParent();
		if(parent != null) {
			parent.setValue(String.valueOf(result));
			parent.setLeft(null);
			parent.setRight(null);
			return parent;
		}
		return new Node(String.valueOf(result));
	}
	

	public int calculateSingleNode(INode _node) {
		int ret = switch(_node.getValue()) {
			case "+" -> { yield plusInt(_node); }
			case "X", "x", "*" -> {yield multiplyInt(_node);}
			case "-" -> {yield minusInt(_node);}
			case "/" -> {yield divideInt(_node);}
			default -> throw new IllegalArgumentException("Unexpected value: " + _node.getValue());
		};
		return ret;
	}
	
	public INode whatsInside(INode node) {	
		INode resNode;
		int theHeight = height(node);
		if(theHeight > 2) {
			resNode = node;
			resNode.setLeft(whatsInside(resNode.getLeft()));
			resNode.setRight(whatsInside(resNode.getRight()));
		}else if(theHeight == 2) {
			resNode = calcBottomOperatorNode(node);
		}
		else {
			resNode = new Node(node.getValue());
		}
        // 2 + 3 whats inside null 5 null
		/*
		   		x 
		    /		\
		 	+		2
	 	1		3
	 	
	 	whats inside
	 	
	 			x
 			/		\
		 	4		2
		 */
		return resNode;
	}

    public INode reverseOrderTraversal(INode node)
    {
        int h = height(node);
        int i;
        INode ret = null;
        for (i = h; i >= 1 && ret == null; i--)
        {
            ret = calcGivenLevel(node, i);
        }
        return ret;
    }
  
    /* Print nodes at a given level */
    private INode calcGivenLevel(INode node, int level)
    {
        if (node == null)
            return null;
        if (level == 1) {        	
        	return calcBottomOperatorNode(node);
        			//System.out.print(node.getValue() + " ");
        }
            		
        else if (level > 1)
        {
            calcGivenLevel(node.getLeft(), level - 1);
            calcGivenLevel(node.getRight(), level - 1);
        }
        return null;
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
    

	public int plusInt(INode _node) {
		try {
			return 
					Integer.parseInt(_node.getLeft().getValue())
					+
					Integer.parseInt(_node.getRight().getValue());
	
	    } catch (NumberFormatException e) {
	        return 0;
	    }
	}
	
	public int multiplyInt(INode _node) {
		try {
			return 
					Integer.parseInt(_node.getLeft().getValue())
					*
					Integer.parseInt(_node.getRight().getValue());
	
	    } catch (NumberFormatException e) {
	        return 0;
	    }
	}
	
	public int minusInt(INode _node) {
		try {
			return 
					Integer.parseInt(_node.getLeft().getValue())
					-
					Integer.parseInt(_node.getRight().getValue());
	
	    } catch (NumberFormatException e) {
	        return 0;
	    }
	}
	
	public int divideInt(INode _node) {
		try {
			int right = Integer.parseInt(_node.getRight().getValue());
			return (right == 0) ? 
					0
					:
					Integer.parseInt(_node.getLeft().getValue()) / right ;
	
	    } catch (NumberFormatException e) {
	        return 0;
	    }
	}
}
