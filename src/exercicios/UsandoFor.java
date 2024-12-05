package exercicios;

import java.util.Scanner;

public class UsandoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        System.out.println("\tBem-Vindo (a) ao nosso esibidor de matrizes.\n"
                + "\tVamos pedir abaixo os valores que você deseja preenxer na matriz.");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { // Corrigido: usar matriz[i].length
                System.out.println("\tDigite o valor referente a posição [" + (i + 1) + "][" + (j + 1) + "] da matriz:");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\tA sua matriz ficou assim:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
                System.out.println();
            }
        sc.close();
    }
}