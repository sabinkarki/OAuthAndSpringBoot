package com.auth.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by sabin on 8/10/2017.
 */
@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String getHome() {
        return "index.html";
    }
}
