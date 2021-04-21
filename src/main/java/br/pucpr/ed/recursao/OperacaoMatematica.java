package br.pucpr.ed.recursao;

public class OperacaoMatematica {

    public static Integer fatorial(Integer n) {
        if (n < 0) { // Validação de entrada
            throw new IllegalArgumentException("n não pode ser negativo.");
        } else if(n == 0){ // Caso base
            return 1;
        } else{ // Caso recursivo
            return n * fatorial(n - 1);
        }
    }

    // Implementação exercício 1
    public static Integer potencia(Integer x, Integer y){
        if(y == 0) return 1;
        return x * potencia(x, y-1);
    }

    // Implementação exercício 2
    public static Integer fibonacci(Integer n){
        return null;
    }

    // Implementação exercício 4
    public static Integer numeroTriangular(Integer n){
        return null;
    }
}
