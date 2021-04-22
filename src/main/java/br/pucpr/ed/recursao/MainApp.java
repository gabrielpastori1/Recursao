package br.pucpr.ed.recursao;

import java.io.File;

public class MainApp {
    public static void main(String[] args) {
        // Coloque um path válido como parâmetro do construtor
        File file = new File("c:");
        System.out.println("Tamanho do arquivo ou diretório no path: " + FileUtils.usoEmDisco(file));

        //Fiquem a vontade para mudar o valor das variáveis para testar seus métodos!
        Integer n = 5;
        System.out.println(n + "! = " + OperacaoMatematica.fatorial(n));
        Integer x = 9;
        Integer y = 3;
        System.out.printf("potencia(%d,%d) = %d\n", x, y, OperacaoMatematica.potencia(9, 3));
        System.out.printf("fibonacci(%d) = %d\n", n, OperacaoMatematica.fibonacci(4));
        Integer[] array = {4, 2, 1, 10, 5};
        Integer maiorElemento = ArrayUtils.maiorElementoNoArray(array, array.length);
        System.out.println("Maior elemento no array: " + maiorElemento);

        Integer nTriangular = OperacaoMatematica.numeroTriangular(16);
        System.out.println("Numero triangular: " + nTriangular);
    }
}
