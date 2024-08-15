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
public class Exercicio_7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, insira um número inteiro:");
        int numero = ler.nextInt();
        
        int identificacao;
        int par = 0;
        int impar = 0;
        
        for (int x = 1; x <= numero; x++) {
            identificacao = x % 2;
            if (identificacao == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
        }
        System.out.println("Há "+par+" números pares.");
        System.out.println("Há "+impar+" números ímpares.");

    }
}
