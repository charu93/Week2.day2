package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteractions {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		driver.navigate().back();
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		if (enabled==false) {
			System.out.println("The button is disabled");
		}
		Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		String buttonLocation = location.toString();
		System.out.println(buttonLocation);
	WebElement buttonColor = driver.findElement(By.xpath("(//span[text()='Save'])[1]"));
		String cssValue = buttonColor.getCssValue("color");
		System.out.println(cssValue);
		WebElement findSizebutton = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		int height = findSizebutton.getSize().getHeight();
		System.out.println("Height: "+height);
		int width = findSizebutton.getSize().getWidth();
		System.out.println("Width of the button: "+width);
		driver.close();
	}

}
