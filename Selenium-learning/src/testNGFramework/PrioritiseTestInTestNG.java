package testNGFramework;

import org.testng.annotations.Test;

public class PrioritiseTestInTestNG {

	 @Test(priority =1)
	 public void loginTest() {
		 System.out.println("loginTest");
	 }
	 
	 @Test(priority =2)
	 public void createAccountTest() {
		 System.out.println("createAccountTest");
	 }
	 
	 @Test(priority =3)
	 public void updateAccount() {
		 System.out.println("updateAccount");
	 }
	 
	 @Test(priority =4)
	 public void logoutTest() {
		 System.out.println("logoutTest");
	 }
	 
			

}
