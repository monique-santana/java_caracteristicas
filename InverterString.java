/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author moniq
 */
import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a string a ser invertida: ");
        String input = scan.nextLine();
        
        String reversedString = inverterString(input);
        System.out.println(reversedString);
    }
    public static String inverterString(String input){
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;
        
        while (start<end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;            
        }
    return new String(charArray);
    }
}
