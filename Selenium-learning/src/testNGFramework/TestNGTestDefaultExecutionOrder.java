package testNGFramework;

import org.testng.annotations.Test;

public class TestNGTestDefaultExecutionOrder {
	
	@Test
	public void loginTest() {
		System.out.println("loginTest");
	}
	
	@Test
	public void createAccountTest() {
		System.out.println("createAccountTest");
	}
	
	@Test
	public void  updateAccountTest() {
		System.out.println("updateAccountTest");
	}
	
	@Test
	public void logoutTest() {
		System.out.println("logoutTest");
	}


	}


