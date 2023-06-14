/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho_2_bimestre;
import javax.swing.JOptionPane;

/**
 * Desenvolvedores:
 * Victor Fagundes Ramos (RA:00239823)
 * Mateus Martins da Silva (RA: 00231293)
 */
public class Trabalho_2_Bimestre {
    
    public static void main(String[] args) {
    Ordenacoes ordenacoes = new Ordenacoes();
          
    while(true){
    
    int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha usando um numero inteiro: \n(1) Inserir Vetor de Inteiros \n (2) Ordenar por Inserção \n (3) Ordernar por Seleção \n (4) Ordernar por Bolha \n (5) Pesquisar Número"));    
    
     switch (opcao) {
         case 1: 
         ordenacoes.inserirNumeros();
         break;
          
         case 2: 

         break;
         
         case 3:
         ordenacoes.ordenarSelecao();
         break;
         
         case 4:
         ordenacoes.ordenarBolha();
         break;
         
         case 0:
             JOptionPane.showMessageDialog(null, "Você escolheu sair!");
             System.exit(0);
         default:
             JOptionPane.showMessageDialog(null, "Opção Inválida!");
     }

        }
    }
}

