/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios;

/**
 *
 * @author aluno
 */
public class TrocaVariavel {
    public static void main(String[] args) {
        int variavelA = 2;
        int variavelB = 5;
        int auxiliar = 0;
        System.out.println("O valor inicial da variável A é: " + variavelA);        
        System.out.println("O valor inicial da variável B é: " + variavelB);
        auxiliar = variavelA;
        variavelA = variavelB;
        variavelB = auxiliar;
        System.out.println("O valor da variável A após a troca é: " + variavelA);        
        System.out.println("O valor da variável B após a troca é: " + variavelB);
        
    }
    
}
