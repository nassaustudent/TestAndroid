package com.hazmirulafiq.androidsqlitedatabasedemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ELI on 25/03/2018.
 */

public class Test4MultiplicacaoOk {

    private Calcular multiplicar;

    @Before
    public void setUp() throws Exception {
        multiplicar = new Calcular();
    }

    @After
    public void tearDown() throws Exception {
        multiplicar.fecharConexao();
    }


    @Test
    public void testarresultadodamultiplicacao() throws Exception {
        int primeiro = 37;
        int segundo = 37;
        int output;
        int expected = 1369;
        double delta = 1;

        output = multiplicar.multiplicar(primeiro, segundo);
        assertEquals(expected, output);

    }



}
