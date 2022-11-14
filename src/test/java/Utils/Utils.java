package Utils;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    public int generateRandomNumber(int min,int max){
        int randomId= (int)(Math.random() * ((max - min) + 1)) + min;
        return randomId;
    }

}
