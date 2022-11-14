package Utils;

import jdk.nashorn.internal.parser.JSONParser;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    public int generateRandomNumber(int min,int max){
        int randomId= (int)(Math.random() * ((max - min) + 1)) + min;
        return randomId;
    }
    public void takeScreenshot(WebDriver driver) throws IOException {
        File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String time=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-aa").format(new Date());
        String fileWithPath="./src/test/resources/screenshots/"+time+".png";
        File DestFile= new File(fileWithPath);
        FileUtils.copyFile(screenshotFile,DestFile);
    }
}
