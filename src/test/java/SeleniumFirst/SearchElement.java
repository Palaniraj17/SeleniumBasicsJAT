package SeleniumFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence",Keys.ENTER);
		driver.findElement(By.id("toc-History")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String currentpageURL = driver.getCurrentUrl();//For verification purpose - history page is currently displaying to the user
		System.out.println(currentpageURL);//For verification purpose - history page is currently displaying to the user
		driver.close();
	}
}
