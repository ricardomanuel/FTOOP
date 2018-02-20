package ch.ffhs.task.primzahlen;

import ch.ffhs.task.primzahlen.calculator.Calculator;

public class Main {

    public static void main(String[] args){

        Calculator calc = new Calculator();
        int a = calc.addition(5,5);
        System.out.println(a);
    }
}