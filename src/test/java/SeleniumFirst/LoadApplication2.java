package SeleniumFirst;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadApplication2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("The current URL of the page is "+CurrentURL);
		driver.navigate().refresh();
		driver.close();
	}
}
