package pages;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Link_FavoritesDashPage extends DriverFactory{
	Utilities utilities = new Utilities();
	By linkhamburgericon = By.xpath("//*[@id='SidebarTogglerIcon']");
	By FavoritesDash = By.xpath("//span[text()='Favorites Dash']");
	By AddPanels = By.xpath("//span[text()='Add Panels']");
	By Findtextfield = By.xpath("//input[@id='rdInputAddPanelFind']");
	By textfield = ( By.xpath("//input[@id='rdInputAddPanelFind']"));
	By Gallery = (By.xpath("//select[@name='rdInputGalleryFilter']"));
	By favourites =(By.xpath("//option[text()='Favorites']"));
	By Done = By.xpath("//span[@id='ppDoneButton']");
	By ChangeLayout= By.xpath("//span[@id='btnChangeLayout']//span[text()='Change Layout']");
	By Numberofpanelcolumn = By.xpath("//select[@id='lstColumnCount']");
	By Done1 = By.xpath("//span[@id='tabLayoutDoneButton']");
	By DeleteUnusedPanels = By.xpath("(//span[@id='btnAddPanels'])[2]");
	By Findtext = By.xpath("//input[@name='rdInputAddPanelFind']");
	By Gallery1 = By.xpath("//select[@name='rdInputGalleryFilter']");
	By Done2 = By.xpath("(//span[@id='ppDoneButton'])");
	By Filters= By.xpath("//span[text()='Filters']");

	public void user_validates_all_the_fields_in_link_favoritesdashboardpage() throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.webDriverWait(driver, FavoritesDash);
		driver.findElement(FavoritesDash).click();
		utilities.webDriverWait(driver, AddPanels);
		driver.findElement(AddPanels).click();
		utilities.webDriverWait(driver, Findtextfield);
		driver.findElement(Findtextfield).click();
		utilities.webDriverWait(driver, Done);
		driver.findElement(textfield).sendKeys("TestUser_New");
		utilities.webDriverWait(driver, Gallery);
		driver.findElement(favourites).click();
		utilities.webDriverWait(driver, Done);
		driver.findElement(Done).click();
		utilities.webDriverWait(driver, ChangeLayout);
		driver.findElement(ChangeLayout).click();
		utilities.webDriverWait(driver,Numberofpanelcolumn );
		utilities.SelectByValueFromDropdown(driver, Numberofpanelcolumn, "Free-form");
		utilities.webDriverWait(driver,Done1 );
		driver.findElement(Done1).click();
		utilities.webDriverWait(driver,DeleteUnusedPanels );
		driver.findElement(DeleteUnusedPanels).click();
		utilities.webDriverWait(driver,Findtext );
		driver.findElement(Findtext).sendKeys("");
		utilities.webDriverWait(driver,Gallery1 );
		driver.findElement(favourites).click();
		utilities.webDriverWait(driver,Done2 );
		driver.findElement(Done2).click();
		utilities.webDriverWait(driver, Filters);
		driver.findElement(Filters).click();
	}


	}


	
