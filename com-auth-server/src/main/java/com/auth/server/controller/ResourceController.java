package com.auth.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by sabin on 8/10/2017.
 */

@RestController
public class ResourceController {

    @GetMapping(value = "/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
