package org.fasttrackit.automation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage {
    @FindBy (name = "password")
    private WebElement currentPasswordField;

    @FindBy (name = "newPassword")
    private WebElement newPasswordField;

    @FindBy (name = "newPasswordRepeat")
    private WebElement repeatPasswordField;

    @FindBy (xpath = "//*[@id='preferences-win']//button[normalize-space(text())='Save']")
    private WebElement saveBtn;

    @FindBy (className = "status-msg")
    private WebElement statusMessage;

    public void changePassword(String currentPass, String newPass, String repeatPass) {
        currentPasswordField.sendKeys(currentPass);
        newPasswordField.sendKeys(newPass);
        repeatPasswordField.sendKeys(repeatPass);
        saveBtn.click();
    }

    public String getStatusMessage() {
        String msg = statusMessage.getText();
        System.out.println(msg);
        return msg;
    }
}
