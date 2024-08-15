/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 * 
 */
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Por favor, insira a nota da Primeira disciplina:");
        float nota_um = ler.nextFloat();
        
        System.out.println("Insira a nota da Segunda disciplina:");
        float nota_dois = ler.nextFloat();
        
        System.out.println("Insira a nota da Terceira disciplina:");
        float nota_tres = ler.nextFloat();
        
        float media = (float) (nota_tres + nota_dois + nota_um)/3;
        
        if(media >= 7){
            System.out.print("\nParabens Você foi aprovado com media ");
        }else if((media >= 5) && (media < 7)){
            System.out.print("\nVoce está de recuperação com media ");
        }else{
            System.out.print("\nInfelizmente, você foi reprovado com média ");
        }
        System.out.print(media);
    }
}
