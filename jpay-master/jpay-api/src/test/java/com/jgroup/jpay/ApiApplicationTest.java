/**
 * 
 */
package com.jgroup.jpay;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author dockerking
 *
 */
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
//@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApiApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testUnifiedOrder() throws Exception{
		this.mockMvc.perform(post("/jpay/api/unifiedOrder")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("success")));
	}
	
	@Test
	public void testScanpayQuery() throws Exception{
		this.mockMvc.perform(post("/jpay/api/scanpayQuery")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("success")));
	}
}
