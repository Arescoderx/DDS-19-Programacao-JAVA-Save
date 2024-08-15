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
public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma operação: \n[1] Adição \n[2] Subtração \n[3] Multiplicação \n[4] Divisão");
        int operacao = ler.nextInt();

        System.out.println("Insira o primeiro número:");
        float valor_um = ler.nextFloat();

        System.out.println("Insira o segundo número:");
        float valor_dois = ler.nextFloat();

        float resultado;

        if (operacao == 1) {
            resultado = valor_um + valor_dois;
            System.out.println("Você escolheu adição. O resultado é " + resultado);

        } else if (operacao == 2) {
            resultado = valor_um - valor_dois;
            System.out.println("Você escolheu subtração. O resultado é " + resultado);

        } else if (operacao == 3) {
            resultado = valor_um * valor_dois;
            System.out.println("Você escolheu multiplicação. O resultado é " + resultado);

        } else if (operacao == 4) {
            resultado = valor_um / valor_dois;
            System.out.println("Você escolheu divisão. O resultado é " + resultado);

        } else {
            System.out.println("Opção inválida! Por favor, escolha uma operação válida na próxima vez.");
        }
    }
}
