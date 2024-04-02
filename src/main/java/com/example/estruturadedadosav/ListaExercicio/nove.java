package com.example.estruturadedadosav.ListaExercicio;

public class nove {

    public static void main(String[] args) {
        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O menor elemento do vetor é: " + menor);
    }
}

//9-	Crie um vetor com os elementos {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189}. Crie um método que retorna o menor elemento do vetor.
