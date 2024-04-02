package com.example.estruturadedadosav.ListaExercicio;
import java.util.Arrays;
import java.util.Random;
public class cinco {
    public static void main(String[] args) {
        int[] vetor = {};

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int numeroAleatorio = random.nextInt();
            vetor = adicionar(vetor, numeroAleatorio);
        }

        System.out.println("Vetor após adicionar 1000 números aleatórios: " + Arrays.toString(vetor));
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
//5-	Utilize o vetor de tamanho dinâmico criado anteriormente. Gere 1000 números aleatórios e armazene neste vetor.
