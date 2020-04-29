package _midterm._midterm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class FileReaderd {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		
		JSONParser parser = new JSONParser();
	
        Scanner filescan = new Scanner(new FileReader("C:\\Users\\82103\\Desktop\\midterm.json"));
        
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        String allstr = "";
        while(filescan.hasNext()) {
        	allstr += filescan.nextLine();
        }
        JSONObject obj = null;
        obj = (JSONObject) parser.parse(allstr);
        JSONArray jarr = (JSONArray) obj.get("poem");
        for(int i=0;i<jarr.size();i++) {
        	JSONObject tobj = (JSONObject) jarr.get(i);
        	String tempstr = (String) tobj.get("item");
        	if(tempstr.contains(str)) {
        		System.out.println("item "+(i+1)+":"+tempstr);
        	}
        }

	}

}
