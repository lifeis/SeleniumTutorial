package com.Liulanqi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start firefox browser...");
		
		 System.setProperty("webdriver.gecko.driver","E:\\3.End\\Java\\lib\\webdriver\\geckodriver.exe");
//		 DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//		    capabilities.setCapability("marionette", false);
		    WebDriver driver = new FirefoxDriver();
		 Navigation navigation = driver.navigate();
		 navigation.to("http://www.baidu.com/");
		 System.out.println("start firefox browser succeed...");
//此时浏览器成功打开，需要手动将其关闭即可		 
	}

}
