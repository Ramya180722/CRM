package Campaign;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCampaignTest {
	@Test(groups = "SmokeTest")
	public void createCampaign() {
		Reporter.log("Created Campaign", true);
		}
}
