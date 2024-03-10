/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * calcular e imprimir o fatorial de um numero
 * @author moniq
 */
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int numero = scan.nextInt();
        int fatorial = 1;
    
        for(int i = numero; i>1;i--){
            fatorial*=i;
        }
        System.out.println("O fatorial de " + numero +" é: " + fatorial);
    }
    
}
