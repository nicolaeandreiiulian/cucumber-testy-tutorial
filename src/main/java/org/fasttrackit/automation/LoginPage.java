package org.fasttrackit.automation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "email")
    public WebElement emailField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "loginButton")
    public WebElement loginBtn;

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginBtn.click();
    }
}