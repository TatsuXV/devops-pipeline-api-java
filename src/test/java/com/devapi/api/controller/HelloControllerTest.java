package com.devapi.api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testeHelloEndPoint() throws Exception{
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello mundo"));
    }

    @Test
    void testeHealthEndPoint() throws Exception{
        mockMvc.perform(get("/health"))
                .andExpect(status().isOk())
                .andExpect(content().string("UP"));
    }
}
