package com.formationkilo.dockerfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
@RestController
public class DockerfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerfileApplication.class, args);
    }
    @GetMapping("/test")
    public Map<String,Object> test(){
        Map<String,Object>data= new HashMap<>();
        data.put("name","From Docker");
        data.put("counter",456);
        return data;

    }
}
