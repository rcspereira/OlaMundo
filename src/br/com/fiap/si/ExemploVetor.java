package br.com.fiap.si;

import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        int[] tempos = new int[10];

        int posicaoMenor = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite cada um dos tempos:");
        for (int i = 0; i < 10; i++) {
            tempos[i] = sc.nextInt();

            if (tempos[i] < tempos[posicaoMenor]) {
                posicaoMenor = i;
            }
        }
        sc.close();

        System.out.println("O menor tempo lido foi " + tempos[posicaoMenor] + " segundos");
    }
}