/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.de.exercicios;

/** Escreva um programa em Java para imprimir a soma (adicao), multiplicac̃ao, sub-
tra ̧c ̃ao, divis ̃ao e resto de dois n ́umeros inteiros armazenados em vari ́aveis.
 *
 * @author aluno
 */
import java.util.Scanner;
public class Operacoes{

    public static void main(String[] args) {

        
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    int numero1 = sc1.nextInt();
    System.out.println("Digite o segundo numero: ");
    int numero2 = sc2.nextInt();
    int soma = numero1 + numero2;
    System.out.println("O resultado da soma é: " + soma);
    int multiplicacao = numero1*numero2;
    System.out.println("O resultado da multiplicacao é: " + multiplicacao);
    int subtracao = numero1-numero2;
    System.out.println("O resultado da subtracao é: " + subtracao);
    int divisao = numero1/numero2;
    System.out.println("O resultado da divisao é: " + divisao);
    int resto = numero1%numero2;
    System.out.println("O resto da divisao é: " + resto);
    }
    
}
