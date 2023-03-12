package com.town.base;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	


	public static AndroidDriver<MobileElement> driver;
	protected Properties prop ; 
	protected FileInputStream inputStream;
	public static WebDriverWait wait;

	@Parameters({"deviceName","platformName","platformVersion"})	
	@BeforeMethod(alwaysRun = true)
	public void beforeclass(String deviceName,String platformName, String platformVersion) throws Exception{
	

	File propFile = new File("src/main/resources/config/config.properties");
	inputStream= new FileInputStream(propFile);

	prop = new Properties();
	prop.load(inputStream);

	File androidApp =new File(prop.getProperty("androidAppPath"));
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.APP,androidApp.getAbsolutePath());
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
	cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.matkit.theme3.activity.Theme3MainActivity"); 	

		 driver = new AndroidDriver<MobileElement>(new URL(prop.getProperty("appuimServerLink")),cap);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 wait=new WebDriverWait(driver,20);
		 
		 
}

	@AfterClass
	public void afterclass() {
		driver.quit();
	}
	
    @AfterMethod(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }
    
	
	


}

