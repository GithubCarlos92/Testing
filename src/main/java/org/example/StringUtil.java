package org.example;

public class StringUtil {
    public static String repetir(String str, int times ){
        String resultado = "";
        for (int i = 0; i < times; i++) {
            resultado += str;
        }
        return resultado;
    }
}
