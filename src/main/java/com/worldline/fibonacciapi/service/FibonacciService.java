package com.worldline.fibonacciapi.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    public int getFibonacciIndex(long number) {
        if (number < 0) {
            return -1;
        }

        int a = 0, b = 1;
        int index = 0;

        while (a <= number) {
            if (a == number) {
                return index;
            }

            int temp = a;
            a = b;
            b += temp;

            index++;
        }

        return -1;
    }
}
