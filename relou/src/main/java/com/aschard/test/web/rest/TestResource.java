package com.aschard.test.web.rest;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for view and managing Log Level at runtime.
 */
@RestController
@RequestMapping("/test")
public class TestResource {

    @GetMapping("/first")
    public List<String> getFirst() {
    	List<String> listString = new ArrayList<>();
    	
    	listString.add("yo");
    	
        return listString;
    }

    @PutMapping("/logs")
    public void modifysomething(@RequestBody String something) {
        
    }
}
