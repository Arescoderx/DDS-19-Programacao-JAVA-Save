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
public class Exercicio_20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Por favor, insira o valor da compra:");
        float valor = ler.nextFloat();
        
        System.out.println("Insira o percentual de desconto (em %):");
        float desconto = ler.nextFloat();
        
        System.out.println("Aplicando um desconto de "+desconto+"% sobre o valor de R$"+valor+"...");
        
        float resultado = valor * (desconto/100);
                
        if(desconto >= 0 && desconto <= 100){
            System.out.println("O desconto de R$"+resultado+" foi aplicado com sucesso.");
        }else{
            System.out.println("Percentual de desconto inválido. Por favor, insira um valor entre 0 e 100.");
        }
        
        System.out.println("O valor final da compra com desconto é R$ "+(valor - resultado)+".");
    }
}
