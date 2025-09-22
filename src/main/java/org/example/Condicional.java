package org.example;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int minutos = sc.nextInt();
        double conta= 50.0;
        if(minutos>100){
            minutos= minutos -100;
            conta+=minutos*2;
        }

        System.out.printf("Valor a pagar:R$ %.2f%n ",conta);
    }
}
