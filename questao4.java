/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios2;

import java.util.Scanner;

/**
 * Escreva um programa Java que solicita um ano ao usu ́ario e imprime se  ́e um ano
            bissexto ou n ̃ao.
 * @author aluno
 */
public class questao4 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o ano para verificar se ele é bissexto: ");
    int ano = scan.nextInt();
    if (ano%100 == 0){
        if(ano%400 ==0){
            System.out.println("O ano "+ ano + " é bissexto.");
        }else{
             System.out.println("O ano "+ ano + " não é bissexto.");
        }
    } else if(ano%4 == 0){
        System.out.println("O ano "+ ano + " é bissexto.");
    }else{
        System.out.println("O ano "+ ano + " não é bissexto.");
    }   
}
    
}