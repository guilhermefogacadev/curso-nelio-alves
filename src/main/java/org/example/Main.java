package org.example;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeroInteiro= 10;
        double numeroQuebrado= 10.890;
        System.out.printf("%.2f%n",numeroQuebrado);//printF é o print formatado;
        Locale.setDefault(Locale.US);//faz trocar a localização para US, ao inves do separador ser virgular vira um ponto
        System.out.println("result = "+numeroQuebrado);
        System.out.printf("O numero inteiro %d é diferente do numero quebrado %f",numeroInteiro,numeroQuebrado);// d=decimal,f=float,s=string

    }
}