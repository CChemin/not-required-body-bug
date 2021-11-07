package com.example.notrequiredbodybug;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomethingController {

    @PostMapping(
        value = {"/something"})
    public void createSomethingThatMayHaveProperties(
        @RequestBody(required=false) Map<String, String> propertiesNotRequired 
    ){}
}
