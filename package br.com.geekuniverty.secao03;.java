package br.com.geekuniverty.secao03;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
    //variaáveis
    float altura, peso ideal;
    Scanner teclado = new Scanner(System.in);


    //Entradas
    System.out.println("Qual a sua altura?");
    altura = teclado.nextfloat();

    //Processamento 
    peso_ideal = (float)(altura * 72.7) - 58; //cast

    //saida
    System.out.println("Seu peso ideal seria" + peso_ideal)

    teclado.close();
}
}