/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_matheus;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class PROJETO_7_Matheus {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
   
        System.out.println("BEM-VINDO");
        
        System.out.println("QUANTOS KG(QUILOGRAMAS) VOCÊ PESA?");
            float peso = ler.nextFloat();
            
        System.out.println("QUAL É SUA ALTURA(EM METROS)?");
            float altura = ler.nextFloat();
        
        float imc = peso/(altura*altura);
        
        if(imc <= 18.8){
            System.out.println("Abaixo do peso normal");
        }else if(imc >= 18.5 || imc <= 24.9){
            System.out.println("Peso normal");
        }else if(imc >= 25.0 || imc <= 29.9){
            System.out.println("Excesso de Peso");
        }else if(imc >= 30.0 || imc <= 34.9){
            System.out.println("Obesidade Classe I");
        }else if(imc >= 35.0 || imc <= 39.9){
            System.out.println("Obesidade Classe II");
        }else{
            System.out.println("Obesidade Classe III");
        }
            
    }
}
