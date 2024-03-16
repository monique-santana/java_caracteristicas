/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios2;

import java.util.Scanner;

/**
 *
 * @author monique
 * Escreva um programa Java que exiba a soma dos n primeiros n ́umeros naturais
 ́ımpares.
 */
public class questao9 {
    public static void main(String[] args) {
        System.out.println("Digite o numero:");    
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int aux = 1;
    int soma = 0;
    while(aux<num*2 ){
            soma += aux;
            aux = aux + 2;
            
    }
    System.out.println("Soma dos "+ num+ " primeiros numeros naturais ímpares: " + soma);
    }
}
        

    
