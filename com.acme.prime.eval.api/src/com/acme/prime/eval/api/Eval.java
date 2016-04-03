package com.acme.prime.eval.api;

/**
 * A service that evaluates and expression and returns a result
 */
public interface Eval {
	
	/**
	 * Evaluate an expression and return the result.
	 */
	double eval(String expression) throws Exception;
}
