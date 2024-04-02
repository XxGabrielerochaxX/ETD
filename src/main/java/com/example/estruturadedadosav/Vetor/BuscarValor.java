package com.example.estruturadedadosav.Vetor;

public class BuscarValor {

        public static int encontrarValor(int[] vetor, int valor) {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == valor) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] meuVetor = {1, 3, 5, 7, 9};
            int valorBuscado = 5;
            int posicao = encontrarValor(meuVetor, valorBuscado);
            if (posicao != -1) {
                System.out.println("O valor " + valorBuscado + " está na posição " + posicao + " do vetor.");
            } else {
                System.out.println("O valor " + valorBuscado + " não está presente no vetor.");
            }
        }


}
