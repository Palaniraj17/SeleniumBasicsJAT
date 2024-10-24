package SeleniumFirst;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TitleVerification {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pageTitle = driver.getTitle();
		String expPageTitle ="STORE";
		if(pageTitle.equals(expPageTitle))
		{
			System.out.println("Page landed on correct website");
		}
		else
		{
			System.out.println("Page not landed on correct website");
		}
	
		driver.close();
	}
}
