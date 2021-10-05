package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage {

	@FindBy(name = "finish")
	WebElement btnFinish;
	
	@FindBy(name = "cancel")
	WebElement btnCancel;
	
	public void clicarBtnFinish() {
		btnFinish.click();
	}
}
