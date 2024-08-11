/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_matheus;

/**
 *
 * @author mathe
 */
public class PROJETO_9_Matheus{

    public static void main(String[] args){

        final int TEMPO_VERDE = 30;
        final int TEMPO_AMARELO = 5;
        final int TEMPO_VERMELHO = 45;
        final int CICLO_TOTAL = TEMPO_VERDE + TEMPO_AMARELO + TEMPO_VERMELHO;
        final int TEMPO_SIMULACAO = 600;
        final int LIMITE_CONGESTIONAMENTO = 10;

        int carrosNaFila1 = 0;
        int carrosPassaram1 = 0;
        int tempoTotalEspera1 = 0;
        int carrosCongestionados1 = 0;
        int segundoAtual1 = 0;

        int carrosNaFila2 = 0;
        int carrosPassaram2 = 0;
        int tempoTotalEspera2 = 0;
        int carrosCongestionados2 = 0;
        int segundoAtual2 = 0;

        int carrosNaFila3 = 0;
        int carrosPassaram3 = 0;
        int tempoTotalEspera3 = 0;
        int carrosCongestionados3 = 0;
        int segundoAtual3 = 0;

        for (int segundo = 1; segundo <= TEMPO_SIMULACAO; segundo++) {
            segundoAtual1 = (segundoAtual1 + 1) % CICLO_TOTAL;
            segundoAtual2 = (segundoAtual2 + 1) % CICLO_TOTAL;
            segundoAtual3 = (segundoAtual3 + 1) % CICLO_TOTAL;

            String estadoSemaforo1 = (segundoAtual1 < TEMPO_VERDE) ? "Verde" : (segundoAtual1 < TEMPO_VERDE + TEMPO_AMARELO) ? "Amarelo" : "Vermelho";
            String estadoSemaforo2 = (segundoAtual2 < TEMPO_VERDE) ? "Verde" : (segundoAtual2 < TEMPO_VERDE + TEMPO_AMARELO) ? "Amarelo" : "Vermelho";
            String estadoSemaforo3 = (segundoAtual3 < TEMPO_VERDE) ? "Verde" : (segundoAtual3 < TEMPO_VERDE + TEMPO_AMARELO) ? "Amarelo" : "Vermelho";

            if (segundo % 15 == 0) {
                if (carrosNaFila1 < LIMITE_CONGESTIONAMENTO) {
                    carrosNaFila1++;
                } else {
                    carrosCongestionados1++;
                }

                if (carrosNaFila2 < LIMITE_CONGESTIONAMENTO) {
                    carrosNaFila2++;
                } else {
                    carrosCongestionados2++;
                }

                if (carrosNaFila3 < LIMITE_CONGESTIONAMENTO) {
                    carrosNaFila3++;
                } else {
                    carrosCongestionados3++;
                }
            }

            while (estadoSemaforo1.equals("Verde") && carrosNaFila1 > 0) {
                carrosNaFila1--;
                carrosPassaram1++;
                tempoTotalEspera1 += carrosNaFila1;
                break;
            }

            while (estadoSemaforo2.equals("Verde") && carrosNaFila2 > 0) {
                carrosNaFila2--;
                carrosPassaram2++;
                tempoTotalEspera2 += carrosNaFila2;
                break;
            }

            while (estadoSemaforo3.equals("Verde") && carrosNaFila3 > 0) {
                carrosNaFila3--;
                carrosPassaram3++;
                tempoTotalEspera3 += carrosNaFila3;
                break;
            }

            System.out.println("Segundo " + segundo + ":");
            System.out.println("  Intersecao 1 - Semaforo: " + estadoSemaforo1 + ", Carros na fila: " + carrosNaFila1);
            System.out.println("  Intersecao 2 - Semaforo: " + estadoSemaforo2 + ", Carros na fila: " + carrosNaFila2);
            System.out.println("  Intersecao 3 - Semaforo: " + estadoSemaforo3 + ", Carros na fila: " + carrosNaFila3);
        }

        System.out.println("Relatorio Final:");

        double tempoMedioEspera1 = (carrosPassaram1 > 0) ? (double) tempoTotalEspera1 / carrosPassaram1 : 0;
        System.out.println("Intersecao 1:");
        System.out.println("  Total de carros que passaram: " + carrosPassaram1);
        System.out.println("  Tempo medio de espera: " + tempoMedioEspera1 + " segundos");
        System.out.println("  Carros presos no congestionamento: " + carrosCongestionados1);

        double tempoMedioEspera2 = (carrosPassaram2 > 0) ? (double) tempoTotalEspera2 / carrosPassaram2 : 0;
        System.out.println("Intersecao 2:");
        System.out.println("  Total de carros que passaram: " + carrosPassaram2);
        System.out.println("  Tempo medio de espera: " + tempoMedioEspera2 + " segundos");
        System.out.println("  Carros presos no congestionamento: " + carrosCongestionados2);

        double tempoMedioEspera3 = (carrosPassaram3 > 0) ? (double) tempoTotalEspera3 / carrosPassaram3 : 0;
        System.out.println("Intersecao 3:");
        System.out.println("  Total de carros que passaram: " + carrosPassaram3);
        System.out.println("  Tempo medio de espera: " + tempoMedioEspera3 + " segundos");
        System.out.println("  Carros presos no congestionamento: " + carrosCongestionados3);
    }
}