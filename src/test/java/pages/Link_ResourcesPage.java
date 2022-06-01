package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import util.DriverFactory;
import util.Utilities;

public class Link_ResourcesPage extends DriverFactory {
	Utilities utilities = new Utilities();
	By resources = By.xpath("//div[@id='MenuWrapper']//span[text()='Resources']");
    By linkhamburgericon = By.xpath("//*[@id='SidebarTogglerIcon']");
    By SafetyChainImage = By.xpath("//img[@src='_SupportFiles/M.Images.sc-logo-40.png']");
    By EightHour = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'8h')]");
	By EightHourDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 8 Hours Ago' or text()='Select a Range']");
	By TwelveHours = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'12h')]");
	By TwelveHoursDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 12 Hours Ago' or text()='Select a Range']");
	By OneDay = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1D')]");
	By TwentyFourHoursDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 24 Hours Ago' or text()='Select a Range']");
	By TwoDays = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'2D')]");
	By TwoDaysDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 2 Days Ago' or text()='Select a Range']");
	By OneWeek = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1W')]");
	By OneWeekDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 7 Days Ago' or text()='Select a Range']");
	By TwoWeeks = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'2W')]");
	By FourteenDaysDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 14 Days Ago' or text()='Select a Range']");
	By OneMonth = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1M')]");
	By OneMonthDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 30 Days Ago' or text()='Select a Range']");
	By ThreeMonths = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'3M')]");
	By ThreeMonthsDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 90 Days Ago' or text()='Select a Range']");
	By SixMonths = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'6M')]");
	By SixMonthsDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 180 Days Ago' or text()='Select a Range']");
	By OneYear = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1Y')]");
	By OneYearDatepicker = By.xpath(
			"//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 365 Days Ago' or text()='Select a Range']");
	
	By Filters = By.xpath("//span[text()='Filters']");
	By Close_Filters = By.xpath("//span[text()='Close']");
	
	By RGroupByType = By.xpath("//input[@id='selShowHeader']");
	By Rshowattributes = By.xpath("//input[@name='selShowAttributes']");
	By Rshowcategories = By.id("selShowCategories");
	By Rexport = By.xpath("//span/span[text()='Export']");
	By selectattribute = By.id("selAttributeName");
	By NoRecords = By.xpath("//span[text()='No Records']");
	
	By attributesbutton = By.xpath("//*[text()='Attributes']");
	By Aexport = By.xpath("//span/span[text()='Export']");
	
	By RLinks = By.xpath("//*[text()='Links']");
	By RGroupBySource = By.xpath("//input[@id='selShowHeader']");
	By Lexport = By.xpath("//span/span[text()='Export']");
	By ResourcesType = By.xpath("//select[@name='selResourceType']|//select[@name='selFromResourceType']");
	By ResourcesTypeValue = By.xpath("//div[@id='rdDataTableDiv-DataResourceGrid']//tbody/tr[1]/td[1]/span|//div[@id='rdDataTableDiv-CrossTabResources']//tbody/tr[1]/td[1]/span");
	By ResourcesTypeValue1 = By.xpath("//div[@id='rdDataTableDiv-DataResourceGrid']//tbody/tr[1]/td[1]/span|//div[@id='rdDataTableDiv-CrossTabResources']//tbody/tr[1]/td[1]/span");
	By AttributesValue = By.xpath("//*[@id='selAttributeName']/option");
	
	By formsbutton = By.xpath("//div[@id='Resource-Form']//span[text()='Forms']");
	
	
	public void User_click_on_Resources_under_Hamburger_in_Linkpage() throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
        driver.findElement(linkhamburgericon).click();
        utilities.webDriverWait(driver, resources);
		driver.findElement(resources).click();
	}
	
	public void validating_Link_ResourcePage_Hamburger_SafetyChainLogo_DatePickers() throws Throwable {
		utilities.webDriverWait(driver, SafetyChainImage);
		driver.findElement(SafetyChainImage).click();

		driver.findElement(EightHour).click();
		utilities.webDriverWait(driver, EightHourDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(EightHourDatepicker).click();

		driver.findElement(TwelveHours).click();
		utilities.webDriverWait(driver, TwelveHoursDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(TwelveHoursDatepicker).click();

		driver.findElement(OneDay).click();
		utilities.webDriverWait(driver, TwentyFourHoursDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(TwentyFourHoursDatepicker).click();

		driver.findElement(TwoDays).click();
		utilities.webDriverWait(driver, TwoDaysDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(TwoDaysDatepicker).click();

		driver.findElement(OneWeek).click();
		utilities.webDriverWait(driver, OneWeekDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(OneWeekDatepicker).click();

		driver.findElement(TwoWeeks).click();
		utilities.webDriverWait(driver, FourteenDaysDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(FourteenDaysDatepicker).click();

		driver.findElement(OneMonth).click();
		utilities.webDriverWait(driver, OneMonthDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(OneMonthDatepicker).click();

		driver.findElement(ThreeMonths).click();
		utilities.webDriverWait(driver, ThreeMonthsDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(ThreeMonthsDatepicker).click();

		driver.findElement(SixMonths).click();
		utilities.webDriverWait(driver, SixMonthsDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(SixMonthsDatepicker).click();

		driver.findElement(OneYear).click();
		utilities.webDriverWait(driver, OneYearDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(OneYearDatepicker).click();
	}
		
		public void validating_Link_ResourcesPage_Filters() throws Throwable {
			driver.findElement(Filters).click();
			utilities.webDriverWait(driver, Close_Filters);
			driver.findElement(Close_Filters).click();
	}
		public void validating_Alldropdown() throws Throwable {
			utilities.webDriverWait(driver, SafetyChainImage);
			utilities.PerformClickUsingJavaScriptExecutor(driver, SafetyChainImage);
			utilities.MaximumWait(driver);
			
			utilities.webDriverWait(driver, ResourcesType);
//			driver.findElement(SafetyChainImage).click();
	    	Select s = new Select(driver.findElement(ResourcesType));
	    	List<WebElement> l = s.getOptions();
	    	l.size();

	        // Click the dropdown and click each option one by one
	        for (int i = 0; i < l.size()+1; i++) {
	        	Select s1 = new Select(driver.findElement(ResourcesType));
	        	utilities.MaximumLongWait(driver);
	        	if(i==6){
	        		s1.selectByVisibleText("All");
	        		utilities.MaximumLongWait(driver);
	        		
	        	}
	        	else if(i==0){
	        		s1.selectByVisibleText("All");
	        		utilities.MaximumWait(driver);
	        		utilities.webDriverWait(driver, ResourcesTypeValue);
	        		String Items = driver.findElement(ResourcesTypeValue).getText();
	        		if(!Items.equals("Customers") || !Items.equals("Items") || !Items.equals("Suppliers") || !Items.equals("Equipment")){
	        			utilities.PerformClickUsingJavaScriptExecutor(driver, ResourcesTypeValue);
	        		}
	        		else {
	        			driver.findElement(ResourcesTypeValue1).click();
	        		}
	        	}
	        	else if(i==1){
	        		utilities.webDriverWait(driver, ResourcesType);
	        		s1.selectByVisibleText("Items");
	        		utilities.MaximumLongWait(driver);
	        		String Items = driver.findElement(ResourcesTypeValue).getText();
	        		if(!Items.equals("Items")){
	        			utilities.PerformClickUsingJavaScriptExecutor(driver, ResourcesTypeValue1);
	        		}
	        	}
	        	else if(i==2){
	        		utilities.webDriverWait(driver, ResourcesType);
	        		s1.selectByVisibleText("Suppliers");
	        		utilities.MaximumLongWait(driver);
	        		String Items = driver.findElement(ResourcesTypeValue).getText();
	        		if(!Items.equals("Suppliers")){
	        			utilities.PerformClickUsingJavaScriptExecutor(driver, ResourcesTypeValue1);
	        		}
	        	}
	        	else if(i==3){
	        		utilities.webDriverWait(driver, ResourcesType);
	        		s1.selectByVisibleText("Equipment");
	        		utilities.MaximumLongWait(driver);
	        		String Items = driver.findElement(ResourcesTypeValue).getText();
	        		if(!Items.equals("Equipment")){
	        			utilities.PerformClickUsingJavaScriptExecutor(driver, ResourcesTypeValue1);
	        		}
	        	}
	        	else if(i==4){
	        		utilities.webDriverWait(driver, ResourcesType);
	        		s1.selectByVisibleText("Customers");
	        		utilities.MaximumLongWait(driver);
	        		String Items = driver.findElement(ResourcesTypeValue).getText();
	        		if(!Items.equals("Customers")){
	        			utilities.PerformClickUsingJavaScriptExecutor(driver, ResourcesTypeValue1);
	        		}
	        	}
	        	
	        	else if(i==5){
	        		utilities.webDriverWait(driver, ResourcesType);
	        		s1.selectByVisibleText("PlantResourceType");
	        		utilities.MaximumLongWait(driver);
	        		utilities.MaximumLongWait(driver);
	        		String Items = driver.findElement(NoRecords).getText();
	        		if(!Items.equals("No Records")){
	        			utilities.PerformClickUsingJavaScriptExecutor(driver, ResourcesTypeValue);
	        		}
	        	}
	        }
		}
		
		public void validating_Attributedropdown() throws Throwable {
			utilities.webDriverWait(driver, SafetyChainImage);
			driver.findElement(SafetyChainImage).click();
	    	Select s = new Select(driver.findElement(selectattribute));
	    	List<WebElement> g = s.getOptions();
	    	g.size();

	        // Click the dropdown and click each option one by one
	        for (int i = 0; i < g.size()+1; i++) {
	        	Select s1 = new Select(driver.findElement(selectattribute));
	        	utilities.MediumWait(driver);
	        	if(i==24){
	        		s1.selectByVisibleText("Select Attribute");
	        		utilities.MaximumLongWait(driver);
	        	}
	        	else if(i==0){
	        		s1.selectByVisibleText("Select Attribute");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Customers")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        		}
	        	}
	        	else if(i==1){
	        		s1.selectByVisibleText("Approval Status");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Suppliers")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        		}
	        	}
	        	else if(i==2){
	        		s1.selectByVisibleText("Area");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Customers")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        		}
	        	}
	        	else if(i==3){
	        		s1.selectByVisibleText("City");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Customers")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==4){
	        		s1.selectByVisibleText("Country");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Country")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==5){
	        		s1.selectByVisibleText("District");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("District")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==6){
	        		s1.selectByVisibleText("GFSI Certification");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("GFSI Certification")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==7){
	        		s1.selectByVisibleText("Line");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Line")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==8){
	        		s1.selectByVisibleText("Location Type");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Location Type")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==9){
	        		s1.selectByVisibleText("Make");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Make")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==10){
	        		s1.selectByVisibleText("Map View Link");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Map View Link")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==11){
	        		s1.selectByVisibleText("Material Type");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Material Type")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==12){
	        		s1.selectByVisibleText("OEE Loss Category");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("OEE Loss Category")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==13){
	        		s1.selectByVisibleText("OEE Loss Category");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("OEE Loss Reporting")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        	}
	        	else if(i==14){
	        		s1.selectByVisibleText("Plant #");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Plant #")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==15){
	        		s1.selectByVisibleText("Region");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Region")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==16){
	        		s1.selectByVisibleText("Risk Level");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Risk Level")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==17){
	        		s1.selectByVisibleText("State/Provence");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("State/Provence")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==18){
	        		s1.selectByVisibleText("State/Province");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("State/Province")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==19){
	        		s1.selectByVisibleText("Status");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Status")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==20){
	        		s1.selectByVisibleText("Sub Region");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Sub Region")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==21){
	        		s1.selectByVisibleText("Supplier Type");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Supplier Type")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==22){
	        		s1.selectByVisibleText("Unit Type");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Unit Type")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	else if(i==23){
	        		s1.selectByVisibleText("Vendor ID");
	        		utilities.MaximumLongWait(driver);
	        		String ApprovalStatus = driver.findElement(AttributesValue).getText();
	        		if(!ApprovalStatus.equals("Vendor ID")){
	        			driver.findElement(AttributesValue).click();
	        			utilities.MediumWait(driver);
	        			}
	        		}
	        	}
		}   	
	        	public void validating_checkboxes() throws Throwable {
	        		utilities.MaximumWait(driver);
	    			utilities.webDriverWait(driver, RGroupByType);
	    			utilities.PerformClickUsingJavaScriptExecutor(driver, RGroupByType);
	    			
//	    			driver.findElement(RGroupByType).click();
	    			utilities.MaximumWait(driver);
	    			utilities.webDriverWait(driver, Rshowattributes);
	    			utilities.PerformClickUsingJavaScriptExecutor(driver, Rshowattributes);

	    			utilities.MaximumWait(driver);
	    			utilities.webDriverWait(driver, Rshowcategories);
	    			utilities.PerformClickUsingJavaScriptExecutor(driver, Rshowattributes);
	    			
	    			utilities.MaximumWait(driver);
	    			utilities.webDriverWait(driver, Rexport);
	    			utilities.PerformClickUsingJavaScriptExecutor(driver, Rexport);
	    			utilities.MaximumWait(driver);
	        }
		
	        	public void User_click_on_Attributesbutton_in_Resourcepage() throws Throwable {
	        		utilities.webDriverWait(driver, SafetyChainImage);
	        		utilities.PerformClickUsingJavaScriptExecutor(driver, SafetyChainImage);
	        		utilities.MaximumWait(driver);
	        		
	        		utilities.webDriverWait(driver, attributesbutton);
	        		utilities.PerformClickUsingJavaScriptExecutor(driver, attributesbutton);
	        		utilities.MaximumWait(driver);

	        		utilities.webDriverWait(driver, RGroupByType);
	        		utilities.PerformClickUsingJavaScriptExecutor(driver, RGroupByType);
	        		utilities.MaximumWait(driver);

	        		utilities.webDriverWait(driver, Rshowattributes);
	        		utilities.PerformClickUsingJavaScriptExecutor(driver, Rshowattributes);
	        		utilities.MaximumWait(driver);

	    			utilities.webDriverWait(driver, Rshowcategories);
	    			utilities.PerformClickUsingJavaScriptExecutor(driver, Rshowcategories);
	    			utilities.MaximumWait(driver);

	    			utilities.webDriverWait(driver, Aexport);
	    			utilities.PerformClickUsingJavaScriptExecutor(driver, Aexport);
	    			utilities.MaximumWait(driver);
	    			
	        	}
	    			
	    			public void User_click_on_linksbutton_in_Resourcepage() throws Throwable {
	    				utilities.webDriverWait(driver, SafetyChainImage);
	    				utilities.PerformClickUsingJavaScriptExecutor(driver, SafetyChainImage);
	    				utilities.MaximumWait(driver);
	    				
		    			utilities.webDriverWait(driver, RLinks);
		    			utilities.PerformClickUsingJavaScriptExecutor(driver, RLinks);
		    			utilities.MaximumWait(driver);
		    			
		    			utilities.webDriverWait(driver, RGroupBySource);
		    			utilities.PerformClickUsingJavaScriptExecutor(driver, RGroupBySource);
		    			utilities.MaximumWait(driver);
		    			
		    			utilities.webDriverWait(driver, Rshowattributes);
		    			utilities.PerformClickUsingJavaScriptExecutor(driver, Rshowattributes);
		    			utilities.MaximumWait(driver);
		    			
		    			utilities.webDriverWait(driver, Rshowcategories);
		    			utilities.PerformClickUsingJavaScriptExecutor(driver, Rshowcategories);
		    			utilities.MaximumWait(driver);
		    			
		    			utilities.webDriverWait(driver, Lexport);
		    			utilities.PerformClickUsingJavaScriptExecutor(driver, Lexport);
		    			utilities.MaximumWait(driver);
	    			}
	    			
	    			public void User_click_on_formsbutton_in_Resourcepage() throws Throwable {
	    				utilities.webDriverWait(driver, SafetyChainImage);
	    				utilities.PerformClickUsingJavaScriptExecutor(driver, SafetyChainImage);
		    			utilities.webDriverWait(driver, formsbutton);
		    			utilities.PerformClickUsingJavaScriptExecutor(driver, formsbutton);
		    			utilities.MaximumWait(driver);
		    			utilities.webDriverWait(driver, RGroupBySource);
		    			utilities.PerformClickUsingJavaScriptExecutor(driver, RGroupBySource);
		    			utilities.MaximumWait(driver);
		    			utilities.webDriverWait(driver, Lexport);
		    			utilities.PerformClickUsingJavaScriptExecutor(driver, Lexport);
		    			utilities.MaximumWait(driver);

	    			}
}




