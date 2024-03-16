/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios2;

import java.util.Scanner;

/**
 *Escreva um programa em Java para criar um padr ̃ao de triˆangulo retˆangulo com
um n ́umero que se repete em cada linha, at ́e o valor passado. Por exemplo, para
a entrada 3, a sa ́ıda  ́e:
 * @author moniq
 */
public class questao10 {
    public static void main(String[] args) {
    System.out.println("Digite o numero:");    
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int aux = 1;
    int cont = 0;
    while(aux!=num+1){
        while(cont!= aux){
            System.out.print(aux);
            cont++;
        }
        System.out.print("\n");
        cont=0;
        aux++;
        
        }
    }
}
        

    
