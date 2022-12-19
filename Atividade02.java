package org.example;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
double restoMoeda;
double resto;
        int notaDeCem = 0;
        int notaDeCinquenta = 0;
        int notaDeVinte = 0;
        int notaDeDez = 0;
        int notaCincum = 0;
        int notaDois = 0;
        int moedaDeUm = 0;
        double moedaDeCinquenta = 0;
        double moedaDeVinteCincum = 0;
        double moedaDeDez = 0;
        double moedaDecincum = 0;
       double moedaDeUmCentavo = 0;
 String valorV;
        double valorVerificado = 0;
        boolean valorvalido = false;


        while (!valorvalido) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o valor a ser verificado: ");


            try {
              valorV = entrada.next();
                double d1= Double.parseDouble(valorV.replace(',','.')) ;
                valorVerificado=d1;



            } catch (Exception exception) {
                System.out.println("Valor invalido ");
                valorvalido = false;
            }
            if (1 <= valorVerificado && valorVerificado <= 100000.00) {
                valorvalido = true;


            } else {
                System.out.println("Valor invalido! ");

            }


        }


        notaDeCem=(int) valorVerificado/100;
        resto= valorVerificado % 100;
        notaDeCinquenta= (int) resto/50;
        resto= resto%50;
        notaDeVinte= (int)resto/20;
        resto= resto%20;
        notaDeDez=(int)resto/10;
        resto= resto%10;
        notaCincum=(int) resto/5;
        resto= resto%5;
        notaDois=(int) resto/2;
        resto= resto%2;
        moedaDeUm=(int) resto/1;

resto+=0.002; // devido ao tempo não vou poder refatorar para BigDecimal





        moedaDeCinquenta= resto/0.50;
        resto=resto % 0.50;

        moedaDeVinteCincum= resto/0.25;
        resto=resto% 0.25;
        moedaDeDez= resto/0.10;
        resto=resto%0.10;
        moedaDecincum=resto/0.05;
        resto=resto%0.05;
        moedaDeUmCentavo= resto/0.01;


        System.out.println("NOTAS: ");
        System.out.printf("%d    nota(s) de R$ 100.00\n", notaDeCem);
        System.out.printf("%d    nota(s) de R$ 50.00\n", notaDeCinquenta);
        System.out.printf("%d    nota(s) de R$ 20.00\n", notaDeVinte);
        System.out.printf("%d    nota(s) de R$ 10.00\n", notaDeDez);
        System.out.printf("%d    nota(s) de R$ 5.00\n", notaCincum);
        System.out.printf("%d    nota(s) de R$ 2.00\n", notaDois);
        System.out.println("Moedas: ");
        System.out.printf("%d   moeda(s) de R$ 1.00\n", moedaDeUm);
        System.out.printf("%d   moeda(s) de R$ 0,50\n",(int) moedaDeCinquenta);
        System.out.printf("%d   moeda(s) de R$ 0,25\n",(int) moedaDeVinteCincum);
        System.out.printf("%d   moeda(s) de R$ 0,10\n",(int) moedaDeDez);
        System.out.printf("%d   moeda(s) de R$ 0,05\n",(int) moedaDecincum);
        System.out.printf("%d   moeda(s) de R$ 0,01\n",(int) moedaDeUmCentavo);

    }

}
