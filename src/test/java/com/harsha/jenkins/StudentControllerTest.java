package com.harsha.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.harsha.jenkins.controllers.StudentController;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {
	
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void getStudentsTest() throws Exception{
		StudentController sc =  new StudentController();
		List<String> response = sc.getStudents();
		List<String> expected = Arrays.asList("asdfsdf","adfdsf");
		assertEquals(expected,response);
		
		RequestBuilder request = MockMvcRequestBuilders.get(URI.create("/students"));
		MvcResult result = mockMvc.perform(request).andReturn();
		result.getResponse().getContentAsString();
	}
}
