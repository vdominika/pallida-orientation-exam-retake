package com.greenfoxacademy.clothingproject.Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.junit.Assert.*;

public class ApiResponseTest {

    @RunWith(SpringRunner.class)
    @SpringBootTest(classes = ApiResponse.class)
    public class ApiResponseTests {

        private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
                MediaType.APPLICATION_JSON.getSubtype(),
                Charset.forName("utf8"));

        private MockMvc mockMvc;

        @Autowired
        private WebApplicationContext webApplicationContext;

        @Before
        public void setup() throws Exception {
            this.mockMvc = webAppContextSetup(webApplicationContext).build();
        }

        @Test
        public void testIfResultIsOK() throws Exception {
            mockMvc.perform(get("/warehouse/query"))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(contentType))
                    .andExpect(jsonPath("$.result", is("ok")));
        }

        @Test
        public void testIfResultIsValid() throws Exception{
            mockMvc.perform(get("/warehouse/query"))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(contentType))
                    .andExpect(jsonPath("$.result", is("ok")));
        }
    }
}