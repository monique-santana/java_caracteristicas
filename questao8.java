/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios2;
import java.util.Scanner;
/**
 *Escreva um programa Java para exibir os n primeiros termos dos n ́umeros naturais
e sua soma, sendo n obtido atrav ́es do console.
 * @author monique
 */
public class questao8 {
    public static void main(String[] args) {
        System.out.println("Digite o numero:");    
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int aux = 1;
    int soma = 0;
    while(aux != num+1 ){
        System.out.println(aux);
        soma += aux;
        aux++;
    }
        System.out.println("Soma dos "+ num+ " primeiros numeros naturais: " + soma);
    }
    
}
