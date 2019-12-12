package com.java.main;
public class MainExample {
	public static void main(String[] args) {
		System.out.println("Hello Marduk");
		whenNumbersGivenToRuleEngine_thenReturnCorrectResult();
	}
	
	public static void whenNumbersGivenToRuleEngine_thenReturnCorrectResult() {
	    Expression expression = new Expression(5, 5, Operator.ADD);
	    RuleEngine engine = new RuleEngine();
	    Result result = engine.process(expression);
	 
	    System.out.println(result.getValue());
	}
}
