package org.example;

public class Ternario {
    public static void main(String[] args) {
        //(condicao)? se_verdadeiro : se_falso
        double preco= 34.5;
        double desconto=(preco < 20) ? (preco*0.1):(preco*0.05);
        System.out.println(preco+desconto);
    }
}
