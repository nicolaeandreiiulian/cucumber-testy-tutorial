package org.fasttrackit.automation;
import com.sdl.selenium.web.WebLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginView {
    public WebLocator emailField = new WebLocator().setId("email");
    public WebLocator passwordField = new WebLocator().setName("password");

   // @FindBy(className = "loginButton")
    public WebLocator loginBtn = new WebLocator().setClasses("login-btn");

    public void login(String email, String password) {
       emailField.sendKeys(email);
       passwordField.sendKeys(password);
       loginBtn.click();


    }
}
