/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
Leve em consideração o ano com 365 dias e o mês com 30.

(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
 */

package com.mycompany.pergunta_2;

import java.util.Scanner;

public class PERGUNTA_2 {

    public static void main(String[] args) {
        
        int dias, anos, meses;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade em números:");
        int idade = scanner.nextInt();

        dias = idade * 365;
        meses = idade / 12;

        System.out.println("Você tem "+ idade + " anos " + meses + " meses " + dias + " dias");
        
        
    }
}
