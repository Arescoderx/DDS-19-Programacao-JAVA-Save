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
        int tam = 0;
        float resultados[] = new float[100];
        
        for (;;) {
            try {
                System.out.println("Digite o tamanho do vetor:");
                int quantidade = Integer.parseInt(ler.nextLine());
                float num[] = new float[quantidade];
                //PERGUNTA QUE VAI DETERMINAR O TAMANH0 DO VETOR

                System.out.println("Digite os numero do vetor:");

                for (int i = 0; i <= (quantidade - 1); i++) {
                    System.out.print("Numero " + (i + 1) + ":");
                    num[i] = Integer.parseInt(ler.nextLine());
                }
                //PERGUNTA QUE VAI DETERMINAR O NUMEROS QUE ESTÃO EM CADA INDICE

                System.out.println("Escolha uma operação matemática:");
                System.out.println("1. Adição");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.println("Digite o número correspondente à operação desejada: ");
                int operacao = Integer.parseInt(ler.nextLine());
                //PERGUNTA PRA SABER QUAL TIPO DE OPERAÇÃO ELE VAI QUERER USAR

                System.out.println("NUMEROS NO VETOR:");

                for (int i = 0; i <= (quantidade - 1); i++) {
                    System.out.println("Indice: " + (i + 1));
                    System.out.println("Valor: " + num[i]);
                    System.out.println("---------------");
                }
                //MOSTRAR O INDICE E O VALOR QUE ESTÁ ARMAZENADO NELE

                System.out.println("Digite o primeiro índice para a operação: ");
                int valorum = Integer.parseInt(ler.nextLine());
                System.out.println("Digite o segundo índice para a operação: ");
                int valordois = Integer.parseInt(ler.nextLine());
                float resultado = 0f;
                //PERGUNTA PRA SABER QUAL O NUMERO ELES QUEREM A PARTIR DO INDICE

                switch (operacao) {
                    case 1 ->
                        resultado = num[valorum-1] + num[valordois-1];
                    case 2 ->
                        resultado = num[valorum-1] - num[valordois-1];
                    case 3 ->
                        resultado = num[valorum-1] * num[valordois-1];
                    case 4 ->
                        resultado = num[valorum-1] / num[valordois-1];
                }
                //UM ESCOLHA CASO PARA DETERMINAR A OPERAÇÃO

                System.out.println("Resultado da operação entre elementos nos índices " + valorum + " e " + valordois + ": " + resultado);
                //RESULTADO DA OPERAÇÃO INFORMANDO OS INDECES

                resultados[tam] = resultado;
                tam++;
                //GRAVAR OS RESULTADOS

                System.out.println("Deseja Realizar outra operação?");
                System.out.println("1 - SIM");
                System.out.println("2 - NÃO");
                int confirm = Integer.parseInt(ler.nextLine());
                //PERGUNTA PRA SABER SE ELE DESEJA REALIZAR OUTRA OPERAÇÃO

                if (confirm == 2) {
                    System.out.println("Muito Obrigado!");
                    System.out.println("DESEJA REVER TODOS SEUS RESULTADOS?");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");
                    int histo = Integer.parseInt(ler.nextLine());
                    if (histo == 1) {
                        System.out.println("AQUI ESTÁ SEU HISTORICO DE RESULTADOS");
                        for (int i = 0; i < tam; i++) {
                            System.out.println("RESULTADO " + (i + 1) + ": " + resultado);
                        }
                    }
                    //EXIBIR RESULTADOS QUE ESTÃO NO VETOR ARMAZENADOS
                    break;
                } else {
                    for (int i = 0; i <= 17; i++) {
                        System.out.println("\n");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("ERRO POR FAVOR INSIRA UM NUMERO, PROBLEMA DO ERRO: " + e.getMessage());
            } catch (NegativeArraySizeException e) {
                System.out.println("ERRO VOCÊ TENTOU CRIAR UM VETOR NEGATIVO, PROBLEMA DO ERRO: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERRO VOCÊ TENTOU ACESSAR UM NUMERO MAIOR QUE O VETOR AGUENTA, PROBLEMA DO ERRO: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("ERRO VOCÊ TENTOU FAZER UMA DIVISÃO COM 0, PROBLEMA DO ERRO: " + e.getMessage());
            }
        }
    }
}
