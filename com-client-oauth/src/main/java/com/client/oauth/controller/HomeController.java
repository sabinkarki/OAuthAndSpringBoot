package com.client.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by sabin on 8/7/2017.
 */
@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String home() {
        return "index";
    }
}
