/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios2;

import java.util.Scanner;

/**
 * Escreva um programa Java que solicita tres ńumeros ao usúario e imprime o maior deles.
 * @author monique
 */
public class questao1 {
    public static void main(String[] args) {
    int maior = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    int numero1 = scan.nextInt();
    if(numero1 > maior){
        maior = numero1;
    }
    System.out.println("Digite o segundo numero: ");
    int numero2 = scan.nextInt(); 
    if(numero2 > maior){
        maior = numero2;
    }
    System.out.println("Digite o terceiro numero: ");
    int numero3 = scan.nextInt();
    if(numero3 > maior){
        maior = numero3;
    }
        System.out.println("O maior numero entre os digitados é: " + maior);
        
        
        
    }
    
}