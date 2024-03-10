/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Comparadores {
   /* Escreva um programa em Java para imprimir todas as compara ̧c̃oes que vimos entre dois n ́umeros inteiros armazenados em varíaveis.*/
    
    public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    int numero1 = scan1.nextInt();
    System.out.println("Digite o segundo numero: ");
    int numero2 = scan2.nextInt();
    boolean maior = numero1 > numero2;
    System.out.println("O número " + numero1 +" é maior que o número " + numero2 +": "+ maior);
    boolean menor = numero1<numero2;
    System.out.println("O número " + numero1 +" é menor que o número " + numero2 +": "+ menor);
    boolean maiorOuIgual = numero1>=numero2;
    System.out.println("O número " + numero1 +" é maior ou igual que o número " + numero2 +": "+ maiorOuIgual);
    boolean menorOuIgual = numero1<=numero2;
    System.out.println("O número " + numero1 +" é menor ou igual que o número " + numero2 +": "+ menorOuIgual);
    boolean igual = numero1==numero2;
    System.out.println("O número " + numero1 +" é igual ao número " + numero2 +": "+  igual);
    boolean diferente = numero1!=numero2;
    System.out.println("O número " + numero1 +" é diferente do número " + numero2 +": "+  diferente);
    
    }
}
