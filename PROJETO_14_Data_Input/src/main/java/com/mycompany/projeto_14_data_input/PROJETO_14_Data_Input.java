/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_14_data_input;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author m.schmidt
 */
public class PROJETO_14_Data_Input {

    public static void main(String[] args) throws IOException {
        int coluna = 5;
        int linha = 5;
        int[][] num = new int[coluna][linha];

        for (;;) {
            try {
                EscreverMatriz(coluna, linha, num);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Você não inseriu um numero inteiro, ERRO:" + e.getMessage());
            }
        }
        MostrarMatriz(coluna, linha, num);
        OrganizarMatriz(coluna, linha, num);
        MostrarMatrizOrganizada(coluna, linha, num);
        ExibirSomaMatriz(coluna, linha, num);
        NumeroRepetido(num);
        CalculoDiagonal(coluna, linha, num);
        NumerosPrimos(coluna, linha, num);
    }

    public static int[][] EscreverMatriz(int coluna, int linha, int[][] num) throws IOException {
        String s = "";
        DataInputStream dado;
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.println("Escreva os numeros da linha " + (i + 1) + " coluna: " + (j + 1));
                dado = new DataInputStream(System.in);
                s = dado.readLine();
                num[i][j] = Integer.parseInt(s);
            }
        }
        return num;
    }

    public static void MostrarMatriz(int coluna, int linha, int[][] num) {
        System.out.println("----------MATRIZ ORIGINAL----------");
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------");
    }

    public static int[][] OrganizarMatriz(int coluna, int linha, int[][] num) {

        int[] organizar = new int[coluna * linha];
        int indice = 0;

        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                organizar[indice] = num[i][j];
                indice++;
            }
        }
        Arrays.sort(organizar);

        indice = 0;
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                num[i][j] = organizar[indice];
                indice++;
            }
        }
        return num;
    }

    public static void MostrarMatrizOrganizada(int coluna, int linha, int[][] num) {
        System.out.println("---------MATRIZ ORGANIZADA---------");
        for (int i = 0; i <= coluna - 1; i++) {
            for (int j = 0; j <= linha - 1; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------");
    }

    public static void ExibirSomaMatriz(int coluna, int linha, int[][] num) {
        int soma = 0;
        System.out.println("--------SOMA DE CADA COLUNA--------");
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                soma = num[i][j] + soma;
            }
            System.out.println("A Soma coluna " + (i + 1) + " e igual a: " + soma);
            soma = 0;
        }
        System.out.println("-----------------------------------");
    }

    public static void NumeroRepetido(int[][] num) {
        int[] contagem = new int[1000];

        for (int[] num1 : num) {
            for (int j = 0; j < num1.length; j++) {
                int numero = num1[j];
                contagem[numero]++;
            }
        }
        System.out.println("----------NUMEROS REPITIDO---------");
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > 1) {
                System.out.println("Numero: " + i + " aparece " + contagem[i] + " vezes.");
            }
        }
        System.out.println("-----------------------------------");

    }

    public static void CalculoDiagonal(int coluna, int linha, int[][] num) {
        int somaP = 0;
        int somaS = 0;
        int C = coluna - 1;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (j == i) {
                    somaP = num[i][j] + somaP;
                }
            }
        }

        for (int i = 0; i < coluna; i++) {
            somaS = somaS + num[i][C];
            C--;
        }
        System.out.println("-----------SOMA DIAGONAIS----------");
        System.out.println("Soma Diagonal Principal: " + somaP);
        System.out.println("Soma Diagonal Secundaria: " + somaS);
        System.out.println("-----------------------------------");
    }

    public static void NumerosPrimos(int coluna, int linha, int[][] num) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                int numero = num[i][j];
                if (numero <= 1) {
                    continue;
                }
                int quant = 0;
                for (int cont = 1; cont <= numero; cont++) {
                    if (numero % cont == 0) {
                        quant++;
                    }
                }

                if (quant == 2) {
                    num[i][j] = -1;
                }
            }
        }
        System.out.println("----------MATRIZ PRIMOS----------");
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------");
    }
}
