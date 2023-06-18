/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_2_bimestre;
import java.util.Scanner;

/**
 * Desenvolvedor:
 * Victor Fagundes Ramos (RA:00239823)
 */
public class Vetor {
    Scanner ler = new Scanner(System.in);
    private int[] numeros;
    private int[] vetorOriginal;
    private int tamanho;
    long duracao;
    
      public void inserirNumeros(){
        System.out.println("\nDigite o Tamanho do vetor: ");
        tamanho = ler.nextInt();
        numeros = new int[tamanho];
        vetorOriginal = new int[tamanho];
        
        for(int i = 0; i < tamanho; i++){
            System.out.println("\nDigite um numero inteiro para posição "+i);
            int elemento = ler.nextInt();
            numeros[i] = elemento;
            vetorOriginal[i] = numeros[i];
      }   
    }
      
      public void ordenarInsercao(){
          long comecar = System.nanoTime();
          Ordenacoes.ordenarInsercao(numeros);
          long finalizar = System.nanoTime();
          duracao = finalizar - comecar;
          System.out.println("\nTempo de execução(ordenarInsercao): " + duracao+ " nanosegundo");
      }   
      
      public void ordenarSelecao(){
          long comecar = System.nanoTime();
          Ordenacoes.ordenarSelecao(numeros);
          long finalizar = System.nanoTime();
          duracao = finalizar - comecar;
          System.out.println("\nTempo de execução(ordenarSelecao): " + duracao+ " nanosegundo");
      }
      
      public void ordenarBolha(){
          long comecar = System.nanoTime();
          Ordenacoes.ordenarBolha(numeros);
          long finalizar = System.nanoTime();
          duracao = finalizar - comecar;
          System.out.println("\nTempo de execução(ordenarBolha): " + duracao+ " nanosegundo");
      }    
      
       public void pesquisaLinear(){
          System.out.println("\nDigite um numero para pesquisar: ");
          int numeroPesquisado = ler.nextInt();
          int resultado = Pesquisa.pesquisaLinear(numeros, numeroPesquisado);
          if(resultado != -1){
              System.out.println("\nO número '" +numeroPesquisado+"' está na posição "+resultado);
          }else{
              System.out.println("\nNúmero '"+numeroPesquisado+"' não encontrado");
          }
      }
       
       public void pesquisaBinaria(){
           System.out.println("\nDigite um numero para pesquisar: ");
           int numeroPesquisado = ler.nextInt();
           int resultado = Pesquisa.pesquisaBinaria(numeros, numeroPesquisado, 0, tamanho -1);
            if(resultado != -1){
              System.out.println("\nO número '" +numeroPesquisado+"' está na posição "+resultado);
          }else{
              System.out.println("\nNúmero '"+numeroPesquisado+"' não encontrado");
          }
       }
      
    public void exibirVetorOriginal(){
           System.out.println("\nVetor Original: ");
           for(int i =0; i < vetorOriginal.length; i++){
               System.out.println("Posicao[" +i+ "] = "+vetorOriginal[i]);
           }
        }
    }


