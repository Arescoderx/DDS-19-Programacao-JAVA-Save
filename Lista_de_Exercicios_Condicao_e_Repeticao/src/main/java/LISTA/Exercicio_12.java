/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int voto_um = 0;
        int voto_dois = 0;
        int voto_tres = 0;

        OUTER:
        for (int i = 1; i <= 2;) {
            System.out.println("Bem-vindo ao sistema de votação. Você pode votar em um dos 3 candidatos.");
            System.out.println("Digite o número do candidato para o qual você deseja votar [1, 2 ou 3]:");
            System.out.println("Digite [4] caso tenho acabado os eleitores");
            int voto = ler.nextInt();

            switch (voto) {
                case 1 -> {
                    System.out.println("Registrando seu voto...");
                    System.out.println("Você votou no candidato 1");
                    voto_um++;
                }
                case 2 -> {
                    System.out.println("Registrando seu voto...");
                    System.out.println("Você votou no candidato 2");
                    voto_dois++;
                }
                case 3 -> {
                    System.out.println("Registrando seu voto...");
                    System.out.println("Você votou no candidato 3");
                    voto_tres++;
                }
                case 4 -> {
                    break OUTER;
                }
                default ->
                    System.out.println("Você não votou em ninguem");
            }
        }
        System.out.println("Total de votos para o candidato 1: " + voto_um);
        System.out.println("Total de votos para o candidato 2: " + voto_dois);
        System.out.println("Total de votos para o candidato 3: " + voto_tres);

        if (voto_um > voto_dois && voto_um > voto_tres) {
            System.out.println("\nO vencedor é o candidato 1 com " + voto_um + " votos.");
        } else if (voto_dois > voto_um && voto_dois > voto_tres) {
            System.out.println("\nO vencedor é o candidato 2 com " + voto_dois + " votos.");
        } else if (voto_tres > voto_um && voto_tres > voto_dois) {
            System.out.println("\nO vencedor é o candidato 3 com " + voto_tres + " votos.");
        } else{
            System.out.println("\nnHouve um empate.");
        }
    }
}
    