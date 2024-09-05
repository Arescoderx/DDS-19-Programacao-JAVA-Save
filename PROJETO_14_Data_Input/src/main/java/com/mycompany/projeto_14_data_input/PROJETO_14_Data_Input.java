/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_14_data_input;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author m.schmidt
 */
public class PROJETO_14_Data_Input {

    public static void main(String[] args) throws IOException {
        int coluna = 2;
        int linha = 2;
        int[][] num = new int[coluna][linha];
        String s = "";
        DataInputStream dado;

        for (int i = 0; i <= coluna-1; i++) {
            for (int j = 0; j <= linha-1; j++) {
                System.out.println("Escreva os numeros da linha " + (i + 1) + " coluna: " + (j + 1));
                dado = new DataInputStream(System.in);
                s = dado.readLine();
                num[i][j] = Integer.parseInt(s);
            }
        }
        
        for (int i = 0; i <= coluna-1; i++) {
            for (int j = 0; j <= linha-1; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        
    }
}
