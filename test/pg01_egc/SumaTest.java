package pg01_egc;

import org.junit.Test;

import pg01_egc.Suma;

import static org.junit.Assert.*;

public class SumaTest{
    
    @Test
    public void Test(){

        System.out.println("Test del método para sumar.");

        assertEquals(5, Suma.suma(5,0));
    }
}
