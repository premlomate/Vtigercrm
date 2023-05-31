package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingleElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		 String timestamp = ldt.toString().replace(':', '-');
		 
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(Option);
		
		driver.get("https://www.facebook.com/login/");
		WebElement button = driver.findElement(By.name("login"));
	     File tempfile = button.getScreenshotAs(OutputType.FILE);
	      
	    
		File destfile = new File("./webelement/pune2"+timestamp+".png");
	       FileUtils.copyFile(tempfile, destfile);
		
	}

}
