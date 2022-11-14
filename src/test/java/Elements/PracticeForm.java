package Elements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeForm {
    String tab;
    @FindBy(id = "firstName")
    WebElement txtFirstName;
    @FindBy(id = "lastName")
    WebElement txtLastName;
    @FindBy(id = "userEmail")
    WebElement txtEmail;
    @FindBy(tagName = "div")
    List<WebElement> rb1;
    @FindBy(id = "userNumber")
    WebElement txtMobile;
    @FindBy(id = "dateOfBirthInput")
    WebElement txtDate;
    @FindBy(id = "subjectsInput")
    WebElement txtSubject;
    @FindBy(id = "hobbies-checkbox-1")
    WebElement sportsCheckBox;
    @FindBy(id = "hobbies-checkbox-2")
    WebElement readingCheckBox;
    @FindBy(id = "uploadPicture")
    WebElement uploadPic;
    @FindBy(id = "currentAddress")
    WebElement txtCurrentAddress;
    @FindBy(id = "react-select-3-input")
    WebElement dropState;
    @FindBy(id = "react-select-4-input")
    WebElement dropCity;
    @FindBy(id = "submit")
    WebElement btnConfirm;
    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement lblOutput;
    @FindBy(id = "closeLargeModal")
    WebElement btnClose;

    WebDriver driver;

    public PracticeForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String FillUpForm(String email, String mobile) throws InterruptedException {
        txtFirstName.sendKeys("Leo");
        txtLastName.sendKeys("Messi");
        txtEmail.sendKeys(email);
        rb1.get(71).click();
        txtMobile.sendKeys(mobile);

        Actions actions = new Actions(driver);
        actions.moveToElement(txtDate).
                doubleClick().click().click().
                perform();
        Thread.sleep(3000);
        txtDate.sendKeys("20 Dec 1996");
        txtDate.sendKeys(Keys.ENTER);

        txtSubject.sendKeys("Math");
        txtSubject.sendKeys(Keys.ENTER);
        txtSubject.sendKeys("Chemistry");
        txtSubject.sendKeys(Keys.ENTER);
        txtSubject.sendKeys("Physics");
        txtSubject.sendKeys(Keys.ENTER);

        Actions action = new Actions(driver);
        //if first checkbox is not selected.
        if (!sportsCheckBox.isSelected()) {
            action.moveToElement(sportsCheckBox).click().perform();
        }
        //if the second checkbox is enabled click on it.
        Thread.sleep(1000);
        if (sportsCheckBox.isEnabled()) {
            action.moveToElement(readingCheckBox).click().perform();
        }

        uploadPic.sendKeys("D:\\job\\PICTOR.jpg");
        txtCurrentAddress.sendKeys("90/A Hatembag mojjid,Dhanmondi 15,Dhaka");

        dropState.sendKeys("Uttar Pradesh");
        dropState.sendKeys(Keys.ENTER);
        dropCity.sendKeys("Lucknow");
        dropCity.sendKeys(Keys.ENTER);
        btnConfirm.sendKeys(Keys.ENTER);
        return lblOutput.getText();
    }
    public void blankFillUpForm(){
        btnConfirm.sendKeys(Keys.ENTER);
    }
    public String mandatoryFieldsShouldFillUp(String email, String mobile) throws InterruptedException {
        txtFirstName.sendKeys("Leo");
        txtLastName.sendKeys("Messi");
        txtEmail.sendKeys(email);
        rb1.get(71).click();
        txtMobile.sendKeys(mobile);

        Actions actions = new Actions(driver);
        actions.moveToElement(txtDate).
                doubleClick().click().click().
                perform();
        Thread.sleep(3000);
        txtDate.sendKeys("20 Dec 1996");
        txtDate.sendKeys(Keys.ENTER);

        btnConfirm.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        btnClose.sendKeys(Keys.ENTER);
        return lblOutput.getText();
    }
}
