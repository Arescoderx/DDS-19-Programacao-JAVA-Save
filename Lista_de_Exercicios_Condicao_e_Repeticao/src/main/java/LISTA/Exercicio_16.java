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
public class Exercicio_16 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String contrario = "";

        System.out.println("Digite uma palavra para verificar se é um palíndromo");
        String nome = ent.nextLine();

        for (int i = (nome.length() - 1); i >= 0; i--) {
            contrario = contrario + nome.charAt(i);
        }

        if (contrario.toLowerCase().equals(nome.toLowerCase())) {
            System.out.println("Essa palavra é palíndromo");
        } else {
            System.out.println("Essa palavra não é palíndromo");
        }
    }
}
