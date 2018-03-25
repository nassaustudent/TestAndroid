package com.hazmirulafiq.androidsqlitedatabasedemo;

/**
 * Created by ELI on 25/03/2018.
 */

public class Calcular {
int resultado;
String naopode = "Calculo nao pode ser feito";

public int somar (int numero1, int numero2) {
    resultado = numero1 +numero2;
    return resultado;
}


    public int subtrair (int numero1, int numero2) {
        resultado = numero1 -numero2;
        return resultado;
    }


    public int dividir (int numero1, int numero2) {
        if (numero2 != 0) {
            resultado = numero1 / numero1;
            return resultado;
        }else
            return 0;
    }

    public int multiplicar (int numero1, int numero2) {
        resultado = numero1 * numero2;
        return resultado;
    }





    public void fecharConexao(){

    }

}
