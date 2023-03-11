package util.parser.impl;

import domain.ArithOperator;
import domain.iface.INode;
import util.parser.iface.IArithMediator;
import util.parser.iface.INodeTraversal;

public record ArithMediator(INode node, INodeTraversal nt) implements IArithMediator {
	static INodeTraversal nodeTrav;
	static {
		nodeTrav = new NodeTraversal();
	}
	public int calculateNode(INode node) {
		INode retNode = nodeTrav.calcBottomOperatorNode(node);
		return 0;
	}
	public boolean checkDone(INode _node) {
		return false;
	}
	public INode forwardCalculation(INode _node) {
		return null;
	}
}
