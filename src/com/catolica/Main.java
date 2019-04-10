package com.catolica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Escolha um número para calcular o fatorial: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        Fatorial fat = new Fatorial();
        System.out.println("O fatorial de " + numero + " é: " + fat.fatorial(numero));


    }
}
