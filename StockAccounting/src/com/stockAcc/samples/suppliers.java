package com.stockAcc.samples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class suppliers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 boolean  flag=false;
		 WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("http://webapp.qedgetech.com");
		   driver.findElement(By.id("btnreset")).click();
		   driver.findElement(By.id("username")).sendKeys("admin");
		   driver.findElement(By.id("password")).sendKeys("master");
		   driver.findElement(By.id("btnsubmit")).click();
		   driver.findElement(By.linkText("Suppliers")).click();
		   
		   Thread.sleep(2000);
				   
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		   Thread.sleep(2000);
		   String expval= driver.findElement(By.id("x_Supplier_Number")).getAttribute("value");
		   driver.findElement(By.id("x_Supplier_Name")).sendKeys("manu123");
		   driver.findElement(By.id("x_Address")).sendKeys("nyd");
		   driver.findElement(By.id("x_City")).sendKeys("nzb");
		   driver.findElement(By.id("x_Country")).sendKeys("india");
		   driver.findElement(By.id("x_Contact_Person")).sendKeys("krishna");
		   driver.findElement(By.id("x_Phone_Number")).sendKeys("8330949357");
		   driver.findElement(By.id("x__Email")).sendKeys("manuki@gmail.com");
		   driver.findElement(By.id("x_Mobile_Number")).sendKeys("8330949357");
		   driver.findElement(By.id("x_Notes")).sendKeys("vxwbhx");
		   driver.findElement(By.id("btnAction")).click();
		   driver.findElement(By.xpath(".//*[@class='ajs-footer']/div[2]/button[1]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath(".//*[@class='ajs-footer']/div[2]/button")).click();
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[2]/div[2]/div/button")).click();
		   driver.findElement(By.id("psearch")).sendKeys(expval);
		   driver.findElement(By.id("btnsubmit")).click();
		   Thread.sleep(2000);
		   List<WebElement>rows=driver.findElements(By.xpath(".//table[@id='tbl_a_supplierslist']/tbody/tr"));
		 
		 
        
           for (int i = 0; i <rows.size(); i++) 
           {
        	   List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
        	
        	   String actval=cols.get(5).getText();
			   if (expval.equalsIgnoreCase(actval))
			   {
				   flag=true;
				 break;
			   }
			}
           if(flag)
           {
        	   System.out.println("true");
		   
		   }
           else
           {
        	   System.out.println("false");
           }
	
	}
}

	
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		      
		   
		   

	


