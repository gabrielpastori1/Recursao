package br.pucpr.ed.recursao;

public class ArrayUtils {
    // Implementação exercício 3
    public static Integer maiorElementoNoArray(Integer[] array, int n){
        // Math.max(1,4); exemplo de uso do método max para identificar o maior entre 2 números
        if(n == 1) return array[0];
        return  Math.max(array[n-1], maiorElementoNoArray(array,n-1));
    }
}
