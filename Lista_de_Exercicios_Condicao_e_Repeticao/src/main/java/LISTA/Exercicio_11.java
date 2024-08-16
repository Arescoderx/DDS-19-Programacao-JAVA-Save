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
public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float conver;
        
        System.out.println("Digite 'C' para converter de Celsius para Fahrenheit.");
        System.out.println("Digite 'F' para converter de Fahrenheit para Celsius.");
        String tipo = ler.nextLine();
        
        System.out.println("Por favor, insira a temperatura a ser convertida:");
        float temp = ler.nextFloat();
        
        if(tipo.equalsIgnoreCase("F")) {
            conver = (float) ((temp - 32) / 1.8);
            System.out.println("Convertendo "+temp+"°F para Celsius...");
            System.out.println("A temperatura em Celsius é "+conver+"°C.");
            
        }else if(tipo.equalsIgnoreCase("C")){
            conver = (float) ((temp * 1.8) + 32);
            System.out.println("Convertendo "+temp+"°C para Fahrenheit...");
            System.out.println("A temperatura em Fahrenheit é "+conver+"°F.");
        }else{
            System.out.println("Opção inválida. Digite 'C' para Celsius ou 'F' para Fahrenheit.");
        }
    }
}
