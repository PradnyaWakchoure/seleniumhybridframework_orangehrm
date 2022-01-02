package testNGFramework;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestInTestNG {

	 @Test 
	    
	    @Parameters({"user","pwd"})
	    
	    public void loginTest (@Optional("Virat") String username, @Optional("Virat@123") String password) {
	    	System.out.println("username is: "+username);
	    			System.out.println("password is: "+password);

}
}