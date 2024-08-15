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
public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tentativas = 3;
        int login = 0;
        String usuario = "Mykael";
        String senha = "MykaelLindo";

        while (tentativas != login) {
            System.out.println("Insira seu nome de usuário:");
            String usuario_log = ler.nextLine();

            System.out.println("Insira sua senha:");
            String senha_log = ler.nextLine();

            if (usuario_log.equals(usuario) && senha_log.equals(senha)) {
                System.out.println("Login bem-sucedido! Bem-vindo");
                break;
            } else {
                tentativas = tentativas - 1;
                if (tentativas == 0) {
                    System.out.println("Nome de usuário ou senha incorretos.");
                    System.out.println("Você não tem mais chances");
                    break;
                }
                System.out.println("Nome de usuário ou senha incorretos. Você tem " + tentativas + " tentativas.");
            }
        }
    }
}
