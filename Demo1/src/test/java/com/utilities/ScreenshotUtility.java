package com.utilities;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility 
{
	
	public static void takeScreenshot(WebDriver driver, String testName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);

            String path = System.getProperty("user.dir")
                    + "/screenshots/" + testName + ".png";

            File destination = new File(path);

            destination.getParentFile().mkdirs();

            Files.copy(source.toPath(), destination.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Screenshot saved: " + path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

