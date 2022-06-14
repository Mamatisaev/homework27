package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int squareRoot = scanner.nextInt();
        UnaryOperator<Double> unaryOperator = Math::sqrt;
        System.out.println(unaryOperator.sqrt(squareRoot));
    }
}


@FunctionalInterface
interface UnaryOperator<T> {
    T sqrt(double number);
}