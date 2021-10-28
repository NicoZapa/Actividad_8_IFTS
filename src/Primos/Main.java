package Primos;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int n6 = 17;
        int n = 10;
        int n2 = 3;
        int n3 = 11;
        int n4 = 22;
        int n5 = 3;

        CalcuPrimos calculadora_P = new CalcuPrimos();

        System.out.println(calculadora_P.esPrimo(n));
        System.out.println(calculadora_P.esPrimo(n2));
        System.out.println(calculadora_P.esPrimo(n3));
        System.out.println(calculadora_P.esPrimo(n4));
        System.out.println(calculadora_P.esPrimo(n5));
        System.out.println(calculadora_P.esPrimo(n6));

        calculadora_P.primosConocidos();
    }
}
