package contoledefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("=== Programa Contador ===");
            System.out.println("Este programa recebe dois números inteiros e imprime uma sequência de números entre eles.");
            System.out.println();

            System.out.println("Digite o primeiro número inteiro:");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo número inteiro:");
            int parametroDois = terminal.nextInt();
            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior ou igual ao primeiro");
        }

        System.out.println("=== Resultado ===");
        System.out.println("Imprimindo números de " + parametroUm + " até " + parametroDois + ":");
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
