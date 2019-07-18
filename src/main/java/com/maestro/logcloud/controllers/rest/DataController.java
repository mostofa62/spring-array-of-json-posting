package com.maestro.logcloud.controllers.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maestro.logcloud.models.CDlog;

@RestController
@RequestMapping("/api")
public class DataController {
	
	@PostMapping(value="/devicelog", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<CDlog> dataUpdate(@RequestBody String jsonData) {
	
		System.out.println(jsonData);
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			List<CDlog> map 
			  = objectMapper.readValue(jsonData, new TypeReference<List<CDlog>>(){});
			//ModelAndView mView = new ModelAndView();
			//int cu = Integer.parseInt(map.get("cloud_upload"));
			
			//map.put("cloud_upload", "1");
			//mView.addObject("dataupdate", map);
			
			for(CDlog m: map) {
				m.setCloud_upload(1);
				System.out.println(m.getId()+"|"+m.getUserid()+"Checktime:"+m.getChecktime()+"Cloud Upload"+m.getCloud_upload());
			}
			return map;
			
		}catch (JsonParseException e) {
			System.out.println(e);
			
		}catch (JsonMappingException e) {
			System.out.println(e);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		return null;
	}

}
