package com.worldline.fibonacciapi.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    public int getFibonacciIndex(long number) {
        int a = 0, b = 1;
        int index = 0;

        if (number < 0) {
            return -1;
        }

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
