/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.sms.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author samad
 */
@RestController
public class HomeController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public String hello() {
        return "Hello World. I did it. Yes. Trying again and now once mroe..... !!!!";
    }

    @RequestMapping("/test")
    public String test() {
        return "This is a test BUTUUTUT response..... !!!!";
    }

    @RequestMapping("/testdb")
    public String testDb() {
        final String timestamp = jdbcTemplate.queryForObject("select current_timestamp", String.class);
        return "Database clock is set to: " + timestamp;
    }

}
