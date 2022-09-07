package br.com.fiap.si;

import java.util.Scanner;

public class EstudandoFuncoes {

    public static int soma(int valor1, int valor2) {
        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }

    public static int subtracao(int valor1, int valor2) {
        int resultado;
        resultado = valor1 - valor2;
        return resultado;
    }

    public static int multiplicacao(int valor1, int valor2) {
        int resultado;
        resultado = valor1 * valor2;
        return resultado;
    }

    public static float divisao(int valor1, int valor2) {
        float resultado;
        resultado = (float)valor1 / valor2;
        return resultado;
    }

    public static boolean divisorValido(int divisor) {
        if (divisor == 0) {
            return false;
        }
        return true;
    }

    public static void exibeOpcoes(){
        System.out.println("Por favor, digite a opção desejada");
        System.out.println("1 - Somar os dois valores");
        System.out.println("2 - Subtrair os dois valores");
        System.out.println("3 - Multiplicar os dois valores");
        System.out.println("4 - Dividir os dois valores");
    }

    public static void chamaFuncaoCorreta(int opcao, int v1, int v2) {
        switch (opcao) {
            case 1:
                System.out.println("O resultado da soma foi " + soma(v1, v2));
                break;
            case 2:
                System.out.println("O resultado da subtração foi " + subtracao(v1, v2));
                break;
            case 3:
                System.out.println("O resultado da multiplicação foi " + multiplicacao(v1, v2));
                break;
            case 4:
                if (divisorValido(v2)) {
                    System.out.println("O resultado da divisão foi " + divisao(v1, v2));
                } else {
                    System.out.println("Não é possível dividir por zero");
                }
                break;
            default:
                System.out.println("A Opção escolhida é inválida");
                break;
        }
    }

    public static void main(String[] args){
        int v1, v2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite um valor para o cálculo:");
        v1 = sc.nextInt();
        System.out.println("Por favor, digite outro valor para o cálculo:");
        v2 = sc.nextInt();
        exibeOpcoes();
        int opcao;
        opcao = sc.nextInt();
        chamaFuncaoCorreta(opcao, v1, v2);
    }
}
