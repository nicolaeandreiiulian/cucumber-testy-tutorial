package org.fasttrackit.automation;

import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.testng.annotations.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ElementsTest extends TestBase{

    private CheckBox stopProcessCheckbox = new CheckBox().setElPath("/html/body/form[1]/div[3]/label/input");
    private CheckBox labelWidthEnterCheckbox = new CheckBox().setElPath("/html/body/form[1]/div[4]/label/input");
    private WebLocator stopProcessLabel = new WebLocator().setText("Stop the process?", SearchType.TRIM);
    private WebLocator widthEnterLabel = new WebLocator().setText("Label with Enter", SearchType.TRIM, SearchType.CHILD_NODE);

    public static void main (String[] args){
        ElementsTest test = new ElementsTest();
        System.out.println(test.stopProcessLabel.getSelector());
        System.out.println(test.widthEnterLabel.getSelector());
        System.out.println(test.stopProcessCheckbox.getSelector());
        System.out.println(test.labelWidthEnterCheckbox.getSelector());
    }

    @Test
    public void checkboxesTest(){
        openLoginPage();
        loginView.login("eu@fast.com","eu.pass");

        Utils.sleep(1000);
        stopProcessCheckbox.click();
        labelWidthEnterCheckbox.click();

        Utils.sleep(1000);
        stopProcessLabel.click();
        widthEnterLabel.click();

        Utils.sleep(1000);
        stopProcessLabel.click();
        widthEnterLabel.click();

        assertThat ("Stop the process is not selected!", stopProcessCheckbox.isSelected(), is(true));
        assertThat ("Label with Enter!", labelWidthEnterCheckbox.isSelected(), is(true));
    }



}
