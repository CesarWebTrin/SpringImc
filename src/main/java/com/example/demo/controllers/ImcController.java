package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Person;
import com.example.demo.services.ImcService;

@RestController
@RequestMapping("/imc")
public class ImcController {
    @Autowired
    private ImcService svc;

    @PostMapping("/calculate")
    public Person calculateImc(@RequestBody Person person) {
        svc.calculate(person);

        return person;
    }
}
