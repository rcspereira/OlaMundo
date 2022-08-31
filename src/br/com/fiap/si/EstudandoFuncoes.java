package br.com.fiap.si;

import java.util.Scanner;

public class EstudandoFuncoes {

    public static int soma(int valor1, int valor2) {
        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }

    public static void main(String[] args){
        int v1, v2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite um valor para a soma:");
        v1 = sc.nextInt();
        System.out.println("Por favor, digite outro valor para a soma:");
        v2 = sc.nextInt();
        System.out.println("O resultado da soma foi " + soma(v1, v2));
    }
}
