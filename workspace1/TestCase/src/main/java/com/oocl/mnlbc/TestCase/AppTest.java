package com.oocl.mnlbc.TestCase;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdd() {
		App app = new App();
		assertEquals(3, app.Add(2, 1));
	}

	public void testSubt() {
		App app = new App();
		assertEquals(3, app.subt(4, 1));
	}

	public void testMult() {
		App app = new App();
		assertEquals(2, app.mult(2, 1));
	}

	public void testDiv() {
		App app = new App();
		assertEquals(3, app.div(6, 2));
	}

}
