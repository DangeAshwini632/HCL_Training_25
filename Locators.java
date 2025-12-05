package Project11_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.solutionsplusoutlet.ca/?fuseaction=member.login");
		driver.manage().window().maximize();
		//driver.navigate().to("https://rbu.icloudems.com/corecampus/index.php");
		//driver.findElement(By.id("username"));
		WebElement textbox_username = driver.findElement(By.name("username")sendKeys("dangea@rknec.edu");
		WebElement textbox_password = driver.findElement(By.id("actlpass"));
		textbox_password.sendKeys("Dange@3773");
		//WebElement login_button = 
				driver.findElement(By.className("btn-primary")).click();
		//login_button.click();
		
		//driver.close();

		
		

	}

}
