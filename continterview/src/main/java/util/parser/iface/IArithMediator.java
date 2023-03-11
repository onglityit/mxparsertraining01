package util.parser.iface;

import domain.iface.INode;

public interface IArithMediator {
	int calculateNode(INode _node);
	boolean checkDone(INode _node);
	INode forwardCalculation(INode _node);
}
