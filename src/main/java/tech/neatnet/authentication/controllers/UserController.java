package tech.neatnet.authentication.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping()
public class UserController {

    @GetMapping(value = "/m")
    public String login() {
        return "Great Success !";
    }

}