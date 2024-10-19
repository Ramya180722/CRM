package Organization;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOrganizationTest {
@Test(groups = "RegressionTest")
public void createOrganization() {
	Reporter.log("Created Organization Successfully", true);
	
	String BROWSER=System.getProperty("Browser");
	String URL=System.getProperty("Url");
	String UNAME=System.getProperty("Username");
	String PWD=System.getProperty("Password");
	Reporter.log("Browser is: "+BROWSER, true);
	Reporter.log("URL is: "+URL, true);
	Reporter.log("Username is: "+UNAME, true);
	Reporter.log("Password is: "+PWD, true);
	
}

}
