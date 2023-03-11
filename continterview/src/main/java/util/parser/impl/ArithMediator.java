package util.parser.impl;

import domain.ArithOperator;
import domain.iface.INode;
import util.parser.iface.IArithMediator;

record ArithMediator(INode node) implements IArithMediator {
	public int calculateNode(INode _node) {
		switch(ArithOperator.valueOf(_node.getValue())) {
			case PLUS -> plusInt(_node);
			case MULTIPLY, MULTIPLICATION -> multiplyInt(_node);
		}
		return 0;
	}
	public boolean checkDone(INode _node) {
		return false;
	}
	public INode forwardCalculation(INode _node) {
		return null;
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
}
