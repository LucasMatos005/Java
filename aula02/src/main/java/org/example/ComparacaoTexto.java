package org.example;

import java.util.Scanner;

public class ComparacaoTexto {
    public static void main(String[] args) {

        // String = ['L','u','c','a','s']
        // São duas string identicas, estão no código
        String nome1 = "Lucas";
        String nome2 = "Lucas";

        // Retorna true pq, por terem o mesmo valor, as duas
        // variaveis apontam para o mesmo espaço de memória
        if(nome1 == nome2){
            System.out.println("é igual");
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String name1 = leitor.nextLine();
        String name2 = "Lucas";

        String resultado = name1.equalsIgnoreCase(name2) ? "igual" : "diferente";
        System.out.println(resultado);

//        if(name1.equalsIgnoreCase(name2)){
//            System.out.println("é igual");
//        } else {
//            System.out.println("é diferente");
//        }

    }
}
