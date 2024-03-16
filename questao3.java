/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios2;

import java.util.Scanner;

/**
 *Escreva um programa Java que le dois n ́umeros de ponto flutuante e verifica se eles s̃ao iguais at ́e trˆes casas decimais.
 * @author aluno
 */
public class questao3 {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    double numero1 = scan.nextDouble();
    System.out.println("Digite o segundo número: ");
    double numero2 = scan.nextDouble();
    
    int numeroInt1 = (int) (numero1 *1000.);
    int numeroInt2 = (int) (numero2 *1000.);
    
    if(numeroInt1 == numeroInt2){
        System.out.println( "Os numeros " + numero1 + " e " + numero2 + " são iguais.");
    }else{
        System.out.println( "Os numeros " + numero1 + " e " + numero2 + " são diferentes.");

}
}
}