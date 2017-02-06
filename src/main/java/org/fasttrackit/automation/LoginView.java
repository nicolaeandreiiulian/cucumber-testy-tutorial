package org.fasttrackit.automation;
import com.sdl.selenium.web.WebLocator;

public class LoginView {
    public WebLocator emailField = new WebLocator().setId("email");
    public WebLocator passwordField = new WebLocator().setName("password");
    public WebLocator loginBtn = new WebLocator().setClasses("login-btn");

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginBtn.click();

    }
}
