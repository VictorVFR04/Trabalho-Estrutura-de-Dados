/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_2_bimestre;

/**
 * Desenvolvedor:
 * Victor Fagundes Ramos (RA:00239823)
 */
public class Ordenacoes {
    
    public static void ordenarInsercao(int[] vetor){
        int aux; 
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            int j = i - 1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;    
    }      
        System.out.println("\nVetor Ordenado por Inserção:");
        for(int i =0; i < vetor.length; i++){
            System.out.println("Posição["+i+"] = "+vetor[i]);                   
        }
}
    
    public static void ordenarSelecao(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            int posicaoMenor = i;
            
        for(int j = i+1; j < vetor.length; j++){
            if(vetor[j] < vetor[posicaoMenor]){
                posicaoMenor = j;
                }
            }
        if(posicaoMenor != i){
            int aux = vetor[i];
            vetor [i] = vetor[posicaoMenor];
            vetor[posicaoMenor] = aux;
            }
        }
        System.out.println("\nVetor Ordenado por Seleçao:");
        for(int i =0; i < vetor.length; i++){
            System.out.println("Posicao[" +i+ "] = "+vetor[i]);
        }
    }
    
    public static void ordenarBolha(int[] vetor){
        boolean mudou = true;

        while(mudou){
            mudou = false;
    
        for (int i = 0; i < vetor.length - 1; i++){
            if(vetor[i] > vetor[i+1]){
                int aux = vetor [i];
                vetor [i] = vetor [i+1];
                vetor [i+1] = aux; 
                mudou = true;
                }
            }
        }
        System.out.println("\nVetor Ordenado por Bolha:");
          for(int i = 0; i < vetor.length; i++){
              System.out.println("Posicao["+i+"] = "+vetor[i]);
         }
    }
}
