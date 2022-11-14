package TestRunner;

import Elements.PracticeForm;
import Utils.Utils;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormTestRunner extends Setup {
    Utils utils = new Utils();
    String email;
    String mobile;
    PracticeForm practiceForm;

    public void basicInfo() {
        String emailUserAcc = "testautouser" + utils.generateRandomNumber(1000, 9999);
        email = emailUserAcc + "@test.com";
        mobile = "175" + utils.generateRandomNumber(1000000, 9999999);
    }

    @Test(priority = 3,description = "{Successful fillUp data and submit to the user page")
    public void FillUpForm() throws InterruptedException {
        practiceForm = new PracticeForm(driver);
        basicInfo();
        String res = practiceForm.FillUpForm(email, mobile);
        Assert.assertTrue(res.contains("Thanks"));
    }

    @Test(priority = 1,description = "User press submit button without inputting any data")
    public void blankFillUpForm() {
        driver.get("https://demoqa.com/automation-practice-form");
        practiceForm = new PracticeForm(driver);
        practiceForm.blankFillUpForm();
    }
    @Test(priority = 2,description = "Mandatory Fields Must be filled up for successful submit")
    public void mandatoryFieldsShouldFillUp() throws InterruptedException {
        practiceForm = new PracticeForm(driver);
        basicInfo();
        String res = practiceForm.mandatoryFieldsShouldFillUp(email, mobile);
        Assert.assertTrue(res.contains("Thanks"));
    }
}
