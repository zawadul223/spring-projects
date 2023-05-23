package com.bjit.reactive_programming;

import reactor.core.publisher.Flux;

import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "I love CSE";

        Flux.fromArray(str.split(""))
                .groupBy(key -> key)
                .flatMap(groupedFlux -> groupedFlux.count()
                        .map(count -> Map.entry(groupedFlux.key(), count)))
                .collectMap(Map.Entry::getKey, Map.Entry::getValue)
                .subscribe(System.out::println);
    }

}
