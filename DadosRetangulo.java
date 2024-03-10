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
public class DadosRetangulo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a largura do retangulo: ");
        double largura = scan.nextDouble() ;
        System.out.println("Digite a altura do retangulo: ");
        double altura = scan.nextDouble();
        double area = largura*altura;
        double perimetro = largura*2 + altura*2;
        System.out.println("A área do retangulo é: " + area);
        System.out.println("O perimetro do retangulo é: " + perimetro);
    }
    
    
}
