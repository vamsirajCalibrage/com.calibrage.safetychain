package pages;

import util.Utilities;
import org.openqa.selenium.By;
import util.DriverFactory;


public class LoginPage extends DriverFactory{
	Utilities utilities = new Utilities();
	By txtUsername = By.cssSelector("input#Username");
	By txtPassword = By.cssSelector("input#Password");
	By btnLogin = By.cssSelector(".common-button");
	By Details = By.xpath("//div[contains(text(),'Details')]");
	
	public void User_login_into_SIMS() throws Throwable {
		driver.get(prop.getProperty("url"));
		}
	
	public void enterUserNameAndPassword() throws Throwable {
		utilities.webDriverWait(driver, txtUsername);
        boolean ElementPresent = driver.findElements(txtUsername).size()>0;
        if(ElementPresent) {
        driver.findElement(txtUsername).sendKeys(prop.getProperty("username"));
		Thread.sleep(1000);
		driver.findElement(txtPassword).sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
        }
	}
	
	public void enterwrongUserNameAndPassword() throws Throwable {
		utilities.webDriverWait(driver, txtUsername);
        boolean ElementPresent = driver.findElements(txtUsername).size()>0;
        if(ElementPresent) {
        driver.findElement(txtUsername).sendKeys(prop.getProperty("username"));
		Thread.sleep(1000);
		driver.findElement(txtPassword).sendKeys("abcd");
		Thread.sleep(1000);
        }
	}
	
	public void clickLoginBtn() throws Throwable {
		boolean ElementPresent = driver.findElements(btnLogin).size()>0;
        if(ElementPresent) {
        	driver.findElement(btnLogin).click();
        	utilities.WaitUntilPageIsLoaded(driver);
        }
	}
	
	public void NavigatedToHomePage() throws Throwable {
		utilities.webDriverWait(driver, Details);
		Boolean isPresent = driver.findElements(Details).size()>0;
		if (isPresent) {
			utilities.webDriverWait(driver, Details);
			driver.findElement(Details).click();
		}
	}
	
}
