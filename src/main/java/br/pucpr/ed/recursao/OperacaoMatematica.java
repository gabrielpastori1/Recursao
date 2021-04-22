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
        if(n==0 || n==1) return 1;
        return (fibonacci(n-1) + fibonacci(n-2));
    }

    // Implementação exercício 4
    public static Integer numeroTriangular(Integer n){
        if(n == 1) return n;
        return n + numeroTriangular(n-1);
    }
}
