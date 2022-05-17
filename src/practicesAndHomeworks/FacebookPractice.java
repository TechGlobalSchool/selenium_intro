package practicesAndHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import static utilities.ValidationUtils.*;

public class FacebookPractice {
    /**
     * 1. Go to https://www.facebook.com/
     * 2. Validate the title of the page is “Facebook - Log In or Sign Up”
     * 3. Validate the URL of the page is “https://www.facebook.com/”
     * 4. Validate “facebook” logo is displayed
     * 5. Validate heading2 “Connect with friends and the world  around you on Facebook.” is displayed
     * 6. Validate “Email or Phone Number” input box is displayed
     * 7. Validate “Password” input box is displayed
     * 8. Validate “Log In” button is displayed and enabled
     * 9. Validate “Forgot Password?” link is displayed
     * 10. Validate “Create New Account” button is displayed
     *
     * @param args
     */

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();


        try {
            // get the website
            driver.get("https://www.facebook.com/");

            String expectedTitle = "Facebook - log in or sign up";
            validateTitle(driver, expectedTitle);

            String expectedUrl = "https://www.facebook.com/";
            validateURL(driver, expectedUrl);

            /*
            xpath --> //tagName[@attributeName = 'attributeValue']
            css   --> tagName[attributeName = 'attributeValue']
             */
            //                         xpath -->   //img[@class = 'fb_logo _8ilh img']
            //                         css   -->     img[class = 'fb_logo _8ilh img']

//            WebElement fbLogo = driver.findElement(By.className("fb_logo"));
//            WebElement fbLogo = driver.findElement(By.cssSelector(".fb_logo"));
//            WebElement fbLogo = driver.findElement(By.xpath("//img[@class = 'fb_logo _8ilh img']"));
            WebElement fbLogo = driver.findElement(By.cssSelector("img[class = 'fb_logo _8ilh img']"));
            validateElementIsDisplayed(fbLogo, "Facebook logo");



        } finally {
            Driver.quitDriver();
        }


    }
}
