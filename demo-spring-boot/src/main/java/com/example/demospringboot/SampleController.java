package com.example.demospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController // MAKING API inside class visible for the embedded server so that it can route to an appropriate function
public class SampleController {
    //define APIS to do certain tasks
    // Basically the landing point of aal requests from various clients
    // base url -127.0.0.1:9000
    //api path   - /sample , /hello
    //input -


    @GetMapping("/hello")
    public String sayHello(@RequestParam("n") String name)
    {
        return "Hello" + name;
    }
}
