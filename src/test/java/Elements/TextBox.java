package Elements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBox {
    @FindBy(xpath = "//span[contains(text(),'Text Box')]")
    WebElement linkTextBox;
    @FindBy(id = "userName")
    WebElement txtFullName;
    @FindBy(id = "userEmail")
    WebElement txtEmail;
    @FindBy(id = "currentAddress")
    WebElement txtCurrAddress;
    @FindBy(id = "permanentAddress")
    WebElement txtPerAddress;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement btnSubmit;
    @FindBy(id = "output")
    WebElement lblOutput;

    WebDriver driver;

    public TextBox(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String uploadData() throws InterruptedException {
        linkTextBox.click();
        txtFullName.sendKeys("Abir Hossen");
        txtEmail.sendKeys("abir@gmail.com");
        txtCurrAddress.sendKeys("90/A Hatembag mojjid,Dhanmondi 15,Dhaka");
        txtPerAddress.sendKeys("90/A Hatembag mojjid,Dhanmondi 15,Dhaka");
        Thread.sleep(3000);
        btnSubmit.sendKeys(Keys.ENTER);
        return lblOutput.getText();
    }
}
