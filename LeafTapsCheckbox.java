package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsCheckbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("j_idt87:j_idt89")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//span[text()='Ajax']")).click();
String alertPop = driver.findElement(By.xpath("//div[@role='alert']")).getText();
System.out.println("Notification for Ajax checkbox: "+alertPop);
driver.findElement(By.xpath("//label[text()='Java']")).click();
//driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']")).click();---->Not working
//String tristateCheckbox = driver.findElement(By.xpath("//div[@role='alert']")).getText();
//System.out.println("Tri state message: "+tristateCheckbox);
driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
String toggleSwitchCheckbox = driver.findElement(By.xpath("//div[@role='alert']")).getText();
System.out.println("Toggle Switch message: "+toggleSwitchCheckbox);
boolean enabled = driver.findElement(By.id("j_idt87:j_idt102")).isEnabled();
if (enabled==false) {
	System.out.println("Button is disabled");
}
driver.findElement(By.id("j_idt87:multiple")).click();
driver.findElement(By.xpath("//li[@data-item-value='Miami']")).click();
driver.findElement(By.xpath("//li[@data-item-value='Berlin']")).click();

	}

}
