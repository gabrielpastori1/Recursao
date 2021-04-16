package br.pucpr.ed.recursao;

import java.io.File;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("5! = " + OperacaoMatematica.fatorial(5));
        System.out.println("potencia(2,8) = " + OperacaoMatematica.potencia(9, 3));
        System.out.println("fibonacci(4): " + OperacaoMatematica.fibonacci(4));
        Integer[] array = {4, 2, 1, 10, 5};
        Integer maiorElemento = ArrayUtils.maiorElementoNoArray(array, array.length);
        System.out.println("Maior elemento no array: " + maiorElemento);
    }
}
