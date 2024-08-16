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
public class Exercicio_18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Tipo de Veículo        Valor do Pedágio (R$)");
        System.out.println("Carro                  9,00");
        System.out.println("Moto                   4,50");
        System.out.println("Caminhão              13,00");

        System.out.println("Por favor, insira o tipo de veículo:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Caminhão");
        int veiculo = ler.nextInt();
        
        float valorPedagio = 0;
        
        if (veiculo == 1) {
            valorPedagio = 9;

        } else if (veiculo == 2) {
            valorPedagio = 4.5f;

        } else if (veiculo == 3) {
            valorPedagio = 13;

        } else {
            System.out.println("Tipo de veículo inválido.");
        }
        
        System.out.println("O valor do pedágio para o veículo selecionado é: "+valorPedagio);
    }
}
