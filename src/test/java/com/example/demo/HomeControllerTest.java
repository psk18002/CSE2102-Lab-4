package com.example.demo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HomeController.class)   // <1>
public class HomeControllerTest {

  @Autowired
  private MockMvc mockMvc;   // 

  @Test
  public void testNotHomePage() throws Exception {
    mockMvc.perform(get("/logincreate"))   
      .andExpect(status().isOk()) 
      .andExpect(view().name("logincreate"))
      .andExpect(content().string(containsString("Login/Create Account - Welcome")));
  }

  @Test
  public void testTestPage() throws Exception {
    mockMvc.perform(get("/usr"))   
      .andExpect(status().isOk()) 
      .andExpect(view().name("usrProfile"))
      .andExpect(content().string(containsString("TEST")));
  }

  @Test
  public void testHomePage() throws Exception {
    mockMvc.perform(get("/"))   
      .andExpect(status().isOk()) 
      .andExpect(view().name("home"))
      .andExpect(content().string(containsString("HELLO!!")));
  }

  @Test
  public void testQnAPage() throws Exception {
    mockMvc.perform(get("/qna"))   
      .andExpect(status().isOk()) 
      .andExpect(view().name("qna"))
      .andExpect(content().string(containsString("Questions and Answers")));
  }
}