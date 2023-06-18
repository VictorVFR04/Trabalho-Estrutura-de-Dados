/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_2_bimestre;

/**
 * Desenvolvedor:
 * Victor Fagundes Ramos (RA:00239823)
 */
public class Pesquisa {
    
    public static int pesquisaLinear(int[] vetor, int elemento){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == elemento){
                return i;
            }
        }
        return -1;    
    }
    
    public static int pesquisaBinaria(int[] vetor, int elemento, int esquerda, int direita){
        if (esquerda > direita) {
        return -1;
    }

    int meio = (esquerda + direita) / 2;

    if (vetor[meio] == elemento) {
        return meio;
    } else if (vetor[meio] < elemento) {
        return pesquisaBinaria(vetor, elemento, meio + 1, direita);
    } else {
        return pesquisaBinaria(vetor, elemento, esquerda, meio - 1);
        }
    }
}
