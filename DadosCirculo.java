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
public class DadosCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        double raio = scan.nextDouble();
        double area = raio*raio*2*Math.PI;
        double perimetro =2*Math.PI*raio;
        System.out.println("A área do círculo é: " + area);
        System.out.println("O perimetro do círculo é: " + perimetro);
               
    }
    
}
