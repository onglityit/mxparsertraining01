package domain;

public enum ArithOperator {
	//OPENPARANTHESES("("), CLOSEPARANTHESES(")"),
	MULTIPLY("*"),
	TIMES("X"),
	MULTIPLICATION("x"),
	DIVIDE("/"),
	PLUS("+"),
	MINUS("-"),
	;
	private String operator;
	
	private ArithOperator(String _op) {
		this.operator = _op;
	}
	
	public String getOperator() {
		return operator;
	}
}
