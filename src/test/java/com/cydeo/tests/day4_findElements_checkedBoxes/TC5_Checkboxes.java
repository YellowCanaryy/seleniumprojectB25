package com.cydeo.tests.day4_findElements_checkedBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC5_Checkboxes {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //1. Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes");
        //<input type="checkbox" name="checkbox1" id="box1">
        WebElement checkbox1=driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkbox1.isSelected() expecting false = " + checkbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected() expecting true= " + checkbox2.isSelected());
        //4. Click checkbox #1 to select it.
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.
        checkbox2.click();
        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected() expecting:True = " + checkbox1.isSelected());
        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("! checkbox2.isSelected() expecting true= " + !checkbox2.isSelected());
       // if(checkbox1.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
//        }
//        //   7. Confirm checkbox #2 is NOT selected.
//
//        if(!checkbox2.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
//        }



        driver.quit();
    }
}
