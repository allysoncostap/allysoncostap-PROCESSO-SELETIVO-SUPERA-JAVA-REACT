package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        int cont1=0;
        int cont2=0;
        int cont=0;
        String frase , frase2;
        ArrayList<Character> arrs = new ArrayList<>();
        ArrayList<Character> arrs2 = new ArrayList<>();



        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos teste deseja realizar ?");
       try {
           cont = entrada.nextInt();
       }catch (Exception exception){
           System.out.println("valor invalido");
       }


        Scanner entrada2 = new Scanner(System.in);
for(int k=0;k< cont;k++) {
    System.out.println("Digite a frase a ser refertida ?");
    frase = entrada2.nextLine();

    for (int i = 0; i < frase.length(); i++) {
        cont1++;

    }




    if (cont1 >= 2 & cont < 100) {

    } else {
        System.out.println("Frase incorreta");
    }


    if (cont2 % 2 == 0) {
        cont2 = cont1 / 2;
    } else {
        cont2 = cont1 / 2;
        cont2 = (cont2 / 2) + (cont2 % 2);
    }


    for (int i = 0; i < cont2; i++) {
        frase.charAt(i);
        arrs.add(frase.charAt(i));
    }
    for (int i = cont2; i < frase.length(); i++) {

        arrs2.add(frase.charAt(i));
    }

    Collections.reverse(arrs);
    Collections.reverse(arrs2);
    for (Character a : arrs) {
        System.out.print(a);
    }
    for (Character b : arrs2) {
        System.out.print(b);
    }
System.out.println("");


  cont1=0;
  cont2=0;
    frase= "";
    frase2="";
    arrs.clear();
    arrs2.clear();

}
        entrada2.close();
        entrada.close();

    }
    }

