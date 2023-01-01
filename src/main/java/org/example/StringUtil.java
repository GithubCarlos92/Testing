package org.example;

public class StringUtil {
    public static String repetir(String str, int times ){
        if(times < 0) {
            throw new IllegalArgumentException("Negative times not allowed");
        }

        String resultado = "";
        for (int i = 0; i < times; i++) {
            resultado += str;
        }
        return resultado;
    }
}
