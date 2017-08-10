package com.resource.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sabin on 8/10/2017.
 */
@RestController
@RequestMapping(value = "/public")
public class PublicController {

    @GetMapping(value = "/resource")
    public String resource() {
        return "Here is public resource. This is to show that when a resource "
                + "is configured for public access, it doesn't need to go through the OAuth flow.";
    }
}
