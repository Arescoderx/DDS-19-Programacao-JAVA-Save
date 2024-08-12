/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_11_matheus;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class PROJETO_11_Matheus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPedidos = 0;
        int tempoTotalProcessamento = 0;
        int tempoDecorrido = 0;
        int maxItens = 0;
        int tempoMaxPedido = 0;
        int idPedido = 1;

        int pedidoNumeroItens;
        int pedidoTempoProcessamento;

        while (true) {
            System.out.print("Digite o número de itens do pedido " + idPedido + " (ou 0 para encerrar): ");
            pedidoNumeroItens = scanner.nextInt();

            if (pedidoNumeroItens == 0) {
                break;
            }

            pedidoTempoProcessamento = pedidoNumeroItens * 2;
            totalPedidos++;
            tempoTotalProcessamento += pedidoTempoProcessamento;

            if (pedidoNumeroItens > maxItens) {
                maxItens = pedidoNumeroItens;
                tempoMaxPedido = pedidoTempoProcessamento;
            }

            System.out.println("Pedido " + idPedido + " registrado com tempo de " + pedidoTempoProcessamento + " minutos.");
            idPedido++;
        }

        for (int i = 1; i < idPedido; i++) {
            System.out.println("Processando o pedido " + i + " com tempo de " + (i * 2) + " minutos.");

            int tempoRestante = i * 2;
            while (tempoRestante > 0) {
                System.out.println("Processando o pedido " + i + " com tempo restante de " + tempoRestante + " minutos.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                tempoRestante--;
                tempoDecorrido++;

                if (tempoDecorrido % 60 == 0 && tempoDecorrido > 0) {
                    System.out.println("Tempo total decorrido: " + (tempoDecorrido / 60) + " minutos.");
                }
            }

            System.out.println("Pedido " + i + " concluído.");
        }

        double tempoMedioProcessamento = totalPedidos > 0 ? (double)tempoTotalProcessamento / totalPedidos : 0;

        System.out.println("\nRelatório Final:");
        System.out.println("Total de pedidos processados: " + totalPedidos);
        System.out.println("Tempo total de processamento: " + tempoTotalProcessamento + " minutos");
        System.out.println("Tempo médio de processamento por pedido: " + tempoMedioProcessamento + " minutos");
        System.out.println("Pedido com o maior número de itens: " + maxItens + " itens");
        System.out.println("Tempo de processamento do pedido com mais itens: " + tempoMaxPedido + " minutos");
    }
}