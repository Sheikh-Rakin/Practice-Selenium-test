package rakin2package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public static void main(String[] args) {
		WebDriver driver = Test.getDriver();
		
		//navigating website
		driver.get("https://practicetestautomation.com//");
		
		//Click PRACTICE
		WebElement e = driver.findElement(By.id("menu-item-20"));
		e.click();
		
		//click Test Login Page
		e = driver.findElement(By.linkText("Test Login Page"));
		e.click();
		
		//enter username and password
		e = driver.findElement(By.id("username"));
		e.sendKeys("student");
		
		e = driver.findElement(By.id("password"));
		e.sendKeys("Password123");
		
		//click Submit
		driver.findElement(By.id("submit")).click();
		
		//read 
		WebElement logout = driver.findElement(By.linkText("Log out"));
	    WebElement title = driver.findElement(By.className("post-title"));
		
		String logout_button_text = logout.getText();
		String title_text = title.getText();
		
		System.out.println(logout_button_text);
		System.out.println(title_text);
		
		//if statement
		if(title_text.equals("Logged In Successfully")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
