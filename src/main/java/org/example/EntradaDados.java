package org.example;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String texto= sc.nextLine();
        char x= sc.next().charAt(0);//pega a posição 0 da String, primeiro caracter da string
        sc.close();

    }
}
