package com.example.estruturadedadosav.Vetor;

import java.util.Arrays;

public class AdiconarElementDinamico {

    public static void main(String[] args) {

    int[] vetor= {};
    vetor=adicionar(vetor,50);
    vetor=adicionar(vetor, 30);
        vetor=adicionar(vetor, 80);


        System.out.println(Arrays.toString(vetor));

    }

    //crie um vetor novo cujo tamanho seja (length do vetor antigo +1.)
    //adiciona os elementos do vetor  antigo ao novo vetor.


    public static int[] adicionar(int[] vetorOriginal, int valor){
        int[] vetorNovo= new int [vetorOriginal.length+1];

        for(int i=0; i<vetorOriginal.length;i++){
            vetorNovo[i] = vetorOriginal[i];

        }
        vetorNovo[vetorOriginal.length] =valor;

        return vetorNovo;



    }



}
