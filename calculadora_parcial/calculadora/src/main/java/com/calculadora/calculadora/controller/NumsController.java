package com.calculadora.calculadora.controller;

import org.springframework.web.bind.annotation.RestController;

import com.calculadora.calculadora.service.NumsServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class NumsController {

    private final NumsServices numsServices;

    public NumsController(NumsServices numsServices) {
        this.numsServices = numsServices;
    }

    @GetMapping("/sumar")
    public int sumar(@RequestParam int num1, @RequestParam int num2) {
        return numsServices.sumar(num1, num2);
    }

    @GetMapping("/restar")
    public int restar(@RequestParam int num1, @RequestParam int num2) {
        return numsServices.restar(num1, num2);
    }
    
    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int num1, @RequestParam int num2) {
        return numsServices.multiplicar(num1, num2);
    }
    
    
    @GetMapping("/division")
    public double division(@RequestParam double num1, @RequestParam double num2) {
        return numsServices.division(num1, num2);
    }
    
    

    
}
