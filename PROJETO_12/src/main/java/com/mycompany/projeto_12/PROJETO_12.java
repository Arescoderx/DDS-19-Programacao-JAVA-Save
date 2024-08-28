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
        
        System.out.println("Escreva o Nome do Jogador 1:");
        String jogador_1 = ler.nextLine();
        
        System.out.println("Escreva o Nome do Seu Filme:");
        String filme_1 = ler.nextLine();
        Jogador_1(pista_1);
        
        System.out.println("Escreva o Nome do Jogador 2:");
        String jogador_2 = ler.nextLine();
        
        System.out.println("Sua vez "+jogador_2+"!");
        System.out.println("Tente adivinhar qual filme o "+jogador_1+" escolheu");
        
        int i = 0;
        int acerto = 0;
        
        while(acerto == 0){
            
            if(i < 5){
                System.out.println("Pista "+(i+1)+": "+pista_1[i]);
            }else{
                if(i == 5){
                   System.out.println("Acabou as Dicas");
                }
            }
            System.out.println("Tentativa "+(i+1)+":");
            String filme = ler.nextLine();
            if(filme.equals(filme_1)){
                System.out.println("Parabens você acertou o filme do "+jogador_1);
                break;
            }else{
                System.out.println("Você errou!");
            }
            i = i + 1;
        }
    }
    public static void Jogador_1(String[] pista_1) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe Suas pistas:");
        for(int i = 0; i < 5; i++){
            System.out.println("Pista "+(i+1)+":");
            pista_1[i] = ler.nextLine();
        }
    }
}
