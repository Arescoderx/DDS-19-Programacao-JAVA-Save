/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_matheus;

import java.util.Scanner;
/**
 *
 * @author m.schmidt
 */
public class PROJETO_8_Matheus {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("BEM-VINDO");
        System.out.println("Me informe o país:");
        String Pais = ler.next();
        
        System.out.println("Me informe quantas medalhas de bronze esse pais conseguiu:");
        int Bronze = ler.nextInt();
        
        System.out.println("Me informe quantas medalhas de prata esse pais conseguiu:");
        int Prata = ler.nextInt();
        
        System.out.println("Me informe quantas medalhas de ouro esse pais conseguiu:");
        int Ouro = ler.nextInt();
        
        int total = Prata + Bronze + Ouro;
          
        if(Ouro > 5 && total > 30){
            System.out.println(Pais + " Teve Desempenho extraordinário!");
            
        }else if(Ouro > 10){
            System.out.println(Pais + " Teve Otimo Desempenho");
            
        }else if(Ouro >= 5 && Ouro <= 10){
            System.out.println(Pais + " Teve Bom desempenho");
            
        }else if(Ouro < 5 && total > 20){
            System.out.println(Pais + " Teve Desempenho regular");
            
        }else if(total < 20){
            System.out.println(Pais + "Teve Desempenho Fraco");
        }
    }
}
