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
public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor, insira a base:");
        float base = ler.nextFloat();
        
        System.out.println("Agora, insira o expoente:");
        float expoente = ler.nextFloat();
        
        System.out.println("\nCalculando "+base+" elevado a "+expoente+"...\n");
        
        float resultado = (float) Math.pow(base,expoente);
        System.out.println("O resultado de "+base+" elevado a "+expoente+" é "+resultado+".");
    }
}
