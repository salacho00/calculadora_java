package com.calculadora.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class NumsServices {
    
    
    //sumar
    public int sumar(int num1, int num2){
        return num1 + num2;
    }
    //restar
    public int restar(int num1, int num2){
        return num1 - num2;
    }
    //multiplicar
    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    //dividir
    public double division(double num1, double num2){
        return num1 / num2;
    }
}
