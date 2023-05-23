package com.bjit.reactive_programming;

import reactor.core.publisher.Mono;

public class Palindrome {
    public static void main(String[] args) {
        String str = "radar";

        Mono.just(str)
                .map(s -> s.equals(String.valueOf(new StringBuilder(s).reverse())))
                .subscribe(isPalindrome -> System.out.println("Is Palindrome: " + isPalindrome));
    }
}
