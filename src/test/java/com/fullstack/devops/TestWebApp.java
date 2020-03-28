package com.fullstack.devops;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestWebApp extends DevopsApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;

	

	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testgetUsers() throws Exception {
		mockMvc.perform(get("/api/users"))
		.andExpect(status().isOk())
		.andExpect(view().name("list-users"));
	}
	
	@Test
	public void testAddUser() throws Exception {
		mockMvc.perform(get("/api/user/add"))
		.andExpect(status().isOk())
		.andExpect(view().name("add-user"));
	}
}
