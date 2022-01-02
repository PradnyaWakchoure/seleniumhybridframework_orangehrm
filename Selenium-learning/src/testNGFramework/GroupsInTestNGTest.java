package testNGFramework;

import org.testng.annotations.Test;

public class GroupsInTestNGTest {

	@Test(groups = {"smoke"})
	public void loginTest() {
		System.out.println("Smoke Test group");
	}
	
	@Test(groups = {"regression"})
	public void register() {
		System.out.println("Regression Test group");
	}
	
	
	@Test(groups = {"sanity"})
	public void creatAccount() {
		System.out.println("Sanity Test group");
	}
	
	

}
