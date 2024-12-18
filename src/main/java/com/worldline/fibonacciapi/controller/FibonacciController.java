package com.worldline.fibonacciapi.controller;

import com.worldline.fibonacciapi.model.Fibonacci;
import com.worldline.fibonacciapi.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {

    @Autowired
    private final FibonacciService fibonacciService;

    public FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping("/{number}")
    public Fibonacci isFibonacci(@PathVariable long number) {
        int index = fibonacciService.getFibonacciIndex(number);
        return new Fibonacci(number, index, index != -1);
    }
}
