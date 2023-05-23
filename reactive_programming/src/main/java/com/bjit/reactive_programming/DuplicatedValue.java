package com.bjit.reactive_programming;

import reactor.core.publisher.Flux;

public class DuplicatedValue {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 1, 5};

        System.out.println("Duplicate elements in the array:");

        Flux.fromArray(arr)
                .groupBy(i -> i)
                .flatMap(group -> group.skip(1))
                .distinct()
                .subscribe(System.out::println);
    }

}
