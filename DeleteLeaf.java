package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeaf {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		 	 	driver.findElement(By.linkText("CRM/SFA")).click();
		 	 	driver.findElement(By.linkText("Leads")).click();
		 	 	driver.findElement(By.linkText("Find Leads")).click();
		 	 	driver.findElement(By.linkText("Phone")).click();
//		 	 	driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
//		 	 	driver.findElement(By.name("phoneAreaCode")).sendKeys("91");
		 	 	driver.findElement(By.name("phoneNumber")).sendKeys("1234568");
		 	 	driver.findElement(By.linkText("Find Leads")).click();
		 	 	WebElement leadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		 	 	String leadIdValue = leadID.getText();
		 	 	System.out.println("Lead ID: "+leadIdValue);
		 	 	leadID.click();
		 	 	driver.findElement(By.className("subMenuButtonDangerous")).click();
		 	 	driver.findElement(By.linkText("Find Leads")).click();
		 	 	driver.findElement(By.name("id")).sendKeys(leadIdValue);
		 	 	driver.findElement(By.id("ext-gen334")).click();
		 	 	WebElement noRecord = driver.findElement(By.xpath("//div[text()='No records to display']"));
		 	 	String noRecordText = noRecord.getText();
		 	 	System.out.println(noRecordText);
		 	 	
		 	 	
		 
		 	 	
		 	 	
	}

}
