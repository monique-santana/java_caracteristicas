/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios2;
import java.util.Scanner;
/**
 * Escreva um programa Java que le um ńumero de ponto flutuante e imprime ”zero” se o ńumero for zero. 
 *  Caso contr ́ario, imprima ”positivo” ou ”negativo”. Adicione ”pequeno” se o valor absoluto do n ́umero 
 * for menor que 1, ou ”grande” se exceder 1.000.000.
 * @author monique
 */
public class questao2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o número: ");
    double numero = scan.nextDouble();
    if(numero == 0){
        System.out.println("O número é zero");
        
    } else if (numero > 0){
        System.out.println("O número é positivo");
    } else{
        System.out.println("O número é negativo");
    }
    if(numero > -1 && numero < 1){
        System.out.println("O número é pequeno.");
    }
    if(numero > 1000000){
        System.out.println("O número é grande.");
    }
     
    }
}