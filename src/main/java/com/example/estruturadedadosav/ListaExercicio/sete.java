package com.example.estruturadedadosav.ListaExercicio;

public class sete {

    public static void main(String[] args) {

        int[] vetor1={1,2,3,4,5,6,7,8,9};
        int soma=0;

        for (int i = 0; i < vetor1.length; i++) {
            soma = soma+ vetor1[i];
        }


        System.out.println("media é: "+soma/ vetor1.length);


    }

}
//7-	Crie um vetor com os elementos {1, 2, 3, 4, 5, 6, 7, 8, 9}. Crie um método que calcule a média dos elementos.
