package com.example.android.taller2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void zapatillaNikeHombre(){
        assertEquals(120000,Metodos.calcular(0,0,0,1),0);
    }
    @Test
    public void zapatillaAddidasHombre(){
        assertEquals(140000,Metodos.calcular(0,0,1,1),0);
    }
    @Test
    public void zapatillaPumaHombre(){
        assertEquals(130000,Metodos.calcular(0,0,2,1),0);
    }
    @Test
    public void clasicoNikeHombre(){
        assertEquals(50000,Metodos.calcular(0,1,0,1),0);
    }
    @Test
    public void clasicoAddidasHombre(){
        assertEquals(80000,Metodos.calcular(0,1,1,1),0);
    }
    @Test
    public void clasicoPumaHombre(){
        assertEquals(100000,Metodos.calcular(0,1,2,1),0);
    }



    @Test
    public void zapatillaNikeMujer(){
        assertEquals(100000,Metodos.calcular(1,0,0,1),0);
    }
    @Test
    public void zapatillaAddidasMujer(){
        assertEquals(130000,Metodos.calcular(1,0,1,1),0);
    }
    @Test
    public void zapatillaPumaMujer(){
        assertEquals(110000,Metodos.calcular(1,0,2,1),0);
    }
    @Test
    public void clasicoNikeMujer(){
        assertEquals(60000,Metodos.calcular(1,1,0,1),0);
    }
    @Test
    public void clasicoAddidasMujer(){
        assertEquals(70000,Metodos.calcular(1,1,1,1),0);
    }
    @Test
    public void clasicoPumaMujer(){
        assertEquals(120000,Metodos.calcular(1,1,2,1),0);
    }
}