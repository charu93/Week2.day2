package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeaf {
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
	 	 	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	 	 	driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("1234");
	 	 	driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("ABCDEFG");
	 	 	driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("iiiXYZ");
	 	 	driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("locall");
	 	 	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
	 	 	driver.findElement(By.id("createLeadForm_description")).sendKeys("Description box: Software");
	 	 	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcdlkj@testing.com");
	 	 	WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 	 	Select s = new Select(stateProvince);
	 	 	s.selectByVisibleText("Alaska");
	 	 	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	 	 	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	 	 	driver.findElement(By.id("updateLeadForm_description")).clear();
	 	 	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important notes updated");
	 	 	driver.findElement(By.xpath("//input[@value='Update']")).click();
	 	 	String title = driver.getTitle();
	 	 	System.out.println(title);
	 	 	driver.close();
}

}
