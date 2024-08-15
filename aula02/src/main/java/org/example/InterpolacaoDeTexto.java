package org.example;

public class InterpolacaoDeTexto {
    public static void main(String[] args) {
        /* JS
            var vazea = "teste"
            `a palavrae${vazea}`
        */

        String filme = "Titanic";
        Integer anoLancamento = 1998;
        Double bilheteria = 10.125;

        // Concatenação (+) // má prática
        String frase1 = "Nome do filme: " + filme + ". Ano de lançamento: " + anoLancamento;
        System.out.println(frase1);

        String frase2 = String.format(
                "Nome: %s Ano de lançamento: %d Bilheteria: %.2f",
                filme, anoLancamento, bilheteria
        );
        System.out.println(frase2);

        String frase3 = "Nome do filme: %s Ano de lançamento: %d Bilheteria: %.2f"
                .formatted(filme, anoLancamento, bilheteria);
        System.out.println(frase3);

        String textoMaior =
               """
               - Filme: %s
               - Ano de lançamento: %d
               - Bilheteria: %.2f
               """.formatted(filme,anoLancamento, bilheteria);
        System.out.println(textoMaior);
    }
}
