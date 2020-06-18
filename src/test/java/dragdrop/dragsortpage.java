package dragdrop;


import java.util.List;
import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URL;

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

import dragdrop.commonutils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.AndroidMobileCapabilityType;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;

public class dragsortpage {
public static AndroidDriver driver;
	

public static void BasicUsagePlayground() {
	driver=commonutils.getDriver();
	driver.findElementById("com.mobeta.android.demodslv:id/activity_desc").click();
	
}

public static void swap() {
	TouchAction action = new TouchAction(driver);
	action.longPress(new PointOption().point(100, 358)).
	waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1))).moveTo(new PointOption().point(100, 1186)).perform().release();
	System.out.println("Done");
	
}
	
}
	


