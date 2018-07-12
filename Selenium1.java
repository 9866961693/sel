
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/natyam/Desktop/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector("input[value='roundtrip']")).click();
		driver.findElement(By.linkText("PROFILE")).click();
		driver.findElement(By.partialLinkText("Flig")).click();
		
		Select fromcountries= new Select(driver.findElement(By.name("fromPort")));
		fromcountries.selectByIndex(2);
	
		
		Select passenger=new Select(driver.findElement(By.name("passCount")));
		passenger.selectByValue("2");
		
		Select tocountries=new Select(driver.findElement(By.name("toPort")));
	    tocountries.selectByVisibleText("Frankfurt");
			
	}
}
