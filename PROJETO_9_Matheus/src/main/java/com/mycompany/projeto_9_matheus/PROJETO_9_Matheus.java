/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_matheus;

import java.util.Random;

/**
 *
 * @author mathe
 */
public class PROJETO_9_Matheus{

    public static void main(String[] args){
        int Tempo_Verde = 30;
        int Tempo_Amarelo = 5;
        int Tempo_Vermelho = 45;
        int Ciclo_Total = Tempo_Verde + Tempo_Amarelo + Tempo_Vermelho;
        int Tempo_Simu = 600;
        int Limite_Cong = 10;

        Random random = new Random();

        int carrosNaFila1 = 0, carrosPassaram1 = 0, tempoTotalEspera1 = 0, carrosCongestionados1 = 0;
        int carrosNaFila2 = 0, carrosPassaram2 = 0, tempoTotalEspera2 = 0, carrosCongestionados2 = 0;
        int carrosNaFila3 = 0, carrosPassaram3 = 0, tempoTotalEspera3 = 0, carrosCongestionados3 = 0;

        int segundoAtual1 = 0, segundoAtual2 = 0, segundoAtual3 = 0;

        for (int segundo = 1; segundo <= Tempo_Simu; segundo++) {
            segundoAtual1 = (segundoAtual1 + 1) % Ciclo_Total;
            segundoAtual2 = (segundoAtual2 + 1) % Ciclo_Total;
            segundoAtual3 = (segundoAtual3 + 1) % Ciclo_Total;

            String estadoSemaforo1 = (segundoAtual1 < Tempo_Verde) ? "Verde" : (segundoAtual1 < Tempo_Verde + Tempo_Amarelo) ? "Amarelo" : "Vermelho";
            String estadoSemaforo2 = (segundoAtual2 < Tempo_Verde) ? "Verde" : (segundoAtual2 < Tempo_Verde + Tempo_Amarelo) ? "Amarelo" : "Vermelho";
            String estadoSemaforo3 = (segundoAtual3 < Tempo_Verde) ? "Verde" : (segundoAtual3 < Tempo_Verde + Tempo_Amarelo) ? "Amarelo" : "Vermelho";

            if (segundo % 15 == 0) {
                int carrosChegando1 = random.nextInt(5) + 1;
                int carrosChegando2 = random.nextInt(5) + 1;
                int carrosChegando3 = random.nextInt(5) + 1;

                if (carrosNaFila1 + carrosChegando1 <= Limite_Cong) {
                    carrosNaFila1 += carrosChegando1;
                } else {
                    carrosCongestionados1 += carrosChegando1;
                }

                if (carrosNaFila2 + carrosChegando2 <= Limite_Cong) {
                    carrosNaFila2 += carrosChegando2;
                } else {
                    carrosCongestionados2 += carrosChegando2;
                }

                if (carrosNaFila3 + carrosChegando3 <= Limite_Cong) {
                    carrosNaFila3 += carrosChegando3;
                } else {
                    carrosCongestionados3 += carrosChegando3;
                }
            }

            while (estadoSemaforo1.equals("Verde") && carrosNaFila1 > 0) {
                carrosNaFila1--;
                carrosPassaram1++;
                tempoTotalEspera1 += carrosNaFila1;
            }

            while (estadoSemaforo2.equals("Verde") && carrosNaFila2 > 0) {
                carrosNaFila2--;
                carrosPassaram2++;
                tempoTotalEspera2 += carrosNaFila2;
            }

            while (estadoSemaforo3.equals("Verde") && carrosNaFila3 > 0) {
                carrosNaFila3--;
                carrosPassaram3++;
                tempoTotalEspera3 += carrosNaFila3;
            }

            System.out.println("Segundo " + segundo + ":");
            System.out.println("  Intersecao 1 - Semaforo: " + estadoSemaforo1 + ", Carros na fila: " + carrosNaFila1);
            System.out.println("  Intersecao 2 - Semaforo: " + estadoSemaforo2 + ", Carros na fila: " + carrosNaFila2);
            System.out.println("  Intersecao 3 - Semaforo: " + estadoSemaforo3 + ", Carros na fila: " + carrosNaFila3);
        }

        System.out.println("Relatório Final:");

        double tempoMedioEspera1 = (carrosPassaram1 > 0) ? (double) tempoTotalEspera1 / carrosPassaram1 : 0;
        System.out.println("Intersecao 1:");
        System.out.println("  Total de carros que passaram: " + carrosPassaram1);
        System.out.println("  Tempo medio de espera: " + tempoMedioEspera1 + " segundos");
        System.out.println("  Carros congestionados: " + carrosCongestionados1);

        double tempoMedioEspera2 = (carrosPassaram2 > 0) ? (double) tempoTotalEspera2 / carrosPassaram2 : 0;
        System.out.println("Intersecao 2:");
        System.out.println("  Total de carros que passaram: " + carrosPassaram2);
        System.out.println("  Tempo medio de espera: " + tempoMedioEspera2 + " segundos");
        System.out.println("  Carros congestionados: " + carrosCongestionados2);

        double tempoMedioEspera3 = (carrosPassaram3 > 0) ? (double) tempoTotalEspera3 / carrosPassaram3 : 0;
        System.out.println("Intersecao 3:");
        System.out.println("  Total de carros que passaram: " + carrosPassaram3);
        System.out.println("  Tempo medio de espera: " + tempoMedioEspera3 + " segundos");
        System.out.println("  Carros congestionados: " + carrosCongestionados3);
    }
}