package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TestSetFrom extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testSetFrom1() throws EmailException {
		/*
		 * Sets the from email to a@b.com and tests to see that
		 * it was set within testEmail
		 */
		testEmail.setFrom("a@b.com");
		assertEquals("value should be a@b.com","a@b.com", testEmail.getFromAddress().toString());
		System.out.println("ABC959, This tests the SetFrom Method by adding the eail a@b.com and checks to see that it was set correctly");
	}

}
