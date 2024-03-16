/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios2;

import java.util.Scanner;

/**
 *Escreva uma programa em Java que recebe do usu ́ario um mˆes e um ano e imprima
na tela um texto no seguinte formato:

<mˆes> de <ano> possui <quantidade> dias.
 * @author aluno
 */
public class questao5 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o mês: ");
    int mes = scan.nextInt();  
    String stringMes = "";
    int quantDias = 0;
    boolean bissexto = false;
    System.out.println("Digite o ano: ");
    int ano = scan.nextInt();
    
    if (ano%100 == 0){
        if(ano%400 ==0){
            bissexto = true;
        }else{
             bissexto = false;
        }
    } else if(ano%4 == 0){
        bissexto = true;
    }else{
         bissexto = false;
    }   
    
    
    switch(mes){
        case(1):{
            stringMes = "Janeiro";
            quantDias = 31;}
            break;
        case(2):{
            stringMes = "Fevereiro";
            if(bissexto){
                quantDias = 29;
            }else{
                quantDias = 28;}
        }
        
            break;
        case(3):{
            stringMes = "Março";
            quantDias = 31;}
            break;
        case(4):{
            stringMes = "Abril";
            quantDias= 30;}
            break;
        case(5):{
            stringMes = "Maio";
            quantDias = 31;}
            break;
        case(6):{ 
            stringMes = "Junho";
            quantDias = 30;}
            break;
        case(7):{
            stringMes = "Julho";
            quantDias = 31;}
            break;
        case(8):{
            stringMes = "Agosto";
            quantDias = 31;}
            break;
        case(9):{
            stringMes = "Setembro";
            quantDias = 30;}
            break;
        case(10):{
            stringMes = "Outubro";
            quantDias = 31;}
            break;
        case(11):{
            stringMes = "Novembro";
            quantDias = 30;}
            break;
        case(12):{
            stringMes = "Dezembro";
            quantDias = 31;}
            break;
        
            
    }
        System.out.println(stringMes + " de " + ano + " possui " + quantDias + " dias.");
}
    
}
