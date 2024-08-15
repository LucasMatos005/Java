package org.example;
import java.util.Scanner;

public class InputUsuario {
    public static void main(String[] args) {
        // STOUD | STDIN
        // Um objto do tipo Scanner
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String valorDigitado = leitor.nextLine();
        System.out.println("Agora, digite sua idade:");
        Integer idade = leitor.nextInt();
        System.out.println("Olá " + valorDigitado + ".Sua idade é: " + idade);

        System.out.println("Digite novamente: ");
        String valorDigitado2 = leitor.next();
        System.out.println("Valor digitado 2 " + valorDigitado2);
    }
}
