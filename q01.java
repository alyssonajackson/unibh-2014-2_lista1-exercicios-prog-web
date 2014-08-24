/**
 * Escreva um algoritmo para ler a idade de uma pessoa e imprimir a mensagem
 * "Você é maior de idade!" se ela tiver 18 anos ou mais,
 * ou "Você é menor de idade!" caso contrário.
 * */

import javax.swing.JOptionPane;

public class q01 {
    
    public static void main(String args[]){
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        if(idade >= 18){
            JOptionPane.showMessageDialog(null, "Você é maior de idade!");
        }else{
            JOptionPane.showMessageDialog(null, "Você é menor de idade!");
        }
    }

}
