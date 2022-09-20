package com.example.restprimefactor.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestPrimeFactorService {
    //receives a number and returns its factors
    public List<Integer> factor(int numberToFactor){

        List<Integer> listOfFactors = new ArrayList<>();

        while (numberToFactor% 2 == 0) {
            listOfFactors.add(2);
            numberToFactor/= 2;
        }


        for (int i = 3; i <= Math.sqrt(numberToFactor); i += 2) {
            while (numberToFactor% i == 0) {
                listOfFactors.add(i);
                numberToFactor/= i;
            }
        }

        if (numberToFactor> 2) {
            listOfFactors.add(numberToFactor);
        }
        return listOfFactors;
    }
}
