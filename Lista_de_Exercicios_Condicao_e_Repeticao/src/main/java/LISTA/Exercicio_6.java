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
public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("QUANTOS KG(QUILOGRAMAS) VOCÊ PESA?");
        float peso = ler.nextFloat();

        System.out.println("QUAL É SUA ALTURA(EM METROS)?");
        float altura = ler.nextFloat();
        
        float imc = peso/(altura*altura);
        
        System.out.println("Você se encontra no:");
        if(imc <= 18.8){
            System.out.println("Baixo Peso");
        }else if(imc >= 18.5 || imc <= 24.9){
            System.out.println("Peso Normal");
        }else if(imc >= 24.0 || imc <= 29.9){
            System.out.println("Sobrepeso");
        }else{
            System.out.println("Obesidade");
        }
        
    }
}
