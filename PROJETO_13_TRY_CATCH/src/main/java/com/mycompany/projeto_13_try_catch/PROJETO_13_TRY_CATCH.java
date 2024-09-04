/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_13_try_catch;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class PROJETO_13_TRY_CATCH {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for (;;) {
            System.out.println("Digite o tamanho do vetor:");
            int quantidade = ler.nextInt();
            float num[] = new float[quantidade + 1];

            System.out.println("Digite os numero do vetor:");

            for (int i = 1; i <= (quantidade); i++) {
                System.out.print("Numero " + i + ":");
                num[i] = ler.nextFloat();
            }

            System.out.println("Escolha uma operação matemática:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("Digite o número correspondente à operação desejada: ");
            int operacao = ler.nextInt();

            System.out.println("NUMEROS NO VETOR:");

            for (int i = 1; i <= (quantidade); i++) {
                System.out.println("Indice: " + i);
                System.out.println("Valor: " + num[i]);
                System.out.println("---------------");
            }

            System.out.println("Digite o primeiro índice para a operação: ");
            int valorum = ler.nextInt();
            System.out.println("Digite o segundo índice para a operação: ");
            int valordois = ler.nextInt();
            float resultado = 0f;

            switch (operacao) {
                case 1:
                    resultado = valorum + valordois;
                    break;
                case 2:
                    resultado = valorum - valordois;
                    break;
                case 3:
                    resultado = valorum * valordois;
                    break;
                case 4:
                    resultado = valorum / valordois;
                    break;
            }
            System.out.println("Resultado da operação entre elementos nos índices " + valorum + " e " + valordois + ": " + resultado);
            System.out.println("Deseja Realizar outra operação?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");
            int confirm = ler.nextInt();
            
            if(confirm == 2){
                System.out.println("Muito Obrigado!");
                break;
            }else{
                for(int i = 0; i <= 17;i++){
                    System.out.println("\n");
                }
            }            
        }    
    }
}
