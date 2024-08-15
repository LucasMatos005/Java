package org.example;

public class LacosRepeticao {
    public static void main(String[] args) {
        /* JS
           for(var i = 0; i <= 10; i++){
                ...
           }
        */

        for (int i = 10; i < 0; i--) {
            System.out.print(i + "\n");
        }

        //WHILE ?
        Integer contador = 0;
        while(contador < 10) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        //DO WHILE
        Integer cont = 0;
        do{
            System.out.println("Primeira execução");
            cont++;
            System.out.println("Execução");
        } while(cont < 10);
    }
}
