package basic;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--remote-allow-origins=*");
       ChromeDriver driver = new ChromeDriver(Option);
       
         //driver.get("https://demo.actitime.com/login.do");
         
         driver.get("https://www.flipkart.com/");
         String ele = driver.findElement(By.xpath("//*[@alt='Appliances']")).getTagName();
         System.out.println(ele);
         
//        Dimension di = driver.findElement(By.id("username")).getSize();
//       System.out.println(di);
//       System.out.println(di.getWidth());
//       System.out.println(di.getHeight());
         
//        Point ele = driver.findElement(By.id("username")).getLocation();
//       System.out.println(ele);
//     System.out.println(ele.getX());
//     System.out.println(ele.getY());
     
//      org.openqa.selenium.Rectangle ele = driver.findElement(By.id("username")).getRect();
//      System.out.println(ele.getWidth());
//      System.out.println(ele.getHeight());
//      System.out.println(ele.getX());
//      System.out.println(ele.getY());
       

	}

}
