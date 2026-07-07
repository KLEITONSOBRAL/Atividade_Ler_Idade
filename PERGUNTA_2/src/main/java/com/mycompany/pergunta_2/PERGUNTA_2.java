/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
   Leve em consideração o ano com 365 dias e o mês com 30 dias.

   (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
   
 */

package com.mycompany.pergunta_2;

import java.util.Scanner;

public class PERGUNTA_2 {

    public static void main(String[] args) {
        
        int meses = 0, dias = 0, anos = 0 , totalDias = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os anos:");
        anos = scanner.nextInt();

        System.out.println("Digite os meses:");
        meses = scanner.nextInt();

        System.out.println("Digite os dias:");
        dias = scanner.nextInt();

        totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias equivalem a " + totalDias +" total de dias.");

               
    }
}
