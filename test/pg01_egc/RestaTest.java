package pg01_egc;

import org.junit.Test;

import pg01_egc.Resta;

import static org.junit.Assert.*;

public class AppTest{
    
    @Test
    public void Test(){

        System.out.println("Test del método para restar.");

        assertEquals(5, Resta.resta(3,0)); //introducimos un conflicto
    }
}

