package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TestAddBcc extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddBcc1() throws EmailException {
		/*
		 * Adding 4 bcc emails using the addBcc() method
		 * and checking to see that the 4 emails are stored
		 */
		String[] fourTestEmails = {"a@b.com", "a@c.com", "a@d.com", "a@e.com"};
		testEmail.addBcc(fourTestEmails);
		assertEquals("value should be a@b.com","a@b.com", testEmail.getBccAddresses().get(0).toString());
		assertEquals("value should be a@c.com","a@c.com", testEmail.getBccAddresses().get(1).toString());
		assertEquals("value should be a@d.com","a@d.com", testEmail.getBccAddresses().get(2).toString());
		assertEquals("value should be a@e.com","a@e.com", testEmail.getBccAddresses().get(3).toString());
		System.out.println("ABC959, This test is for the AddBcc method, it adds 4 emails using an array and tests if those 4 emails are set correctly.");
	}

}
