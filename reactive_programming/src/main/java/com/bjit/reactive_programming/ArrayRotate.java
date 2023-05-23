package com.bjit.reactive_programming;

import reactor.core.publisher.Flux;

import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("For left shift press \"l\"");
        System.out.println("For right shift press \"r\"");
        String str = sc.nextLine();

        if(str.equals("r")) {
            Flux.range(0, array.length)
                    .map(index -> array[(index + 1) % array.length])
                    .subscribe(System.out::print);
        }
        else{
            Flux.range(0, array.length)
                    .map(index -> array[(index - 1) % array.length])
                    .subscribe(System.out::print);
        }
    }
}
