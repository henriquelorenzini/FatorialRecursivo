package com.catolica;

public class Fatorial {
    public static int fatorial(int valor){
        if (valor == 0 || valor == 1)
            return 1;
        return valor * fatorial (valor - 1);
    }
}
