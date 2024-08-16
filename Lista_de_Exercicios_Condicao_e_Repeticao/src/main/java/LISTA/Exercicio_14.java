/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio_14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int num_s = random.nextInt(100);

        System.out.println("Vamos jogar Par ou Ímpar! Escolha [P] para Par ou [I] para Ímpar:");
        String escolha = ler.nextLine();

        System.out.println("Escolha um número inteiro:");
        int num_e = ler.nextInt();

        System.out.println("A soma do seu número e o número sorteado é" + (num_s + num_e));

        int resultado = (num_s + num_e) % 2;

        if (resultado == 0 && escolha.equalsIgnoreCase("P")) {
            System.out.println("A soma é par. Você venceu!");

        } else if (resultado != 0 && escolha.equalsIgnoreCase("P")) {
            System.out.println("Você perdeu. A soma não é Par como você escolheu.");

        } else if (resultado != 0 && escolha.equalsIgnoreCase("I")) {
            System.out.println("A soma é Impar. Você venceu!");

        } else if (resultado == 0 && escolha.equalsIgnoreCase("I")) {
            System.out.println("Você perdeu. A soma não é Impar como você escolheu.");
        }
    }
}

