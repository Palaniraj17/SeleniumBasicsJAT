package SeleniumFirst;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadApplication {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		driver.navigate().refresh();
		driver.close();
	}
}
