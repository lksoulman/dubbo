package com.lksoulman.dubbo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	public static String ToJsonString(Object obj) throws JsonProcessingException {
		if (obj == null) 
			return "";
			
		ObjectMapper objMapper = new ObjectMapper();
		String jsonString = objMapper.writeValueAsString(obj);
		
		return jsonString;
	}
}
