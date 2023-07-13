package Group_1_FB_Project;
// TEST CASE - CreateNewAccountWithPhoneNumber

import Group_1_FB_Project.Utilities.BaseDriver;
import Group_1_FB_Project.Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Jazeera extends BaseDriver {

    @Test
    public void  Test1() {

        driver.get("https://www.facebook.com/#");
        driver.manage().window().maximize();
        MyMethods.myWait(1);

        WebElement createNewAccountButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
        createNewAccountButton.click();
        MyMethods.myWait(1);


        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Jennifer");
        MyMethods.myWait(1);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Puti");
        MyMethods.myWait(1);

        WebElement mobNumber = driver.findElement(By.name("reg_email__"));
        mobNumber.sendKeys("15417256659");
        MyMethods.myWait(1);

        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("123456");
        MyMethods.myWait(1);

        WebElement birthdayMonth = driver.findElement(By.id("month"));
        birthdayMonth.sendKeys("Aug");
        birthdayMonth.click();

        WebElement birthdayDate = driver.findElement(By.name("birthday_day"));
        birthdayDate.sendKeys("18");
        birthdayDate.click();


        WebElement birthdayYear = driver.findElement(By.name("birthday_year"));
        birthdayYear.sendKeys("1990");
        birthdayYear.click();

        WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
        gender.sendKeys("1990");
        gender.click();
        MyMethods.myWait(1);


        WebElement signUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUpButton.click();
        MyMethods.myWait(1);


  waitAndQuit();


    }

}
