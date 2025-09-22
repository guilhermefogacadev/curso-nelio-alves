package org.example;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char resposta;
        do {
            System.out.println("Digite temperatura em Celsius: ");
            double celsius= sc.nextDouble();
            double f=(celsius*1.8)+32;
            System.out.printf("Equivalência  em Fahrenheit: %.1f%n",f);
            System.out.println("Deseja repetir (s/n) ");
            resposta= sc.next().charAt(0);
        }while(resposta=='s');
        sc.close();
    }
}
