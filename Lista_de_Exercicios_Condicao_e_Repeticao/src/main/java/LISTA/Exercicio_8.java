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
public class Exercicio_8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int tentativa = 1;
        while(tentativa != 0) {
            System.out.println("\nPor Favor, insira uma senha(mínimo de 8 caracteres):");
            String senha = ler.nextLine();
            int caracter = senha.length();
            
            if(caracter < 8){
                System.out.println("Senha inválida! Tente novamente sua senha não tem 8 caracters");
            }else{
                System.out.println("Senha aceita! Sua senha atende aos critérios de segurança");
                break;
            }
        }
    }
}
