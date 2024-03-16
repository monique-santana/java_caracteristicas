/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios2;

import java.util.Scanner;

/**
 *
 * @author moniq
 */
public class questao6 {
    public static void main(String[] args) {
        System.out.println("Digite uma letra: ");
          
        Scanner scan = new Scanner(System.in);
        char letra = ' ';
        letra = scan.next().charAt(0);
        switch (letra) {
            case 'a' -> System.out.println("A letra "+ letra + " é uma vogal");
            case 'e' -> System.out.println("A letra "+ letra + " é uma vogal");
            case 'i' -> System.out.println("A letra "+ letra + " é uma vogal");
            case 'o' -> System.out.println("A letra "+ letra + " é uma vogal");
            case 'u' -> System.out.println("A letra "+ letra + " é uma vogal");
            default -> System.out.println("A letra "+ letra + " é uma consoante");
        }
            
        }
    }
    
}
