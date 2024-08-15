package org.example;

// PascalCase
public class Condicionais {
    /*
        Projetos Java tem pelo menos 1 métod main (Entrypoint)
        Geralmente utilizamos em projetos reais apenas 1;
        TODO: Arrumar isso depois
    */
    public static void main(String[] args) {

        /* OPERADORES
           =  - Atribuição
           == - Igualdade
           != - Diferente de
           >  - maior
           <  - menor
           >= - maior igual
           <= - menor igual
           && - AND
           || - OR
           !isMaiorDeIdade - falso

           ++
           --
           -=
           +=
           *=
           /=
           *
           /
           +
           -
           Math.pow(2,2)
           %

        */

        Integer idade = 20;
        Boolean isMaiorDeIdade = idade >= 18;
        if(isMaiorDeIdade){
            System.out.println("Maior: " + isMaiorDeIdade);
        }

        // Operador ternário
        String resultadoFormatado = isMaiorDeIdade ? "é maior de idade" : "não é maior de idade";
        System.out.println(resultadoFormatado);

        //Exp. que resulte em boolean
        if(!false){
            System.out.println("É verdade...");
        }

        //SWITCH CASE
        Integer opcao = 42;

        switch (opcao){
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            case 3:
                System.out.println("Opção 3");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
