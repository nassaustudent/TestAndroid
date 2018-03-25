package com.hazmirulafiq.androidsqlitedatabasedemo;

/**
 * Created by ELI on 25/03/2018.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test2SubtracaoOK {

    private Calcular tentarasubtrair;

    @Before
    public void setUp() throws Exception {
        tentarasubtrair = new Calcular();
    }

    @After
    public void tearDown() throws Exception {
        tentarasubtrair.fecharConexao();
    }

    @Test
    public void testarresultadodasubtracao() throws Exception {
        int primeiro = 37;
        int segundo = 37;
        int output;
        int expected = 0;
        double delta = 1;

        output = tentarasubtrair.subtrair(primeiro, segundo);
        assertEquals(expected, output);

    }

}
