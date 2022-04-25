package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.baseClass.BaseClass;
import resources.utils.Utils;

public class ViewAppliedPositionPage extends BaseClass {

    @FindBy(xpath = "//a[normalize-space()='VIEW APPLIED POSITION']")
    WebElement viewAppliedBtn;

    @FindBy(xpath = "//div[@class='project-detailstitle']")
    WebElement projectName;

    @FindBy(xpath = "//a[@href ='/employee/projectdetails/77']")
    WebElement viewProjectBtn;

    @FindBy(xpath = "(//button[normalize-space()='Delete'])[1]")
    WebElement deleteBtn;

    @FindBy(xpath = "//button[@class='swal-button swal-button--cancel']")
    WebElement cancelBtn;

    @FindBy(xpath = "//div[@class='swal-button-container']")
    WebElement cancelOkBtn;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm swal-button--danger']")
    WebElement confirmOkBtn;

    public ViewAppliedPositionPage(){
        PageFactory.initElements(driver,this);
    }

    public String checkViewAppliedUrl(){
        viewAppliedBtn.click();
        String url = driver.getCurrentUrl();
        return url;
    }

    public void viewProjectDetails() throws InterruptedException {
        viewProjectBtn.click();
       // Utils.wait(3);
//        String actual = projectName.getText();
//        System.out.println("name is" + actual);
//        return actual;
    }
    public void deletePosition() throws InterruptedException {
        driver.navigate().back();
        Utils.wait(3000);
        deleteBtn.click();
        Utils.wait(5000);
        cancelBtn.click();
        cancelOkBtn.click();
        Utils.wait(5000);
        deleteBtn.click();
        confirmOkBtn.click();
    }
}
