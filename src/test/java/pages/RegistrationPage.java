package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utility.BrowserClass.driver;

import java.util.List;

public class RegistrationPage {

    public static String register_link = "Register";

    public static String email_address = "email-address";

    public static String title = "selectric";

    public void click_register_link() { driver.findElement(By.linkText(register_link)).click(); }

//    public void enter_email_address(){
//        driver.findElement(By.id(email_address)).sendKeys();
//    }
//
//    public void select_title(){
//        driver.findElement(By.className(title)).click();
//    }

}
