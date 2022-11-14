package TestRunner;

import Elements.TextBox;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTestRunner extends Setup {
    @Test
    public void uploadData() throws InterruptedException {
        driver.get("https://demoqa.com/elements");
        TextBox textBox = new TextBox(driver);
        String res = textBox.uploadData();
        Assert.assertTrue(res.contains("Name"));
    }
}
