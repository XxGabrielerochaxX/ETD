package com.example.estruturadedadosav.ListaExercicio;

import java.util.Arrays;

public class quatro {

    public static void main(String[] args) {

        int[] vetor = {};
        vetor = adicionar(vetor, 1);
        vetor = adicionar(vetor, 2);
        vetor = adicionar(vetor, 3);
        vetor = adicionar(vetor, 4);
        vetor = adicionar(vetor, 5);

        System.out.println(Arrays.toString(vetor));
    }

    public static int[] adicionar(int[] vetorOriginal, int valor) {
        int[] vetorNovo = new int[vetorOriginal.length + 1];

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorNovo[i] = vetorOriginal[i];
        }

        vetorNovo[vetorOriginal.length] = valor;

        return vetorNovo;
    }
}
//4-	Vetor com tamanho dinâmico. Implemente um vetor que aumente de tamanho dinamicamente à medida que elementos são adicionados a ele. Inicie esse vetor com tamanho 0. Depois, adicione os seguintes itens (um a um): {1, 2, 3, 4, 5}
