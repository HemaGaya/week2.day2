package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateButton{


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println(driver.findElement(By.id("color")).getText());
		System.out.println(driver.findElement(By.id("color")).getSize());
		String element = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("WebElement color is "+ element);
		
	}

}
