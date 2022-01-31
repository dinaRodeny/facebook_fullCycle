package com.TaaS.qa.utilities;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JsonDataReader 
{
	
	public String URL,username,password;
    public void jsonReader () throws FileNotFoundException, IOException, ParseException
	{
		
		
		
		String filePath=System.getProperty("user.dir")+"/src/main/java/com/TaaS/qa/data/userData.json";
		File srcfile =new File(filePath);
		JSONParser jsonParser = new JSONParser();
		JSONArray jarray= (JSONArray)jsonParser.parse(new FileReader(srcfile));
		for(Object Jsonob: jarray)
		{
			
			JSONObject data = (JSONObject)  Jsonob;
			URL=(String) data.get("URL");
			
		}
		
	}

}
