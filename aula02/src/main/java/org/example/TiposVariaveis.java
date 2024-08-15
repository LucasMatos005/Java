package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class TiposVariaveis {
    public static void main(String[] args) {
        // Data Types
        /*
            Classes Wrapper:

            String -> Texto (Sempre com aspas duplas)
            Integer -> Inteiro
            Double -> Números com ponto flutuante
            Boolean -> true | false
            Character -> 'a' (Sempre com aspas simples)
            Long -> inteiro 64
            Float -> Números com ponto flutuante (menor precisão)

            tipos primitivos:

            String -> NÃO POSSUI TIPO PRIMITIVO;
            int -> Integer
            double -> Double
            char -> Character
            long -> Long
            float -> Float

            Os tipos primitivos são somente uma representação de valor;
            As Classes Wrapper (envolta/por cima) são objetos da linguagem Java:
                - possuem métodos (função);
                - possuem características;

        */

        Integer numInteiro = 10;
        String string = numInteiro.toString();
        int numIntPrimitivo = 10;

        String nome = "Lucas";
        Double altura = 1.66;
        Character sexo = 'M';
        Boolean isMaiorDeIdade = true; //is | has

        /*
            Java possui tipagem estática;
            JavaScript utiliza tipagem dinânima;
        */

        // Até dá para usar var mas precisa seguir tipagem e precisa atribuir valor
        var teste = "Lucas";

        //
        String nomeTeste;
        nomeTeste = "Lucas Alves";



    }
}