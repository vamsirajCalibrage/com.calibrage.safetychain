package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class Link_HomePage extends DriverFactory{
	
	public static String Link_Version_Number = null;
	public static String ScheduleTasksComplete = null;
	public static String ScheduleTasksInactive = null;
	public static String LinkHomePageDocuments_Documents_Text = null;
	public static String LinkHomePageDocuments_Expired_Text = null;
	public static String ScheduleTasksOpen = null;
	public static String SuppliersLink = null;
	public static String ReqsLink = null;
	public static String ExpiredLink = null;
	public static String PendingLink = null;
	public static String LateLink = null;
	public static String SignOff = null;
	public static String WebPage_DetailsButton = null;
	public static String RecordSignoff = null;
	public static String SaveReport = null;
	
	Utilities utilities = new Utilities();
	By Header_SafetychainLogo = By.xpath("//span[@id='SidebarToggler']/following-sibling::div[@class='navbar-brand mr-auto hidden-xs-down']/img");
	
	By webhamburgericon = By.xpath("//div[@id='scs-global-nav']//*[local-name()='svg']");
	By link = By.xpath("//div[contains(text(),'LINK')]");
	
	By Link_Version = By.xpath("//span[@id='banner']/span");
	By linkhamburgericon = By.xpath("//i[@id='SidebarTogglerIcon']");
	By SafetyChainImage = By.xpath("//img[@src='_SupportFiles/M.Images.sc-logo-40.png']");
	
	By SearchLocationsEditField = By.xpath("//input[@class='form-control sc-gbl']");
	By EightHour = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'8h')]");
	By EightHourDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 8 Hours Ago' or text()='Select a Range']");
	By TwelveHours = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'12h')]");
	By TwelveHoursDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 12 Hours Ago' or text()='Select a Range']");
	By OneDay = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1D')]");
	By TwentyFourHoursDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 24 Hours Ago' or text()='Select a Range']");
	By TwoDays = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'2D')]");
	By TwoDaysDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 2 Days Ago' or text()='Select a Range']");
	By OneWeek = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1W')]");
	By OneWeekDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 7 Days Ago' or text()='Select a Range']");
	By TwoWeeks = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'2W')]");
	By FourteenDaysDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 14 Days Ago' or text()='Select a Range']");
	By OneMonth = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1M')]");
	By OneMonthDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 30 Days Ago' or text()='Select a Range']");
	By ThreeMonths = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'3M')]");
	By ThreeMonthsDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 90 Days Ago' or text()='Select a Range']");
	By SixMonths = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'6M')]");
	By SixMonthsDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 180 Days Ago' or text()='Select a Range']");
	By OneYear = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1Y')]");
	By OneYearDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 365 Days Ago' or text()='Select a Range']");
	
	By Filters = By.xpath("//span[text()='Filters']");
	By Close_Filters = By.xpath("//span[text()='Close']");
	
	By Records = By.xpath("//div[@id='mstrSummary']//span[text()='Records']");
	By Pass_Percentage = By.xpath("//div[@id='mstrSummary']//span[text()='Pass']");
	By Refresh = By.xpath("//div[@id='mstrSummary']//div[@id='refresh_Row1']/i");
	
	By User = By.xpath("//div[text()='Admin Profile']/parent::div[@class='d-flex flex-row ']");
	By AdminProfile = By.xpath("//div[text()='Admin Profile']");
	
	By MyDashboards = By.xpath("//div[text()='My Dashboards']");
	By DashBuilder = By.xpath("//span[text()='Dash Builder']");
	By DashBuilder_Settings = By.xpath("//legend[text()='Settings']");
	By MyDashboards_FavouritesDash = By.xpath("//div[@id='Favorit']//span[text()='Favorites Dash']");
	By FavouritesDash_ChangeLayout = By.xpath("//div[@class='add-panels ml-1 mb-1']//span[text()='Change Layout']");
	
	By Records_widget = By.xpath("//div[@id='Rec']//span[text()='Records']");
	By Recordswidget_Records = By.xpath("//ol[@id='RecordSum']//div[text()='Records']");
	By Recordswidget_Pass = By.xpath("//ol[@id='RecordSum']//div[text()='Pass']");
	By Recordswidget_Grid = By.xpath("//div[@id='NavButton']//span[text()='Grid']");
	By Grid_Verify = By.xpath("//a[text()='Verify']");
	By Recordswidget_Spreadsheet = By.xpath("//div[@id='NavButton']//span[text()='Spreadsheet']");
	By Spreadsheet_FormsFilter_InputField = By.xpath("//input[@id='SSFormNameFilter']");
	By Recordswidget_Tasks = By.xpath("//div[@id='NavButton']//span[text()='Tasks']");
	By Tasks_Taskname_InputField = By.xpath("//input[@id='selTaskName']");
	By Recordswidget_Saved = By.xpath("//div[@id='NavButton']//a[text()='Saved']");
	By Tachometer = By.xpath("//i[@class='fa fa-tachometer']");	
	By Tachometer_RecordLimit = By.xpath("//span[contains(text(),'Clipped Features are Visible Below ')]");
	
	By ScheduledTasks = By.xpath("//span[text()='Scheduled Tasks']");
	By Open = By.xpath("//div[text()='Open']");
	By ScheduleTasks_Open = By.xpath("//span[text()='Open']");
	By ScheduleTasks_Complete = By.xpath("//span[text()='Complete']");
	By ScheduleTasks_Inactive = By.xpath("//span[text()='Inactive']");
	By PastDue = By.xpath("//div[text()='Past Due']");
	By DueLater = By.xpath("//div[text()='Due Later']");
	By Done = By.xpath("//div[text()='Done']");
	By Late = By.xpath("//div[text()='Late']");
	By OnTime = By.xpath("//div[text()='On Time']");
	By ViewScheduleTasks = By.xpath("//div[text()='View Scheduled Tasks']");
	
	By Documents = By.xpath("//div[text()='Documents']");
	By Documents_DocumentsLink = By.xpath("//div[text()='Documents']");
	By LinkHomePageDocuments_Documents = By.xpath("//div[text()='Documents']");
	By LinkHomePageDocuments_Expired = By.xpath("//div[text()='Expired']");
	By Expired = By.xpath("//div[text()='Expired']");
	By ViewDocuments = By.xpath("//div[text()='View Documents']");
	
	By Cases = By.xpath("//div[@class='card-header']/span[text()='Cases']");
	By Cases_MyOpenTasks = By.xpath("//div[text()='My Open Tasks']");
	By Cases_MyTasks = By.xpath("//div[text()='My Tasks']");
	By ViewCases = By.xpath("//div[text()='View Cases']");
	By ViewCases_AllCases = By.xpath("//input[@id='selCaseName']");
	
	By Suppliers = By.xpath("//div[@id='header']/span[text()='Suppliers']");
	By Suppliers_SuppliersLink = By.xpath("//div[text()='Suppliers']");
	By Suppliers_Suppliers_SuppliersLink = By.xpath("//div[text()='Suppliers']");
	By HomePageSuppliers_SuppliersLink_Suppliers = By.xpath("//div[text()='Suppliers']");
	By HomePageSuppliers_SuppliersLink_Reqs = By.xpath("//div[text()='Reqs']");
	By HomePageSuppliers_SuppliersLink_Expired = By.xpath("//div[text()='Expired']");
	By HomePageSuppliers_SuppliersLink_Pending = By.xpath("//div[text()='Pending']");
	By HomePageSuppliers_SuppliersLink_Late = By.xpath("//div[text()='Late']");
	By Suppliers_ReqsLink = By.xpath("//div[text()='Reqs']");
	By Suppliers_ExpiredLink = By.xpath("//div[@id='header']/span[text()='Suppliers']/../following-sibling::a//div[text()='Expired']");
	By Suppliers_PendingLink = By.xpath("//div[@id='header']/span[text()='Suppliers']/../following-sibling::a//div[text()='Pending']");
	By Suppliers_LateLink = By.xpath("//div[@id='header']/span[text()='Suppliers']/../following-sibling::a//div[text()='Late']");
	By ViewSuppliersLink = By.xpath("//div[text()='View Suppliers']");
	
	By Verifications = By.xpath("//div[@id='header']/span[text()='Verifications']");
	By Verifications_VerficationsLink = By.xpath("//div[@id='body']//span[text()='Verifications']");
	By Verifications_FieldsLink = By.xpath("//div[@id='body']//span[text()='Fields']");
	By Verifications_ImagesLink = By.xpath("//div[@id='body']//span[text()='Images']");
	By Verifications_SignoffLink = By.xpath("//div[@id='body']//span[text()='Signoff']");
	By Verifications_SignoffLink_SignoffButton = By.xpath("//div[@id='VerifyMode']//span[text()='Signoff']");
	
	By AdminTools = By.xpath("//span[text()='Admin Tools']");
	By AdminTools_FSQABrowserLink = By.xpath("//a[text()='FSQA Browser']");
	By AdminTools_Details = By.xpath("//div[text()='Details']");
	By AdminTools_AnalyticsLink = By.xpath("//a[text()='Analytics']");
	By AdminTools_RecordSignoffLink = By.xpath("//a[text()='Record Signoff']");
	By AdminTools_RecordSignoffLink_RecordSignoffText = By.xpath("//div[@id='scs-analytics-header']");
	
	By Reports = By.xpath("//div[text()='Reports']");
	By ReportBuilder = By.xpath("//div[@class='ml-auto']//span[text()='Report Builder']");
	By ReportBuilder_AllData = By.xpath("//div[@class='ml-auto']//span[text()='All Data']");
	By ReportBuilder_AllData_SaveReportButton = By.xpath("//input[@id='btnSave']");
	By ReportBuilder_Reports = By.xpath("//div[@class='ml-auto']//span[text()='Reports']");
	By ReportBuilder_Fields = By.xpath("//div[@class='ml-auto']//span[text()='Fields']");
	By Reports_MyReports = By.xpath("//div[text()='My Reports']");
	By Reports_GlobalReports = By.xpath("//div[text()='Global Reports']");
	
	By CustomReports = By.xpath("//div[text()='Custom Reports']");
	By CustomReports_CaseManagement = By.xpath("//span[text()='Case Management']");
	By CustomReports_CaseManagement_CaseName_InputField = By.xpath("//input[@id='selCaseName']");
	By CustomReports_CaseViewer = By.xpath("//span/following-sibling::span[text()='Case Viewer']");
	By CustomReports_CaseViewer_ClearPreview = By.xpath("//Span[contains(text(),'Clear Preview')]");
	
	By HomeLink_Under_Hamburger = By.xpath("//div[@id='MenuWrapper']//span[text()='Home']");
	By favoritesdash = By.xpath("//div[@id='MenuWrapper']//span[text()='Favorites Dash']");
	By records = By.xpath("//div[@id='MenuWrapper']//span[text()='Records']");
	By resources = By.xpath("//div[@id='MenuWrapper']//span[text()='Resources']");
	By documents = By.xpath("//div[@id='MenuWrapper']//span[text()='Documents']");
	By programs = By.xpath("//div[@id='MenuWrapper']//span[text()='Programs']");
	By suppliers = By.xpath("//div[@id='MenuWrapper']//span[text()='Suppliers']");
	By more = By.xpath("//div[@id='MenuWrapper']//span[text()='More...']/following-sibling::i");
	By audits = By.xpath("//div[@id='MenuWrapper']//span[text()='Audits']");
	By coautility = By.xpath("//div[@id='MenuWrapper']//span[text()='COA Utility']");
	By cooktochill = By.xpath("//div[@id='MenuWrapper']//span[text()='Cook to Chill']");
	By exceptions = By.xpath("//div[@id='MenuWrapper']//span[text()='Exceptions']");
	By export = By.xpath("//div[@id='MenuWrapper']//span[text()='Export']");
	By opscharts = By.xpath("//div[@id='MenuWrapper']//span[text()='Ops Charts']");
	By recordhistory = By.xpath("//div[@id='MenuWrapper']//span[text()='Record History']");
	By riskassessment = By.xpath("//div[@id='MenuWrapper']//span[text()='Risk Assessment']");
	By tagriskassessment = By.xpath("//div[@id='MenuWrapper']//span[text()='TAG Risk Assessment']");
	By validations = By.xpath("//div[@id='MenuWrapper']//span[text()='Validations']");
	By webhookresponse = By.xpath("//div[@id='MenuWrapper']//span[text()='WebHook Response']");
	By cases = By.xpath("//div[@id='MenuWrapper']//span[text()='Cases']");
	By forms = By.xpath("/html//div[@id='MenuWrapper']/div[10]/a[@href='javascript:void(0);']//span[@class='pl-1 sc-gbl']|//div[@id='MenuWrapper']//span[text()='Forms']");
	By caseViewer = By.xpath("//div[@id='MenuWrapper']//span[text()='Case Viewer']");
	By dynamicflows = By.xpath("//div[@id='MenuWrapper']//span[text()='Dynamic Flows']");
	By oee = By.xpath("//div[@id='MenuWrapper']//span[text()='OEE']/following-sibling::i");
	By livemonitoring = By.xpath("//div[@id='MenuWrapper']//span[text()='Live Monitoring']");
	By oeemonitoring = By.xpath("//div[@id='MenuWrapper']//span[text()='OEE Monitoring']");
	By eventanalysis = By.xpath("//div[@id='MenuWrapper']//span[text()='Event Analysis']");
	By oeeanalysis = By.xpath("//div[@id='MenuWrapper']//span[text()='OEE Analysis']");
	By oeekpi = By.xpath("//div[@id='MenuWrapper']//span[text()='OEE KPI']");
	By oeereportbuilder = By.xpath("//div[@id='MenuWrapper']//span[text()='OEE Report Builder']");
	By oeescheduler = By.xpath("//div[@id='MenuWrapper']//span[text()='OEE Scheduler']");
	By sensordiagnostic = By.xpath("//div[@id='MenuWrapper']//span[text()='Sensor Diagnostic']");
	By utilities_Link = By.xpath("//div[@id='MenuWrapper']//span[text()='Utilities']/following-sibling::i");
	By dashboardbuilder = By.xpath("//div[@id='MenuWrapper']//span[text()='Dashboard Builder']");
	By dateranges = By.xpath("//div[@id='MenuWrapper']//span[text()='Date Ranges']");
	By reportbuilder = By.xpath("//div[@id='MenuWrapper']//span[text()='Report Builder']");
	By supplierbuilder = By.xpath("//div[@id='MenuWrapper']//span[text()='Supplier Builder']");
	By clearfavorites = By.xpath("//div[@id='MenuWrapper']//span[text()='Clear Favorites']");
	By archiverecovery = By.xpath("//div[@id='MenuWrapper']//span[text()='Archive Recovery']");
	By admin = By.xpath("//div[@id='MenuWrapper']//span[text()='Admin']/following-sibling::i");
	By users = By.xpath("//div[@id='MenuWrapper']//span[text()='Users']");
	By secureprofiles = By.xpath("//div[@id='MenuWrapper']//span[text()='Secure Profiles']");
	By recordsharing = By.xpath("//div[@id='MenuWrapper']//span[text()='Record Sharing']");
	By webhooks = By.xpath("//div[@id='MenuWrapper']//span[text()='WebHooks']");
	By apiadmin = By.xpath("//div[@id='MenuWrapper']//span[text()='API Admin']");
	By logout = By.xpath("//div[@id='MenuWrapper']//span[text()='Logout']");
	
	By LangauageSelection = By.id("cbLanguageSelect");
	
	By LocationSearch = By.id("LocationNameFilterHome");
	By LocationName = By.xpath("//a[@id='flter_Row1']//i[@class='ti-location-pin mt-1']");
	By LocationFilter = By.xpath("//i[@title='Location']/following-sibling::span[contains(text(),'USA')]");
	By SuperAdminWidget = By.xpath("//i[@class='fa fa-lock mt-1']/following-sibling::span[text()='Admin']");
	By TestUserWidgets = By.xpath("//i[@class='fa fa-lock mt-1']/following-sibling::span/following-sibling::span");
	
	By Filters_PauseRefresh = By.xpath("//span[text()='Pause Refresh']");
	By Filters_SavedFilters = By.xpath("//a[text()='Saved Filters']");
	By Filters_Records = By.xpath("//ol[@id='RecordCount']//div[@id='RecordsCount_Row1']");
	By Filters_Pass = By.xpath("//ol[@id='RecordCount']//div[@id='pass_Row1']");
	
	By Filter_PauseRefresh_CheckBox = By.xpath("//input[@id='PauseFilter']");
	By Filter_Dates = By.xpath("//ol[@id='xDateFilterSelect']/li");
	By Filter_EightHour = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'8h')]");
	By Filter_EightHourDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 8 Hours Ago' or text()='Select a Range']");
	By Filter_TwelveHours = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'12h')]");
	By Filter_TwelveHoursDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 12 Hours Ago' or text()='Select a Range']");
	By Filter_OneDay = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'1D')]");
	By Filter_TwentyFourHoursDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 24 Hours Ago' or text()='Select a Range']");
	By Filter_TwoDays = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'2D')]");
	By Filter_TwoDaysDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 2 Days Ago' or text()='Select a Range']");
	By Filter_OneWeek = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'1W')]");
	By Filter_OneWeekDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 7 Days Ago' or text()='Select a Range']");
	By Filter_TwoWeeks = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'2W')]");
	By Filter_FourteenDaysDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 14 Days Ago' or text()='Select a Range']");
	By Filter_OneMonth = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'1M')]");
	By Filter_OneMonthDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 30 Days Ago' or text()='Select a Range']");
	By Filter_ThreeMonths = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'3M')]");
	By Filter_ThreeMonthsDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 90 Days Ago' or text()='Select a Range']");
	By Filter_SixMonths = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'6M')]");
	By Filter_SixMonthsDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 180 Days Ago' or text()='Select a Range']");
	By Filter_OneYear = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'1Y')]");
	By Filter_OneYearDatepicker = By.xpath("//ol[@id='xDateFilterSelect']/ancestor::span//span[@id='DateRangePicker']//span[text()='Since 365 Days Ago' or text()='Select a Range']");
	
	By Filter_Records = By.xpath("//div[@id='xFilterHeader']//div[@id='Title']//span[text()='Records']");
	By Filter_Pass = By.xpath("//div[@id='xFilterHeader']//div[@id='Title']//span[text()='Pass']");
	By Filter_BaseFilters_ShowOnlyFailedRecords = By.xpath("//div[@id='xFilterListxx']//span[text()='Show Only Failed Records']");
	By Filter_BaseFilters_Forms = By.xpath("//div[@id='xFilterListxx']//span[text()='Forms'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterListxx']//span[text()='Form'][@class='lead text-uppercase sc-gbl']");
	By Filter_BaseFilters_Forms_SearchIcon = By.xpath("//i[@class='fa fa-search px-2 text-orange pt-1']");
	By Filter_BaseFilters_Forms_FormNameFilter = By.xpath("//input[@name='FormNameFilter']");
	By Filter_BaseFilters_Forms_Download = By.xpath("//div[@id='Print']");
	By Filter_BaseFilters_Forms_TotalRecordsPresent = By.xpath("//table[@id='dtFormList_']/tbody/tr[1]/td[4]");
	
	By Filter_BaseFilters_Resources = By.xpath("//div[@id='xFilterListxx']//span[text()='Resources'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterListxx']//span[text()='Resource'][@class='lead text-uppercase sc-gbl']");
	
	
	By Filter_BaseFilters_Location = By.xpath("//div[@id='xFilterListxx']//span[text()='Locations'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterListxx']//span[text()='Location'][@class='lead text-uppercase sc-gbl']");
	
	
	By Filter_BaseFilters_User = By.xpath("//div[@id='xFilterListxx']//span[text()='Users'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterListxx']//span[text()='User'][@class='lead text-uppercase sc-gbl']");
	
	
	By Filter_AdditionalFilters_Identifiers = By.xpath("//div[@id='xFilterList2xx']//span[text()='Identifiers'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterList2xx']//span[text()='Identifier'][@class='lead text-uppercase sc-gbl']");
	
	
	By Filter_AdditionalFilters_Program = By.xpath("//div[@id='xFilterList2xx']//span[text()='Programs'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterList2xx']//span[text()='Program'][@class='lead text-uppercase sc-gbl']");
	
	
	By Filter_AdditionalFilters_Verifications = By.xpath("//div[@id='xFilterList2xx']//span[text()='Verifications'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterList2xx']//span[text()='Verification'][@class='lead text-uppercase sc-gbl']");
	
	
	By Filter_AdditionalFilters_RecordSearch = By.xpath("//div[@id='xFilterList2xx']//span[text()='Record Search']");
	
	
	By Filter_AdditionalFilters_VoidedRecords = By.xpath("//div[@id='xFilterList2xx']//span[text()='Voided Records'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterList2xx']//span[text()='Voided Records'][@class='lead text-uppercase text-white sc-gbl']");
	
	
	public void User_click_on_Link_under_WebHamburger_in_Webpage() throws Throwable {
		driver.findElement(webhamburgericon).click();
		utilities.webDriverWait(driver, link);
		driver.findElement(link).click();
		utilities.WaitUntilPageIsLoaded(driver);
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
			}
		}
	}
	
	public void validating_Link_HomePage_SafetyChainLogo() throws Throwable {
		utilities.webDriverWait(driver, Header_SafetychainLogo);
		driver.findElement(Header_SafetychainLogo).click();
	}
	
	public void validating_HomeLink_Under_Hamburger_in_Link_HomePage() throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.webDriverWait(driver, HomeLink_Under_Hamburger);
		driver.findElement(HomeLink_Under_Hamburger).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		driver.findElement(SearchLocationsEditField).click();
	}
	
	public void validating_Link_HomePage_Hamburger_SafetyChainLogo_DatePickers_SearchLocations() throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		driver.findElement(linkhamburgericon).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		driver.findElement(SafetyChainImage).click();
		
		driver.findElement(EightHour).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, EightHourDatepicker);
		driver.findElement(EightHourDatepicker).click();
		
		driver.findElement(TwelveHours).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, TwelveHoursDatepicker);
		driver.findElement(TwelveHoursDatepicker).click();
		
		driver.findElement(OneDay).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, TwentyFourHoursDatepicker);
		driver.findElement(TwentyFourHoursDatepicker).click();
		
		driver.findElement(TwoDays).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, TwoDaysDatepicker);
		driver.findElement(TwoDaysDatepicker).click();
		
		driver.findElement(OneWeek).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, OneWeekDatepicker);
		driver.findElement(OneWeekDatepicker).click();
		
		driver.findElement(TwoWeeks).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, FourteenDaysDatepicker);
		driver.findElement(FourteenDaysDatepicker).click();
		
		driver.findElement(OneMonth).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, OneMonthDatepicker);
		driver.findElement(OneMonthDatepicker).click();
		
		driver.findElement(ThreeMonths).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, ThreeMonthsDatepicker);
		driver.findElement(ThreeMonthsDatepicker).click();
		
		driver.findElement(SixMonths).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, SixMonthsDatepicker);
		driver.findElement(SixMonthsDatepicker).click();
		
		driver.findElement(OneYear).click();
		utilities.webDriverWait(driver, SearchLocationsEditField);
		utilities.webDriverWait(driver, OneYearDatepicker);
		driver.findElement(OneYearDatepicker).click();
	}
	
	public void validating_Link_HomePage_Filters_Records_PassPercentage_Refresh_LinkVersion() throws Throwable {
		driver.findElement(Filters).click();
		utilities.webDriverWait(driver, Close_Filters);
		driver.findElement(Close_Filters).click();
		utilities.webDriverWait(driver, Records);
		driver.findElement(Records).click();
		driver.findElement(Pass_Percentage).click();
		// Refresh Icon is not Visible from 01-Feb-2022
//		driver.findElement(Refresh).click();
		utilities.webDriverWait(driver, Link_Version);
		Link_Version_Number = driver.findElement(Link_Version).getText();
		utilities.MaximumWait(driver);
		driver.findElement(By.xpath("//span[@id='banner']/span[contains(text(),'"+Link_Version_Number+"')]")).click();
	}
	
	public void validating_Link_HomePage_User_Profile_MyDashBoards_DashBuilder_Records() throws Throwable {
		utilities.webDriverWait(driver, User);
		driver.findElement(User).click();
		driver.findElement(AdminProfile).click();
		driver.findElement(MyDashboards).click();
		driver.findElement(DashBuilder).click();
		utilities.webDriverWait(driver, DashBuilder_Settings);
		driver.navigate().back();
		utilities.webDriverWait(driver, MyDashboards_FavouritesDash);
		driver.findElement(MyDashboards_FavouritesDash).click();
		utilities.webDriverWait(driver, FavouritesDash_ChangeLayout);
		driver.navigate().back();
		utilities.webDriverWait(driver, MyDashboards_FavouritesDash);
		driver.findElement(Records_widget).click();
		driver.findElement(Recordswidget_Records).click();
		driver.findElement(Recordswidget_Pass).click();
		driver.findElement(Recordswidget_Grid).click();
		utilities.webDriverWait(driver, Grid_Verify);
		driver.navigate().back();
		utilities.webDriverWait(driver, Recordswidget_Spreadsheet);
		driver.findElement(Recordswidget_Spreadsheet).click();
		utilities.webDriverWait(driver, Spreadsheet_FormsFilter_InputField);
		driver.navigate().back();
		utilities.webDriverWait(driver, Recordswidget_Tasks);
		driver.findElement(Recordswidget_Tasks).click();
		utilities.webDriverWait(driver, Tasks_Taskname_InputField);
		driver.navigate().back();
		utilities.webDriverWait(driver, Recordswidget_Saved);
		driver.findElement(Recordswidget_Saved).click();
		driver.findElement(Tachometer).click();
		driver.findElement(Tachometer_RecordLimit).click();
	}
	
	public void validating_Link_HomePage_ScheduleTasks_Documents_Cases() throws Throwable {
		utilities.webDriverWait(driver, ScheduledTasks);
		driver.findElement(ScheduledTasks).click();
		driver.findElement(Open).click();
		utilities.webDriverWait(driver, ScheduleTasks_Open);
		ScheduleTasksOpen = driver.findElement(ScheduleTasks_Open).getText();
		ScheduleTasksComplete = driver.findElement(ScheduleTasks_Complete).getText();
		ScheduleTasksInactive = driver.findElement(ScheduleTasks_Inactive).getText();
		if(ScheduleTasksOpen.equals("Open") && ScheduleTasksComplete.equals("Complete") && ScheduleTasksInactive.equals("Inactive")) {
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, PastDue);
		driver.findElement(PastDue).click();
		utilities.webDriverWait(driver, ScheduleTasks_Open);
		ScheduleTasksOpen = driver.findElement(ScheduleTasks_Open).getText();
		ScheduleTasksComplete = driver.findElement(ScheduleTasks_Complete).getText();
		ScheduleTasksInactive = driver.findElement(ScheduleTasks_Inactive).getText();
		if(ScheduleTasksOpen.equals("Open") && ScheduleTasksComplete.equals("Complete") && ScheduleTasksInactive.equals("Inactive")) {
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, DueLater);
		driver.findElement(DueLater).click();
		utilities.webDriverWait(driver, ScheduleTasks_Open);
		ScheduleTasksOpen = driver.findElement(ScheduleTasks_Open).getText();
		ScheduleTasksComplete = driver.findElement(ScheduleTasks_Complete).getText();
		ScheduleTasksInactive = driver.findElement(ScheduleTasks_Inactive).getText();
		if(ScheduleTasksOpen.equals("Open") && ScheduleTasksComplete.equals("Complete") && ScheduleTasksInactive.equals("Inactive")) {
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, Done);
		driver.findElement(Done).click();
		utilities.webDriverWait(driver, ScheduleTasks_Open);
		ScheduleTasksOpen = driver.findElement(ScheduleTasks_Open).getText();
		ScheduleTasksComplete = driver.findElement(ScheduleTasks_Complete).getText();
		ScheduleTasksInactive = driver.findElement(ScheduleTasks_Inactive).getText();
		if(ScheduleTasksOpen.equals("Open") && ScheduleTasksComplete.equals("Complete") && ScheduleTasksInactive.equals("Inactive")) {
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, Late);
		driver.findElement(Late).click();
		utilities.webDriverWait(driver, ScheduleTasks_Open);
		ScheduleTasksOpen = driver.findElement(ScheduleTasks_Open).getText();
		ScheduleTasksComplete = driver.findElement(ScheduleTasks_Complete).getText();
		ScheduleTasksInactive = driver.findElement(ScheduleTasks_Inactive).getText();
		if(ScheduleTasksOpen.equals("Open") && ScheduleTasksComplete.equals("Complete") && ScheduleTasksInactive.equals("Inactive")) {
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, OnTime);
		driver.findElement(OnTime).click();
		utilities.webDriverWait(driver, ScheduleTasks_Open);
		ScheduleTasksOpen = driver.findElement(ScheduleTasks_Open).getText();
		ScheduleTasksComplete = driver.findElement(ScheduleTasks_Complete).getText();
		ScheduleTasksInactive = driver.findElement(ScheduleTasks_Inactive).getText();
		if(ScheduleTasksOpen.equals("Open") && ScheduleTasksComplete.equals("Complete") && ScheduleTasksInactive.equals("Inactive")) {
			driver.navigate().back();
		}
		
		utilities.webDriverWait(driver, Documents);
		driver.findElement(Documents).click();
		driver.findElement(Documents_DocumentsLink).click();
		utilities.webDriverWait(driver, LinkHomePageDocuments_Documents);
		LinkHomePageDocuments_Documents_Text = driver.findElement(LinkHomePageDocuments_Documents).getText();
		LinkHomePageDocuments_Expired_Text = driver.findElement(LinkHomePageDocuments_Expired).getText();
		if(LinkHomePageDocuments_Documents_Text.equals("Documents") && LinkHomePageDocuments_Expired_Text.equals("Expired")) {
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, Expired);
		driver.findElement(Expired).click();
		utilities.webDriverWait(driver, LinkHomePageDocuments_Documents);
		LinkHomePageDocuments_Documents_Text = driver.findElement(LinkHomePageDocuments_Documents).getText();
		LinkHomePageDocuments_Expired_Text = driver.findElement(LinkHomePageDocuments_Expired).getText();
		if(LinkHomePageDocuments_Documents_Text.equals("Documents") && LinkHomePageDocuments_Expired_Text.equals("Expired")) {
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, ViewDocuments);
		driver.findElement(ViewDocuments).click();
		utilities.webDriverWait(driver, LinkHomePageDocuments_Documents);
		LinkHomePageDocuments_Documents_Text = driver.findElement(LinkHomePageDocuments_Documents).getText();
		LinkHomePageDocuments_Expired_Text = driver.findElement(LinkHomePageDocuments_Expired).getText();
		if(LinkHomePageDocuments_Documents_Text.equals("Documents") && LinkHomePageDocuments_Expired_Text.equals("Expired")) {
			driver.navigate().back();
		}
		
		utilities.webDriverWait(driver, Cases);
		driver.findElement(Cases).click();
		utilities.webDriverWait(driver, Cases_MyOpenTasks);
		driver.findElement(Cases_MyOpenTasks).click();
//		utilities.webDriverWait(driver, Cases_MyTasks);
//		driver.findElement(Cases_MyTasks).click();
		utilities.webDriverWait(driver, ViewCases);
		driver.findElement(ViewCases).click();
		utilities.webDriverWait(driver, ViewCases_AllCases);
		driver.findElement(ViewCases_AllCases).click();
		driver.navigate().back();
	}
	
	public void validating_Link_HomePage_Suppliers_Verifications_AdminTools() throws Throwable {
		utilities.webDriverWait(driver, Suppliers);
		driver.findElement(Suppliers).click();
		driver.findElement(Suppliers_SuppliersLink).click();
		utilities.webDriverWait(driver, HomePageSuppliers_SuppliersLink_Suppliers);
		SuppliersLink = driver.findElement(HomePageSuppliers_SuppliersLink_Suppliers).getText();
		ReqsLink = driver.findElement(HomePageSuppliers_SuppliersLink_Reqs).getText();
		ExpiredLink = driver.findElement(HomePageSuppliers_SuppliersLink_Expired).getText();
		PendingLink = driver.findElement(HomePageSuppliers_SuppliersLink_Pending).getText();
		LateLink = driver.findElement(HomePageSuppliers_SuppliersLink_Late).getText();
		
		if(SuppliersLink.equals("Suppliers") && ReqsLink.equals("Reqs") && ExpiredLink.equals("Expired") && PendingLink.equals("Pending") && LateLink.equals("Late")) {		
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, Suppliers_ReqsLink);
		driver.findElement(Suppliers_ReqsLink).click();
		utilities.webDriverWait(driver, HomePageSuppliers_SuppliersLink_Reqs);
		SuppliersLink = driver.findElement(HomePageSuppliers_SuppliersLink_Suppliers).getText();
		ReqsLink = driver.findElement(HomePageSuppliers_SuppliersLink_Reqs).getText();
		ExpiredLink = driver.findElement(HomePageSuppliers_SuppliersLink_Expired).getText();
		PendingLink = driver.findElement(HomePageSuppliers_SuppliersLink_Pending).getText();
		LateLink = driver.findElement(HomePageSuppliers_SuppliersLink_Late).getText();
		
		if(SuppliersLink.equals("Suppliers") && ReqsLink.equals("Reqs") && ExpiredLink.equals("Expired") && PendingLink.equals("Pending") && LateLink.equals("Late")) {		
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, Suppliers_ExpiredLink);
		driver.findElement(Suppliers_ExpiredLink).click();
		utilities.webDriverWait(driver, HomePageSuppliers_SuppliersLink_Expired);
		SuppliersLink = driver.findElement(HomePageSuppliers_SuppliersLink_Suppliers).getText();
		ReqsLink = driver.findElement(HomePageSuppliers_SuppliersLink_Reqs).getText();
		ExpiredLink = driver.findElement(HomePageSuppliers_SuppliersLink_Expired).getText();
		PendingLink = driver.findElement(HomePageSuppliers_SuppliersLink_Pending).getText();
		LateLink = driver.findElement(HomePageSuppliers_SuppliersLink_Late).getText();
		
		if(SuppliersLink.equals("Suppliers") && ReqsLink.equals("Reqs") && ExpiredLink.equals("Expired") && PendingLink.equals("Pending") && LateLink.equals("Late")) {		
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, Suppliers_PendingLink);
		driver.findElement(Suppliers_PendingLink).click();
		utilities.webDriverWait(driver, HomePageSuppliers_SuppliersLink_Suppliers);
		SuppliersLink = driver.findElement(HomePageSuppliers_SuppliersLink_Suppliers).getText();
		ReqsLink = driver.findElement(HomePageSuppliers_SuppliersLink_Reqs).getText();
		ExpiredLink = driver.findElement(HomePageSuppliers_SuppliersLink_Expired).getText();
		PendingLink = driver.findElement(HomePageSuppliers_SuppliersLink_Pending).getText();
		LateLink = driver.findElement(HomePageSuppliers_SuppliersLink_Late).getText();
		
		if(SuppliersLink.equals("Suppliers") && ReqsLink.equals("Reqs") && ExpiredLink.equals("Expired") && PendingLink.equals("Pending") && LateLink.equals("Late")) {		
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, Suppliers_LateLink);
		driver.findElement(Suppliers_LateLink).click();
		utilities.webDriverWait(driver, HomePageSuppliers_SuppliersLink_Late);
		SuppliersLink = driver.findElement(HomePageSuppliers_SuppliersLink_Suppliers).getText();
		ReqsLink = driver.findElement(HomePageSuppliers_SuppliersLink_Reqs).getText();
		ExpiredLink = driver.findElement(HomePageSuppliers_SuppliersLink_Expired).getText();
		PendingLink = driver.findElement(HomePageSuppliers_SuppliersLink_Pending).getText();
		LateLink = driver.findElement(HomePageSuppliers_SuppliersLink_Late).getText();
		
		if(SuppliersLink.equals("Suppliers") && ReqsLink.equals("Reqs") && ExpiredLink.equals("Expired") && PendingLink.equals("Pending") && LateLink.equals("Late")) {		
			driver.navigate().back();
		}
		utilities.webDriverWait(driver, ViewSuppliersLink);
		driver.findElement(ViewSuppliersLink).click();
		utilities.webDriverWait(driver, Suppliers_LateLink);
		SuppliersLink = driver.findElement(HomePageSuppliers_SuppliersLink_Suppliers).getText();
		ReqsLink = driver.findElement(HomePageSuppliers_SuppliersLink_Reqs).getText();
		ExpiredLink = driver.findElement(HomePageSuppliers_SuppliersLink_Expired).getText();
		PendingLink = driver.findElement(HomePageSuppliers_SuppliersLink_Pending).getText();
		LateLink = driver.findElement(HomePageSuppliers_SuppliersLink_Late).getText();
		if(SuppliersLink.equals("Suppliers") && ReqsLink.equals("Reqs") && ExpiredLink.equals("Expired") && PendingLink.equals("Pending") && LateLink.equals("Late")) {		
			driver.navigate().back();
		}
		
		utilities.webDriverWait(driver, Verifications);
		driver.findElement(Verifications).click();
		driver.findElement(Verifications_VerficationsLink).click();
		utilities.webDriverWait(driver, Verifications_FieldsLink);
		driver.findElement(Verifications_FieldsLink).click();
		utilities.webDriverWait(driver, Verifications_ImagesLink);
		driver.findElement(Verifications_ImagesLink).click();
		utilities.webDriverWait(driver, Verifications_SignoffLink);
		driver.findElement(Verifications_SignoffLink).click();
		utilities.webDriverWait(driver, Verifications_SignoffLink_SignoffButton);
		SignOff = driver.findElement(Verifications_SignoffLink_SignoffButton).getText();
		if(SignOff.equals("Signoff")) {		
			driver.navigate().back();
		}
		
		utilities.webDriverWait(driver, AdminTools);
		driver.findElement(AdminTools).click();
		driver.findElement(AdminTools_FSQABrowserLink).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
	    List<String> windowStrings = new ArrayList<>(windowHandles);
	    String reqWindow = windowStrings.get(2);
	    driver.switchTo().window(reqWindow);
	    utilities.webDriverWait(driver, AdminTools_Details);
		WebPage_DetailsButton = driver.findElement(AdminTools_Details).getText();
		if(WebPage_DetailsButton.equals("Details")) {
			driver.close();
		    String reqWindow1 = windowStrings.get(1);
		    driver.switchTo().window(reqWindow1);
		}

		driver.findElement(AdminTools_AnalyticsLink).click();
		utilities.webDriverWait(driver, AdminTools_RecordSignoffLink);
		driver.findElement(AdminTools_RecordSignoffLink).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
	    List<String> windowStrings2 = new ArrayList<>(windowHandles2);
	    String reqWindow2 = windowStrings2.get(2);
	    driver.switchTo().window(reqWindow2);
	    utilities.webDriverWait(driver, AdminTools_RecordSignoffLink_RecordSignoffText);
		RecordSignoff = driver.findElement(AdminTools_RecordSignoffLink_RecordSignoffText).getText();
		if(RecordSignoff.equals("Record Signoff")) {
			driver.close();
		    String reqWindow3 = windowStrings2.get(1);
		    driver.switchTo().window(reqWindow3);
		}		
				
	}
	
public void validating_Link_HomePage_Reports_CustomReports() throws Throwable {
		utilities.webDriverWait(driver, Reports);
		driver.findElement(Reports).click();
		driver.findElement(Reports_MyReports).click();
		driver.findElement(Reports_GlobalReports).click();
		driver.findElement(ReportBuilder).click();
		utilities.webDriverWait(driver, ReportBuilder_AllData);
		driver.findElement(ReportBuilder_AllData).click();
		utilities.webDriverWait(driver, ReportBuilder_AllData_SaveReportButton);
		SaveReport = driver.findElement(ReportBuilder_AllData_SaveReportButton).getAttribute("value");
		if(SaveReport.equals("SAVE REPORT")) {		
			driver.navigate().back();
		}
		
		utilities.webDriverWait(driver, ReportBuilder_Reports);
		driver.findElement(ReportBuilder).click();
		utilities.webDriverWait(driver, ReportBuilder_Reports);
		driver.findElement(ReportBuilder_Reports).click();
		utilities.webDriverWait(driver, ReportBuilder_AllData_SaveReportButton);
		SaveReport = driver.findElement(ReportBuilder_AllData_SaveReportButton).getAttribute("value");
		if(SaveReport.equals("SAVE REPORT")) {		
			driver.navigate().back();
		}
		
		utilities.webDriverWait(driver, ReportBuilder_Reports);
		driver.findElement(ReportBuilder).click();
		utilities.webDriverWait(driver, ReportBuilder_Fields);
		driver.findElement(ReportBuilder_Fields).click();
		utilities.webDriverWait(driver, ReportBuilder_AllData_SaveReportButton);
		SaveReport = driver.findElement(ReportBuilder_AllData_SaveReportButton).getAttribute("value");
		if(SaveReport.equals("SAVE REPORT")) {		
			driver.navigate().back();
		}
		
		utilities.webDriverWait(driver, CustomReports);
		driver.findElement(CustomReports).click();
		driver.findElement(CustomReports_CaseManagement).click();
		utilities.webDriverWait(driver, CustomReports_CaseManagement_CaseName_InputField);
		driver.findElement(CustomReports_CaseManagement_CaseName_InputField).click();
		driver.navigate().back();
		utilities.webDriverWait(driver, CustomReports_CaseViewer);
		driver.findElement(CustomReports_CaseViewer).click();
		utilities.webDriverWait(driver, CustomReports_CaseViewer_ClearPreview);
		driver.findElement(CustomReports_CaseViewer_ClearPreview).click();
		driver.navigate().back();
		utilities.webDriverWait(driver, CustomReports_CaseViewer);
		driver.findElement(CustomReports).click();
   }

	public void validating_MenuBarLinks_HomePage() throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(favoritesdash).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(records).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(resources).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(documents).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(programs).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(suppliers).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(more).click();
		utilities.MinimumWait(driver);
		driver.findElement(audits).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(coautility).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(cooktochill).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(exceptions).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(export).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(opscharts).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleX = driver.findElement(recordhistory); 
		JavascriptExecutor executoraa = (JavascriptExecutor)driver;
		executoraa.executeScript("arguments[0].click();", titleX);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleY = driver.findElement(riskassessment); 
		JavascriptExecutor executorbb = (JavascriptExecutor)driver;
		executorbb.executeScript("arguments[0].click();", titleY);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleA = driver.findElement(tagriskassessment); 
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", titleA);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleB = driver.findElement(validations); 
		executor.executeScript("arguments[0].click();", titleB);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleC = driver.findElement(webhookresponse); 
		executor.executeScript("arguments[0].click();", titleC);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(more).click();
		utilities.MinimumWait(driver);
		driver.findElement(cases).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(forms).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(caseViewer).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(oee).click();
		utilities.MinimumWait(driver);
		driver.findElement(livemonitoring).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(oeemonitoring).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(eventanalysis).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleE = driver.findElement(oeeanalysis); 
		executor.executeScript("arguments[0].click();", titleE);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleF = driver.findElement(oeekpi); 
		executor.executeScript("arguments[0].click();", titleF);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleYY = driver.findElement(oeereportbuilder); 
		executor.executeScript("arguments[0].click();", titleYY);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleXX = driver.findElement(oeescheduler); 
		executor.executeScript("arguments[0].click();", titleXX);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleG = driver.findElement(sensordiagnostic); 
		executor.executeScript("arguments[0].click();", titleG);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(oee).click();
		utilities.MinimumWait(driver);
		driver.findElement(utilities_Link).click();
		utilities.MinimumWait(driver);
		driver.findElement(dashboardbuilder).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(dateranges).click();
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleH = driver.findElement(reportbuilder); 
		executor.executeScript("arguments[0].click();", titleH);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleI = driver.findElement(supplierbuilder); 
		executor.executeScript("arguments[0].click();", titleI);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleJ = driver.findElement(clearfavorites); 
		executor.executeScript("arguments[0].click();", titleJ);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(utilities_Link).click();
		utilities.MinimumWait(driver);
		WebElement titleL = driver.findElement(admin); 
		executor.executeScript("arguments[0].click();", titleL);
		utilities.MinimumWait(driver);
		WebElement titleZ = driver.findElement(users); 
		executor.executeScript("arguments[0].click();", titleZ);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleM = driver.findElement(secureprofiles); 
		executor.executeScript("arguments[0].click();", titleM);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleN = driver.findElement(recordsharing); 
		executor.executeScript("arguments[0].click();", titleN);
		
//		utilities.webDriverWait(driver, linkhamburgericon);
//		driver.findElement(linkhamburgericon).click();
//		utilities.MinimumWait(driver);
//		WebElement titleP = driver.findElement(apiadmin); 
//		executor.executeScript("arguments[0].click();", titleP);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		WebElement titleD = driver.findElement(dynamicflows); 
		executor.executeScript("arguments[0].click();", titleD);
		
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		WebElement titleW = driver.findElement(admin); 
		executor.executeScript("arguments[0].click();", titleW);
		utilities.MinimumWait(driver);
		
		Select objSelect =new Select(driver.findElement(LangauageSelection));
		List<WebElement> m = objSelect.getOptions();
		for (int j = 0; j <= m.size()+1; j++) {
			 Select objSelect1 =new Select(driver.findElement(LangauageSelection));
			 List<WebElement> m1 = objSelect1.getOptions();
	         if(j>0) {
	        	 utilities.webDriverWait(driver, linkhamburgericon);
		 		 driver.findElement(linkhamburgericon).click();
		 		 utilities.MediumWait(driver);
	         }
	         if(j<6) {
	        	 String s = m1.get(j).getText();
		         System.out.println(s); 
	         }
			 
	         if(j==0) {
	        	 objSelect1.selectByVisibleText("German (Germany)"); 
	         }
	         if(j==1) {
	        	 objSelect1.selectByVisibleText("English (UK)"); 
	         }
	         if(j==2) {
	        	 objSelect1.selectByVisibleText("English (United States)"); 
	         }
	         if(j==3) {
	        	 objSelect1.selectByVisibleText("Spanish (Spain)"); 
	         }
	         if(j==4) {
	        	 objSelect1.selectByVisibleText("Spanish (United States)"); 
	         }
	         if(j==5) {
	        	 objSelect1.selectByVisibleText("French (France)"); 
	         }
	         if(j==6) {
	        	 objSelect1.selectByVisibleText("Chinese (Simplified)"); 
	         }
	         if(j==7) {
	        	 objSelect1.selectByVisibleText("English (United States)"); 
	         }
	      }
		
		utilities.MinimumWait(driver);
		WebElement titleQ = driver.findElement(logout); 
		executor.executeScript("arguments[0].click();", titleQ);
		
	}
		
	public void validating_Search_Location_and_SuperAdmin_Widget_HomePage() throws Throwable {
		
		String Location = "USA";
		utilities.webDriverWait(driver, LocationSearch);
		driver.findElement(LocationSearch).sendKeys(Location);
		utilities.MediumWait(driver);
//		driver.findElement(LocationSearch).sendKeys(Keys.ENTER);
		driver.findElement(LocationSearch).click();
		utilities.webDriverWait(driver, LocationName);
		driver.findElement(LocationName).click();
		utilities.webDriverWait(driver, LocationFilter);
		driver.findElement(LocationFilter).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, SuperAdminWidget);
		WebElement titleW = driver.findElement(SuperAdminWidget);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", titleW);
		utilities.webDriverWait(driver, SuperAdminWidget);
		List<WebElement> UserWidgets = driver.findElements(TestUserWidgets);
		if(UserWidgets.size()==0) {
			driver.findElement(By.id("User Widgets were not present in the Homepage of Admin Section"));
		}
	}
	
public void validating_LocationSearch_HomePage() throws Throwable {
		
		String Location = "USA";
		utilities.webDriverWait(driver, Filters);
		driver.findElement(LocationSearch).click();
		utilities.webDriverWait(driver, Filters);
		
		driver.findElement(LocationSearch).sendKeys(Location);
		utilities.MediumWait(driver);
//		driver.findElement(LocationSearch).sendKeys(Keys.ENTER);
		driver.findElement(LocationSearch).click();
		utilities.webDriverWait(driver, LocationName);
		driver.findElement(LocationName).click();
		utilities.webDriverWait(driver, LocationFilter);
		driver.findElement(LocationFilter).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, SuperAdminWidget);
		WebElement titleW = driver.findElement(SuperAdminWidget);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", titleW);
		utilities.webDriverWait(driver, SuperAdminWidget);
		List<WebElement> UserWidgets = driver.findElements(TestUserWidgets);
		if(UserWidgets.size()==0) {
			driver.findElement(By.id("User Widgets were not present in the Homepage of Admin Section"));
		}
	}

public void validating_Filters_HomePage() throws Throwable {
	
	utilities.webDriverWait(driver, Filters);
	driver.findElement(Filters).click();
	utilities.webDriverWait(driver, Filter_EightHour);
	driver.findElement(Filter_EightHour).click();
	utilities.webDriverWait(driver, Filter_EightHourDatepicker);
	driver.findElement(Filter_EightHourDatepicker).click();
	utilities.webDriverWait(driver, Filter_TwelveHours);
	driver.findElement(Filter_TwelveHours).click();
	utilities.webDriverWait(driver, Filter_TwelveHoursDatepicker);
	driver.findElement(Filter_TwelveHoursDatepicker).click();
	utilities.webDriverWait(driver, Filter_OneDay);
	driver.findElement(Filter_OneDay).click();
	utilities.webDriverWait(driver, Filter_TwentyFourHoursDatepicker);
	driver.findElement(Filter_TwentyFourHoursDatepicker).click();
	utilities.webDriverWait(driver, Filter_TwoDays);
	driver.findElement(Filter_TwoDays).click();
	utilities.webDriverWait(driver, Filter_TwoDaysDatepicker);
	driver.findElement(Filter_TwoDaysDatepicker).click();
	utilities.webDriverWait(driver, Filter_OneWeek);
	driver.findElement(Filter_OneWeek).click();
	utilities.webDriverWait(driver, Filter_OneWeekDatepicker);
	driver.findElement(Filter_OneWeekDatepicker).click();
	utilities.webDriverWait(driver, Filter_OneWeekDatepicker);
	driver.findElement(Filter_OneWeekDatepicker).click();
	utilities.webDriverWait(driver, Filter_TwoWeeks);
	driver.findElement(Filter_TwoWeeks).click();
	utilities.webDriverWait(driver, Filter_FourteenDaysDatepicker);
	driver.findElement(Filter_FourteenDaysDatepicker).click();
	utilities.webDriverWait(driver, Filter_OneMonth);
	driver.findElement(Filter_OneMonth).click();
	utilities.webDriverWait(driver, Filter_OneMonthDatepicker);
	driver.findElement(Filter_OneMonthDatepicker).click();
	utilities.webDriverWait(driver, Filter_ThreeMonths);
	driver.findElement(Filter_ThreeMonths).click();
	utilities.webDriverWait(driver, Filter_ThreeMonthsDatepicker);
	driver.findElement(Filter_ThreeMonthsDatepicker).click();
	utilities.webDriverWait(driver, Filter_SixMonths);
	driver.findElement(Filter_SixMonths).click();
	utilities.webDriverWait(driver, Filter_SixMonthsDatepicker);
	driver.findElement(Filter_SixMonthsDatepicker).click();
	utilities.webDriverWait(driver, Filter_SixMonthsDatepicker);
	driver.findElement(Filter_SixMonthsDatepicker).click();
	utilities.webDriverWait(driver, Filter_OneYear);
	driver.findElement(Filter_OneYear).click();
	utilities.webDriverWait(driver, Filter_OneYearDatepicker);
	driver.findElement(Filter_OneYearDatepicker).click();
	utilities.webDriverWait(driver, Filter_EightHour);
	driver.findElement(Filter_EightHour).click();
	
	utilities.webDriverWait(driver, Filter_PauseRefresh_CheckBox);
	driver.findElement(Filter_PauseRefresh_CheckBox).click();
	utilities.webDriverWait(driver, Filters_SavedFilters);
	driver.findElement(Filters_SavedFilters).click();
	utilities.webDriverWait(driver, Filters_Records);
	driver.findElement(Filters_Records).click();
	utilities.webDriverWait(driver, Filters_Pass);
	driver.findElement(Filters_Pass).click();
	
	utilities.webDriverWait(driver, Filter_BaseFilters_ShowOnlyFailedRecords);
	driver.findElement(Filter_BaseFilters_ShowOnlyFailedRecords).click();
	
	utilities.webDriverWait(driver, Filter_BaseFilters_Forms);
	driver.findElement(Filter_BaseFilters_Forms).click();
	utilities.MediumWait(driver);
	
	driver.findElement(Filter_BaseFilters_Forms).click();
	utilities.webDriverWait(driver, Filter_BaseFilters_Resources);
	
	driver.findElement(Filter_BaseFilters_Resources).click();
	utilities.MediumWait(driver);
	driver.findElement(Filter_BaseFilters_Resources).click();
	utilities.webDriverWait(driver, Filter_BaseFilters_Location);
	driver.findElement(Filter_BaseFilters_Location).click();
	utilities.MediumWait(driver);
	driver.findElement(Filter_BaseFilters_Location).click();
	utilities.webDriverWait(driver, Filter_BaseFilters_User);
	driver.findElement(Filter_BaseFilters_User).click();
	utilities.MediumWait(driver);
	driver.findElement(Filter_BaseFilters_User).click();
	utilities.webDriverWait(driver, Filter_AdditionalFilters_Identifiers);
	driver.findElement(Filter_AdditionalFilters_Identifiers).click();
	utilities.MediumWait(driver);
	driver.findElement(Filter_AdditionalFilters_Identifiers).click();
	utilities.webDriverWait(driver, Filter_AdditionalFilters_Program);
	driver.findElement(Filter_AdditionalFilters_Program).click();
	utilities.MediumWait(driver);
	driver.findElement(Filter_AdditionalFilters_Program).click();
	utilities.webDriverWait(driver, Filter_AdditionalFilters_Verifications);
	driver.findElement(Filter_AdditionalFilters_Verifications).click();
	utilities.MediumWait(driver);
	driver.findElement(Filter_AdditionalFilters_Verifications).click();
	utilities.webDriverWait(driver, Filter_AdditionalFilters_RecordSearch);
	driver.findElement(Filter_AdditionalFilters_RecordSearch).click();
	utilities.MediumWait(driver);
	driver.findElement(Filter_AdditionalFilters_RecordSearch).click();
	utilities.webDriverWait(driver, Filter_AdditionalFilters_VoidedRecords);
	driver.findElement(Filter_AdditionalFilters_VoidedRecords).click();
	utilities.MaximumWait(driver);
	driver.findElement(Filter_AdditionalFilters_VoidedRecords).click();
	}
}
