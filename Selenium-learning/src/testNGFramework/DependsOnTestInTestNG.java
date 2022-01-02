package testNGFramework;

import org.testng.annotations.Test;

public class DependsOnTestInTestNG {

	@Test
	public void loginTest() {
		System.out.println("loginTest");
	}
	
	@Test(dependsOnMethods = {"loginTest"})
	public void createAccountTest() {
		System.out.println("createAccountTest");
	}
	
	@Test(dependsOnMethods = {"loginTest","createAccountTest"})
	public void logoutTest() {
		System.out.println("logoutTest");
	}
	
	
	

}
