package com.example.estruturadedadosav.Vetor;

public class PercorrerVetor {

    public static void main(String[] args) {


        int[] vetor1={1,2,3,4,5,6,7};
        int soma=0;

        for (int i = 0; i < vetor1.length; i++) {   // ler crescente
            System.out.println(vetor1[i]);
        }

        /*for (int i =vetor1.length -1 ;i>=0;i--) {//ler decrescente
            System.out.println(vetor1[i]);
        }*/

        for (int i = 0; i < vetor1.length; i++) {
           soma = soma+ vetor1[i];
        }

        System.out.println("soma é: "+ soma);

        System.out.println("media é: "+soma/ vetor1.length);

    }
}
