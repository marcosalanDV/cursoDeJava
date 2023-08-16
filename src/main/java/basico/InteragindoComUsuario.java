package basico;

import java.util.Scanner;

public class InteragindoComUsuario {

    public static void main(String[] args) {

        System.out.println("Escreva seu nome:");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        System.out.println("Olá " + nome.toUpperCase() + " Seja bem vindo!".toUpperCase());
    }
}
