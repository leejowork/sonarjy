package com.sonarjystudy.controller;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(WelcomeController.class)
class WelcomeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void welcomeMap_basic() throws Exception {
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
														.get("/welcome/jesus")
														.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder)
								.andExpect(status().isOk())
								.andExpect(content().string("jesus welcome"))
								.andReturn();
		//verify "Hello World"
		assertEquals("jesus welcome", result.getResponse().getContentAsString());
		
	}
	
}
