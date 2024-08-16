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
public class Exercicio_17 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua frase:");

        String frase = ler.nextLine();

        System.out.println("Sua frase é: " + frase);

        int vog = 0;

        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vog++;
            }
        }
        System.out.println("Na frase " + frase + " temos " + vog + " vogais.");
    }
}
