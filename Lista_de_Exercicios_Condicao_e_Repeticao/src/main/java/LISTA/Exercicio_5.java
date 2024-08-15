/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor:");
        float valor = ler.nextInt();

        int tabu;

        for (int i = 1; i <= 10; i++) {
            tabu = (int) (valor * i);
            System.out.println(valor + " X " + i + " = " + tabu);
        }
    }
}
