package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverFactory;
import util.Utilities;

public class Voiding_Records_OEEBatch_Live_Env extends DriverFactory{

	Utilities utilities = new Utilities();
	By records = By.xpath("//div[@id='MenuWrapper']//span[text()='Records']");
	By linkhamburgericon = By.xpath("//i[@id='SidebarTogglerIcon']");
	By Filters = By.xpath("//span[text()='Filters']");
	By Identifiers = By.xpath("//span[text()='Identifiers']");
	By IdentifierNameFilter_Dropdown = By.xpath("//select[@id='IdentifierNameFilter']");
	By IdentifierValueFilter = By.xpath("//input[@id='IdentifierValueFilter']");
	By MegaFilterOfSpecificBatch = By.xpath("//span[text()='"+prop.getProperty("BatchName")+"']/parent::td/preceding-sibling::td[@id='fast_Row1']/span/i");
	By BatchRecords = By.xpath("//span[@class=' text-primary cursor-pointer']");
	By BatchFirstRecord = By.xpath("//tr[1]//span[@class=' text-primary cursor-pointer']");
	By MoreRecords = By.xpath("//span[text()='MORE RECORDS']");
	By VoidOEEBatchRecord = By.xpath("//div[@class='scs-form-bottom-buttons ng-scope']/button[text()='VOID']");
	By ReasonForVoidInPopup = By.xpath("//textarea[@id='scs-void-record-commentsText']");
	By VoidButtoninPopup = By.xpath("//div[@class='ui-dialog-buttonset']//button[text()='VOID']");
	By Grid = By.xpath("//a//span[text()='Grid']");
	int k=0;
	
	public void VoidingRecordsiInOEEBatch() throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(records).click();
		utilities.webDriverWait(driver, Filters);
		driver.findElement(Filters).click();
		utilities.webDriverWait(driver, Identifiers);
		driver.findElement(Identifiers).click();
		utilities.webDriverWait(driver, IdentifierNameFilter_Dropdown);
		utilities.SelectByValueFromDropdown(driver, IdentifierNameFilter_Dropdown, "BatchID");
		utilities.MinimumWait(driver);
		driver.findElement(IdentifierValueFilter).sendKeys(prop.getProperty("BatchName"));
		Thread.sleep(2000);
		utilities.webDriverWait(driver, MegaFilterOfSpecificBatch);
		driver.findElement(MegaFilterOfSpecificBatch).click();
		Thread.sleep(6000);
		utilities.webDriverWait(driver, BatchFirstRecord);
		int attempts = 0;
	    while(attempts < 5) 
	    {
	        try {
	                Thread.sleep(2000);
	                Boolean isPresent = driver.findElements(MoreRecords).size()>0;
	                if (isPresent) 
	                {
	                	if (driver.findElement(MoreRecords).isDisplayed() && driver.findElement(MoreRecords).isEnabled()) {
	                		Thread.sleep(1000);
	                		driver.findElement(MoreRecords).click();
	                	}
	                }
	        	} 
	        catch(Exception e) {
	        }
	        attempts++;
	    }
	    
		List<WebElement> elementName = driver.findElements(BatchRecords);
		int a = elementName.size();
		int Quotient = Math.round((a/9));
		int remainder = a % 9;
		for(int i=1;i<=Quotient+1;i++) {
			if(i==Quotient+1) {
				k=remainder;
			}
			else {
				k=9;
			}
			Thread.sleep(3000);
			Actions action2 = new Actions(driver);
			WebElement element2 = driver.findElement(Grid);
			Thread.sleep(2000);
			action2.moveToElement(element2).click().perform();
			Thread.sleep(2000);
			
			for (int j=1;j<=k;j++) {
				utilities.webDriverWait(driver, BatchFirstRecord);
				Actions action = new Actions(driver);
				WebElement element = driver.findElement(By.xpath("//tr["+j+"]//span[@class=' text-primary cursor-pointer']/ancestor::td/following-sibling::td[12]"));
				Thread.sleep(2000);
				action.moveToElement(element).click().perform();
				Thread.sleep(5000);
				String parent=driver.getWindowHandle();
				Set<String> allWindows=driver.getWindowHandles();
				Iterator<String> I1= allWindows.iterator();
				while(I1.hasNext())
				{
					String child_window=I1.next();
					if(!parent.equals(child_window))
					{
						driver.switchTo().window(child_window);
					}
				}
				utilities.webDriverWait(driver,VoidOEEBatchRecord);
				driver.findElement(VoidOEEBatchRecord).click();
				utilities.webDriverWait(driver,ReasonForVoidInPopup);
				driver.findElement(ReasonForVoidInPopup).sendKeys("Entered by Test Automation");
				Thread.sleep(1000);
				driver.findElement(VoidButtoninPopup).click();
				System.out.println("Record "+i+" is voided");
				Thread.sleep(5000);
				driver.close();
				Thread.sleep(2000);
				driver.switchTo().window(parent);
				String parent1=driver.getWindowHandle();
				Set<String> allWindows1=driver.getWindowHandles();
				Iterator<String> I2= allWindows1.iterator();
				while(I1.hasNext())
				{
					String child_window=I2.next();
					if(!parent1.equals(child_window))
					{
						driver.switchTo().window(child_window);
					}
				}
			}
		}
	}
	
}
