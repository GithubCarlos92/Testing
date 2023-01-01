package org.example;

public class StringUtilTest {
    public static void main(String[] args) {

        assertEquals(StringUtil.repetir("carlos", 3), "carloscarloscarlos");
        assertEquals(StringUtil.repetir("carlos", 2),"carloscarlos");

    }

    //Test Unitarios
    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to " + expected);
        }
    }

}