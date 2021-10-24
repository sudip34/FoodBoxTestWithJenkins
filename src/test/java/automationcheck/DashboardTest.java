package automationcheck;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardTest {
	
	public static void main(String[] args) {

		String path="C:\\Users\\sudip\\Desktop\\MainProject\\FoodBoxTestWithJenkins\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		//load the webpage
		driver.get("http://localhost:4200/dashboard");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//provide implicit wait
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
//		List<WebElement>  columns = driver.findElements(By.xpath(".//*[@id=\"product\"]/table/tbody/tr/th"));
//        System.out.println("No of columns are : " +columns.size()); 
//        //No.of rows 
//        List<WebElement>  rows = driver.findElements(By.xpath(".//*[@id='product']/table/tbody/tr/td[1]")); 
//        System.out.println("No of rows are : " + rows.size());
//        
//		
		String tableHeader = driver.findElement(By.xpath("//*[@id=\"table\"]/thead/tr")).getText();
		System.out.println(tableHeader);
		
		String tableData1 = driver.findElement(By.xpath("//*[@id='table']/tbody")).getText();
		System.out.println(tableData1);

	}

}
