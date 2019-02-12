package com.json.writer;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGeneratorExample {

	public static void main(String a[]) throws JsonGenerationException, JsonMappingException, IOException{
		 
        StringWriter sw = new StringWriter();
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("abc", 90l);
        objectMapper.writeValue(sw, user);
        sw.close();
        System.out.println(sw);
       
    }
}
