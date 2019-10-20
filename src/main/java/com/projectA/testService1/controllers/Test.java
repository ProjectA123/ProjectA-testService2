package com.projectA.testService1.controllers;

import com.projectA.testService1.payloads.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class Test {

    @RequestMapping(path = "/getService1Data", method = RequestMethod.GET)
    public Data getTestData1(){

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Data> response = restTemplate
                .getForEntity("https://projecta-testservice1.herokuapp.com/test/get", Data.class);

        Data body = response.getBody();
        body.setStr("Data from service1 - " + body.getStr());
        return body;
    }

    @RequestMapping(path = "/getService2Data", method = RequestMethod.GET)
    public Data getTestData2(){

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Data> response = restTemplate
                .getForEntity("https://projecta-testservice3.herokuapp.com/test/get", Data.class);

        Data body = response.getBody();
        body.setStr("Data from service2 - " + body.getStr());
        return body;
    }

}
