import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Users/natyam/Desktop/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.opencart.com");
		String title="Your Store";
		if(title.equals(driver.getTitle()))
        {
        	System.out.println("matches");
        }
        else
        {
        	System.out.println("not matches");
        }
		driver.findElement(By.linkText("My Account")).click();
		Select account=new Select(driver.findElement(By.linkText("My Account")));
		account.selectByIndex(1);
		
		
		

	}

}