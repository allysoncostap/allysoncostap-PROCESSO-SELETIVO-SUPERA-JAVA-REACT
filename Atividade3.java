package org.example;

;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        int contDoFor = 0;
        int contVerificar = 0;
        int cont = 0;
        int alvo;
        int vetores;
        int resultado1;
        int resultado2;
        int media;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informer o valor do array: ");
        cont = entrada.nextInt();
        int[] array = new int[cont];

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Informer o valor do alvo: ");
        alvo = entrada2.nextInt();


        for (int i = 0; i < cont; i++) {
            contDoFor++;
            System.out.printf("Digite os valores do array, valor[%d]: ", contDoFor);
            vetores = entrada2.nextInt();
            array[i] = vetores;

        }


        for (int a = 0; a < cont ; a++) {
            for (int i = 0; i < cont ; i++) {

                resultado1 = array[a];
                resultado2 = array[i];
                media = 0;


                media = resultado1 - resultado2;


              //  System.out.println(media);

if(media==alvo){
    contVerificar++;

}


            }

            entrada.close();
            entrada2.close();
        }
        System.out.println(contVerificar);
    }
}
