package pages;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Logout extends DriverFactory{
	Utilities utilities = new Utilities();
	By UserIcon = By.xpath("//div[@class='scs-user-icon']");
	By LogoutLink = By.xpath("//span[contains(text(),'Logout')]");
	By txtUsername = By.cssSelector("input#Username");
	
	public void clickLogout() throws Throwable {
		utilities.webDriverWait(driver, UserIcon);
		boolean ElementPresent = driver.findElements(UserIcon).size()>0;
        if(ElementPresent) {
        	driver.findElement(UserIcon).click();
        	utilities.MediumWait(driver);
        	driver.findElement(LogoutLink).click();
        	utilities.webDriverWait(driver, txtUsername);
        	driver.findElement(txtUsername).click();
        }
	}
}
