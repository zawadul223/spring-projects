package com.bjit.reactive_programming;

import reactor.core.publisher.Flux;

public class UpperCaseAndReverse {
    public static void main(String[] args) {
        String [] str = {"hello","world"};
        Flux.fromArray(str)
                .map(s -> new StringBuilder(s).reverse().toString().toUpperCase())
                .subscribe(System.out::println);
    }

}
