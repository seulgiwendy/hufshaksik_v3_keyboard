package com.amazonaws.lambda.demo;
import org.json.simple.*;
import java.util.*;


public class seoul_list {
	
	static JSONObject seoulKeyboard() {
		
		JSONObject returnKeyboard = new JSONObject();
		ArrayList <String> keyList = new ArrayList<String>();
		keyList.add("인문관식당");
		keyList.add("교수회관식당");
		keyList.add("업데이트 일정 안내");
		
		
		returnKeyboard.put("buttons", keyList);
		returnKeyboard.put("type", "buttons");
		return returnKeyboard;
		
		
	}

}
