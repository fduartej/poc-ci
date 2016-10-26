package com.foo;

import org.junit.Test;

import static org.junit.Assert.fail;

public class FailingTest {

	@Test
	public void testAuthenticator() throws Exception {
		fail("FAIL!");
	}
	
}
