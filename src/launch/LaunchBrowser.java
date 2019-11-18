package launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hi\\eclipse-workspace\\KalaiVaniV\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement sim = driver.findElement(By.xpath("//button[text()='Prompt Pop up']"));
		j.executeScript("arguments[0].click()", sim);
		Thread.sleep(5000);
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("No");
		a.dismiss();
		driver.quit();
	}
}
