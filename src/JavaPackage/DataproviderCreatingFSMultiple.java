package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderCreatingFSMultiple {
	WebDriver driver;
	@Test(dataProvider = "datasupplier",groups = {"sanity"})
	public void filserverinv(String DDname, String Username, String Paswd, String catname, String TName, String loc,
			String Hostname, String ipadress, String remarks, String Usernamesig, String Passwordsig)
			throws InterruptedException {
		// launchbrowser
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://medhas.walkingtree.tech/");
		Thread.sleep(2000);

		// dd name
		WebElement DomainDD = driver.findElement(By.xpath("//input[@name='domainName']"));
		DomainDD.sendKeys(DDname);
		Thread.sleep(1000);
		DomainDD.sendKeys(Keys.ARROW_DOWN);
		DomainDD.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		// username
		WebElement username = driver.findElement(By.xpath("//input[@name='userId']"));

		username.sendKeys(Username);
		Thread.sleep(1000);

		// password
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(Paswd);
		Thread.sleep(2000);

		// submit

		driver.findElement(By.xpath("//span[@class='p-button-text p-c'][contains(.,'Sign In')]")).click();
		Thread.sleep(25000);

		// inventory
		driver.findElement(By.xpath("(//div[@class='nav'][contains(.,'Inventory')])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Inventory Request']")).click();
		Thread.sleep(3000);

		// category
		WebElement CategoryDD = driver.findElement(By.xpath("//input[@name='M_Inv_CategoryID']"));
		CategoryDD.sendKeys(catname);
		Thread.sleep(2000);
		CategoryDD.sendKeys(Keys.ARROW_DOWN);
		CategoryDD.sendKeys(Keys.ENTER);

		// Templatename
		WebElement TemapName = driver.findElement(By.xpath("//input[@name='Inv_InventoryTemplateID']"));
		TemapName.sendKeys(TName);
		Thread.sleep(2000);
		TemapName.sendKeys(Keys.ARROW_DOWN);
		TemapName.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		// location
		WebElement LocName = driver.findElement(By.xpath("//input[@name='M_LocationId']"));
		LocName.sendKeys(loc);
		Thread.sleep(2000);
		LocName.sendKeys(Keys.ARROW_DOWN);
		LocName.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//input[@name='HostName']")).sendKeys(Hostname);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='IpAddress']")).sendKeys(ipadress);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='Remarks']")).sendKeys(remarks);
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@class='p-button-text p-c'][contains(.,'Submit')])[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Usernamesig);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Passwordsig);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class='p-button-text p-c'])[1]")).click();

		Thread.sleep(3000);
		driver.quit();
	}

	@DataProvider
	public String[][] datasupplier() {
		String path=System.getProperty("C:\\Users\\srilata\\eclipse-workspace\\DataProvideFramework\\TestData\\TestData.xlsx");

		
		
		  String[][] data = { { "Alkaloida.com", "ews.user26", "password",
		  "File server", "File Server", "LocationXX", "Srst5p", "104",
		  "created by srilatha", "ews.user26", "Password" }, { "Alkaloida.com",
		  "ews.user26", "password", "File server", "File Server", "LocationXX",
		  "SriHost6p", "10b", "created by srilatha", "ews.user26", "Password" }, {
		  "Alkaloida.com", "ews.user26", "password", "File server", "File Server",
		  "LocationXX", "SriHost7p", "10c", "created by srilatha", "ews.user26",
		  "Password" }, { "Alkaloida.com", "ews.user26", "password", "File server",
		  "File Server", "LocationXX", "SriHost8p", "10d", "created by srilatha",
		  "ews.user26", "Password" }, { "Alkaloida.com", "ews.user26", "password",
		  "File server", "File Server", "LocationXX", "SriHost9pl", "10e",
		  "created by srilatha", "ews.user26", "Password" }, { "Alkaloida.com",
		  "ews.user26", "password", "File server", "File Server", "LocationXX",
		  "SriHost9p", "10f", "created by srilatha", "ews.user26", "Password" }, {
		  "Alkaloida.com", "ews.user26", "password", "File server", "File Server",
		  "LocationXX", "SriHost1l9", "10cg", "created by srilatha", "ews.user26",
		  "Password" }, { "Alkaloida.com", "ews.user26", "password", "File server",
		  "File Server", "LocationXX", "SriHostm9", "10h", "created by srilatha",
		  "ews.user26", "Password" }, { "Alkaloida.com", "ews.user26", "password",
		  "File server", "File Server", "LocationXX", "SriHost1g", "10h",
		  "created by srilatha", "ews.user26", "Password" }, { "Alkaloida.com",
		  "ews.user26", "password", "File server", "File Server", "LocationXX",
		  "SriHost1f9", "10h", "created by srilatha", "ews.user26", "Password" }, {
		  "Alkaloida.com", "ews.user26", "password", "File server", "File Server",
		  "LocationXX", "SriHost1d5", "10h", "created by srilatha", "ews.user26",
		  "Password" }, { "Alkaloida.com", "ews.user26", "password", "File server",
		  "File Server", "LocationXX", "SriHost1v", "10h", "created by srilatha",
		  "ews.user26", "Password" }, { "Alkaloida.com", "ews.user26", "password",
		  "File server", "File Server", "LocationXX", "SriHostn9", "10h",
		  "created by srilatha", "ews.user26", "Password" } };
		 
		return data;

	}
}
