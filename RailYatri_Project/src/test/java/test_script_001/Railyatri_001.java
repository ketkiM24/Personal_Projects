package test_script_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import dynamic_code_001.Base_class_001;

public class Railyatri_001 extends Base_class_001 {

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.railyatri.in/");
		
		//Capture title of the web page
		System.out.println("The title of the page is - " + driver.getTitle());
		
		//Capture current url of the page
		System.out.println("The current url of the page - " + driver.getCurrentUrl());
		
		//locate from dropdown
		WebElement Board_from = driver.findElement(By.cssSelector("input#from_stn_input"));
		Board_from.sendKeys("Nagpur");
		
		//Click on dropdown option
		driver.findElement(By.xpath("//li[text()='NAGPUR | NGP']")).click();
		
		//capture city name 
		System.out.println("Entered city name is - " + Board_from.getAttribute("value"));
		
		//locate boarding to box
		driver.findElement(By.xpath("//input[@id='to_stn_input']")).sendKeys("Pune");
		
		//locate dropdown option
		driver.findElement(By.xpath("//li[text()='PUNE JN | PUNE']")).click();
		
		//click on calendar
		driver.findElement(By.xpath("//input[@id='datepicker_train']")).click();
		
		//click on arrow for next month
		driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
		driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
		
		
		//select date
		driver.findElement(By.xpath("//td[text()='30']")).click();
		
		//click on search box
		driver.findElement(By.xpath("//button[@id='search_btn_dweb']")).click();
		
		//scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		
		//click on book now
		driver.findElement(By.xpath("( //div[@class='text-center book_now_btn book_tkt_now book_button_22846_2A'])[1]")).click();

		//click on rs book now
		driver.findElement(By.xpath("(//button[text()='Book ₹1775'])[1]")).click();
		
		//scroll down page
		js.executeScript("window.scrollBy(0,400)");
		
		//select gender
		driver.findElement(By.xpath("(//li[text()='Female'])[1]")).click();
		
		//enter name 
		driver.findElement(By.xpath("(//input[@class='inputText'])[1]")).sendKeys("Ketki Mandaokar");
		
		//enter age
		driver.findElement(By.xpath("//input[@class='inputText ageinput']")).sendKeys("24");
		
		//berth select 
		driver.findElement(By.xpath("//input[@id='adult_add_berth']")).click();
		
		//select berth's dropdown option
		driver.findElement(By.xpath("//li[text()='Upper']")).click();
		
		//save and next
		driver.findElement(By.xpath("//button[@class='next_psngr_btn']")).click();
		
		//click email
		driver.findElement(By.xpath("//input[@id='user_email']")).click();
		
		// Close 
		
		
		
		
		
		
		
	}

}
