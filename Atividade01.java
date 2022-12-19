package org.example;


import java.util.*;

public class Atividade01 {
    public static void main(String[] args) {

        ArrayList<Integer>par=new ArrayList<>();
        ArrayList<Integer>impar=new ArrayList<>();
        int parametroDeEntrada =0;
        int parametroDeEntrada2 =0;
        boolean isValido =false;
        boolean isValidoL =false;

        while (!isValido ) {

            System.out.println("Por favor digite o valor inteiro: ");
            Scanner entrada = new Scanner(System.in);

            try {

                parametroDeEntrada = entrada.nextInt();

            } catch (Exception exception) {

                isValido=false;

            }
                if(1<=parametroDeEntrada && parametroDeEntrada<=100000){

                    isValido=true;

                }else {
                    System.out.println("Valor invalido! ");
                    isValido= false;
                }



        }

        System.out.println(parametroDeEntrada);
for(int i =1;i<=parametroDeEntrada;i++) {
    isValidoL = false;
    System.out.printf("Digite o valor %d: ", i);
    Scanner entrada2 = new Scanner(System.in);

    try {
        parametroDeEntrada2 = entrada2.nextInt();

    } catch (Exception exception) {
        System.out.println("Valor invalido! ");
        i--;

    }
    if (1 <= parametroDeEntrada2 && parametroDeEntrada2 <= 100000) {

        if (parametroDeEntrada2 % 2 == 0) {

            par.add(parametroDeEntrada2);
        } else {
            impar.add(parametroDeEntrada2);
        }

    } else {
        System.out.println("Valor invalido! ");
        i--;
    }
}
Collections.sort(par);
Collections.sort(impar, Comparator.reverseOrder());
for(int pares : par){
    System.out.println(pares);
}
    for(int impares : impar){
        System.out.println(impares);
    }



}



}




