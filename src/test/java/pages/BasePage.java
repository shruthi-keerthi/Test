package pages;

import org.openqa.selenium.By;

import static utility.BrowserClass.driver;

public class BasePage {
    public static String pageLink = "https://www.tkmaxx.com/uk/en/";

    public static String signUp = "Sign In";

    public void basePage(){
        driver.get(pageLink);
    }

    public void click_signUp(){
        driver.findElement(By.linkText(signUp)).click();
    }

}
