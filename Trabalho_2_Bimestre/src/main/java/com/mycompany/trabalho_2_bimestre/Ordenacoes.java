/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_2_bimestre;

/**
 * Desenvolvedores:
 * Victor Fagundes Ramos (RA:00239823)
 * Mateus Martins da Silva (RA: 00231293)
 */
public class Ordenacoes {
    int[] numeros = {32,43,1,132,43,5,4,7};
    
    
    public void ordenarInsercao (){
        
    }
    
    public void ordenarSelecao (){
        for(int i = 0; i < numeros.length; i++){
            int posicaoMenor = i;
            
        for(int j = i+1; j < numeros.length; j++){
            if(numeros[j] < numeros[posicaoMenor]){
                posicaoMenor = j;
                }
            }
        if(posicaoMenor != i){
            int aux = numeros[i];
            numeros [i] = numeros[posicaoMenor];
            numeros[posicaoMenor] = aux;
            }
        }
        for(int i =0; i < numeros.length; i++){
            System.out.println("posicao [" +i+ "[ = "+numeros[i]);
        }
    }
    
    public void ordenarBolha (){
        boolean mudou = true;

        while(mudou){
            mudou = false;
    
        for (int i = 0; i < numeros.length - 1; i++){
            if(numeros[i] > numeros[i+1]){
                int aux = numeros [i];
                numeros [i] = numeros [i+1];
                numeros [i+1] = aux; 
                mudou = true;
                }
            }
        }
          for(int i = 0; i < numeros.length; i++){
            System.out.println("posicao ["+i+"] = "+numeros[i]);
         }
    }
}
