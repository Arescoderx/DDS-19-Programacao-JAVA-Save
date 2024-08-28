/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class PROJETO_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] pista_1 = new String[5];
        String[] pista_2 = new String[5];
        
        System.out.println("Escreva o Nome do Jogador 1:");
        String jogador_1 = ler.nextLine();
        
        System.out.println("Escreva o Nome do Seu Filme:");
        String filme_1 = ler.nextLine();
        Jogador_1(pista_1);
        
        System.out.println("Escreva o Nome do Jogador 2:");
        String jogador_2 = ler.nextLine();
        
        System.out.println("Escreva o Nome do Seu Filme:");
        String filme_2 = ler.nextLine();
        Jogador_2(pista_2);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Sua vez Jogador 1:");
            System.out.println("Tente adivinhar qual filme o jogardor 2 escolheu");
            System.out.println("Pista"+(i+1)+" "+pista_1[i]);
        }
    }
    public static void Jogador_1(String[] pista_1) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println(" Informe Suas pistas:");
        for(int i = 0; i < 5; i++){
            System.out.println("Pista "+i+":");
            pista_1[i] = ler.nextLine();
        }
        
    }
    public static void Jogador_2(String[] pista_2) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe Suas pistas:");
        for(int i = 0; i < 5; i++){
            System.out.println("Pista "+i+":");
            pista_2[i] = ler.nextLine();
        }
    }
}
