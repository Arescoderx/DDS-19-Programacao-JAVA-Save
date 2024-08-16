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
public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        System.out.println("Por favor, insira um número inteiro para calcular seu fatorial:");
        int num = ler.nextInt();
        
        int fatorial = 1;
        
        for(int n = 1; n <= 10; n++){   
            fatorial *= n;
        }
        
        System.out.println("O fatorial de "+num+" é "+fatorial+".");
    }
}
