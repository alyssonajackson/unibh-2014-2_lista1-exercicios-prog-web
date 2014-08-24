/**
 * Escreva um algoritmo para ler a idade de uma pessoa e imprimir a mensagem
 * "Você é maior de idade!" se ela tiver 18 anos ou mais,
 * ou "Você é menor de idade!" caso contrário.
 * */

import javax.swing.JOptionPane;

public class q01 {
    
    public static void main(String args[]){

        int idade; //1º passo: declarar a variável idade

        /* a declaração de variáveis funciona da seguinte forma:
         * tipo nome_da_variavel;
         * no caso da variável idade, escolhemos o tipo "int" (inteiro), pois
         * nesse exemplo não iremos trabalhar com casos como: 18 anos e meio.
         * Se fosse esse o caso, deveríamos utilizar, ao invés do "int", por exemplo o "float";
         * */

        /*
         * O método showInputDialog mostra uma caixa de texto para
         * que o usuário digite o que foi solicitado na mensagem,
         * então retorna o valor digitado, como uma string.
         * Ex: se o usuário digitou 18, o comando irá retornar "18".
         * Sabe-se que "18", por mais que seja um número, é reconhecido como um texto (string),
         * devido às aspas.
         * Sendo assim, se tentarmos atribuir diretamente, o retorno do showInputDialog à variável idade
         * iremos obter um erro, pois a variável em questão aceita somente valores inteiros.
         * Sendo assim, precisamos "converter" esse valor em inteiro. E isso é feito da seguinte forma:
         *
         * Integer.parseInt(variavel_ou_valor_string); //isso retorna um inteiro.
         *
         * */

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        //2º passo: atribuímos o retorno do showInputDialog à variável idade, após convertê-lo para "int".


        //3º passo: verificamos se o valor da variável idade é igual ou superior a 18

        if(idade >= 18){
            //caso a condição seja verdadeira, nosso código terá sua execução continuada nesse trecho
            JOptionPane.showMessageDialog(null, "Você é maior de idade!"); //4º passo, mostrar a mensagem caso a condição seja falsa
        }else{
            //somente caso a condição (idade >= 18) for FALSA, o código irá continuar por aqui
            JOptionPane.showMessageDialog(null, "Você é menor de idade!"); //5º passo, mostrar a mensagem caso a condição seja falsa
        }
    }

}
