/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(100);
        int acertar = 1000;

        System.out.println("O computador escolheu um número entre 1 e 100. Tente adivinhar!:");
        while (numero != acertar) {
            acertar = ler.nextInt();

            if (acertar != numero) {
                System.out.println("Errou Tente Novamente:");
                if (numero > acertar) {
                    System.out.println("O número é maior que " + acertar);
                } else {
                    System.out.println("O número é menor que " + acertar);
                }
            } else {
                System.out.println("Parabens Você acertou o numero");
            }
        }
    }
}
