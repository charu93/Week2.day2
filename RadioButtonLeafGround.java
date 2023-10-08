package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonLeafGround {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/radio.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//label[text()='Chrome']")).click();
	WebElement chrmeButon = driver.findElement(By.xpath("//label[text()='Chrome']"));
	chrmeButon.click();
	boolean selected = chrmeButon.isSelected();
	System.out.println("Has the button been disabled?: "+selected);
	boolean defaultSel=driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled();
	if(defaultSel==true)
	{
	System.out.println("Safari button is enabled by default");
	}
	else
	{
		System.out.println("Safari button is not enabled by default");
	}
	
}
}
