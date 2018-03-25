package com.hazmirulafiq.androidsqlitedatabasedemo;

/**
 * Created by ELI on 25/03/2018.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1SomaOK {

    private Calcular tentarasoma;

    @Before
    public void setUp() throws Exception {
        tentarasoma = new Calcular();
    }

    @After
    public void tearDown() throws Exception {
        tentarasoma.fecharConexao();
    }

    @Test
    public void testarresultadodasoma() throws Exception {
        int primeiro = 37;
        int segundo = 37;
        int output;
        int expected = 74;
        double delta = 1;

        output = tentarasoma.somar(primeiro, segundo);
        assertEquals(expected, output);

    }

}
