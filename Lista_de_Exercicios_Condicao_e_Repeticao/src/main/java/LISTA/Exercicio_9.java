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
public class Exercicio_9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, insira um número para verificar se ele é primo:");
        int numero = ler.nextInt();

        int divisores = 0;

        if (numero < 2) {
            System.out.println("Ele não é primo.");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                    break;
                }
            }
            if (divisores == 0) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
    }
}
