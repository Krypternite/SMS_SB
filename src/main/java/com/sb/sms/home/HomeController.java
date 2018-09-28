/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.sms.home;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author samad
 */
@RestController
public class HomeController {

    @RequestMapping("/")
   public String hello() {
        return "Hello World. I did it. Yes !!!!";
    }
}
