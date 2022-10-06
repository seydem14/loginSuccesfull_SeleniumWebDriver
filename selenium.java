package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F");
		driver.findElement(By.id("login-email")).sendKeys("helloo@teleworm.us");
		driver.findElement(By.id("login-password-input")).sendKeys("lalala123.");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/form/button")).click();
		
		String url=driver.getCurrentUrl();
		
		if(url.equals("https://www.trendyol.com/butik/liste/1/kadin"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
		
		
		

	}

}
