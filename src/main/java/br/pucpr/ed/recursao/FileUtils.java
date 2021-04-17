package br.pucpr.ed.recursao;

import java.io.File;

public class FileUtils {
    public static long usoEmDisco(File file){
        long total = file.length();
        if(file.isDirectory()){ //Caso recursivo
            File[] filhos = file.listFiles();
            for(File filho : filhos){
                total += usoEmDisco(filho);
            }
        }
        System.out.printf("%6d\t%s\n", total, file.getName());
        return total;
    }
}
