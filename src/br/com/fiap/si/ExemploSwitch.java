package br.com.fiap.si;
import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.print("Informe um valor inteiro -> ");
        valor = sc.nextInt(); // onde é realizada a leitura dos dados

        switch (valor) {
            case 1 -> System.out.println("Você informou o valor 1");
            case 2 -> System.out.println("Você informou o valor 2");
            default -> System.out.println("Você informou um valor diferente de 1 e 2");
        }

    sc.close();
    }
}