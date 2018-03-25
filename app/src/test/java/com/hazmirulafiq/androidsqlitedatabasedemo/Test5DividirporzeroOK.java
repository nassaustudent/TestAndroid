package com.hazmirulafiq.androidsqlitedatabasedemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ELI on 25/03/2018.
 */

public class Test5DividirporzeroOK {

    private Calcular dividir;

    @Before
    public void setUp() throws Exception {
        dividir = new Calcular();
    }

    @After
    public void tearDown() throws Exception {
        dividir.fecharConexao();
    }

    @Test
    public void testarresultadodadivisao() throws Exception {
        int primeiro = 37;
        int segundo = 0;
        int output;
        int expected = 0;



        output = dividir.dividir(primeiro, segundo);
        assertEquals(expected, output);

    }


}
