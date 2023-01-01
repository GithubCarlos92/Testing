package org.example;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
        @Test
        public void ultimoTestFinAño_string_three(){
            Assert.assertEquals("carloscarloscarlos",StringUtil.repetir("carlos", 3));
        }
        @Test
        public void ultimoTestFinAño_string_two(){
        Assert.assertEquals("carloscarlos",StringUtil.repetir("carlos", 2));
        }
        @Test
        public void ultimoTestFinAño_zero_times(){

            Assert.assertEquals("",StringUtil.repetir("carlos", 0));
        }
        @Test(expected = IllegalArgumentException.class)
        public void ultimoTestFinAño_string_negative_times(){

            StringUtil.repetir("carlos", -1);
        }

    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to " + expected);
        }
    }

}