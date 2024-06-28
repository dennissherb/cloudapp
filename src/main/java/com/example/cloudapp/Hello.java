/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.cloudapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author denis
 */
@RestController
public class Hello {
    @GetMapping("/hello")
    public String getHello(@RequestParam(value = "name", required = false) String name) {
        if (name != null) {
            return "Hello " + name;
        }
        return "Hello, world!";
    }
    
}
