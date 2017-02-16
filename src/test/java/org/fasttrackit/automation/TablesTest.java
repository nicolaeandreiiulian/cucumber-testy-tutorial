package org.fasttrackit.automation;

import com.sdl.selenium.web.WebLocator;
import org.fasttrackit.util.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TablesTest extends TestBase{

    @Test
    public void SelectTableRowTest(){

        openLoginPage();
        loginView.login("eu@fast.com", "eu.pass");
        //WebElement checkbox = driver.findElement(By.xpath("//table//input"));
        WebLocator checkbox = new WebLocator().setElPath("//table//input");
        checkbox.click();
    }

}
