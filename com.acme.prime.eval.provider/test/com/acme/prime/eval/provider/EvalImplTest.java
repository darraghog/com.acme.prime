package com.acme.prime.eval.provider;

import junit.framework.TestCase;

/*
 * 
 * 
 * 
 */

public class EvalImplTest extends TestCase {
	
	/*
	 * 
	 * 
	 * 
	 */
	public void testSimple() throws Exception {
		EvalImpl t = new EvalImpl();
		assertEquals(3.35, t.eval("1.1 + 2.25"));
	}
}
