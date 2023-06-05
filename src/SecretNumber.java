import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cabeçalho
        System.out.println("------------------------------------------------------------------");
        System.out.println("Boas-vindas ao Secret Number, o melhor jogo de números aleatórios!");
        System.out.println("------------------------------------------------------------------");

        // Variáveis utilizadas
        Random random = new Random();
        int randomFacil = random.nextInt(11);
        int numAcima = randomFacil + 1;
        int numAbaixo = randomFacil - 1;
        int pontuacao = 0;
        int numEscolhido;
        int qtdAcertos10 = 0;
        int qtdAacertos5 = 0;
        int qtdErros = 0;
        String continuar;

        // Lógica do jogo
        do {
            System.out.println("\nDigite um número: ");
            numEscolhido = sc.nextInt();

            if (numEscolhido == randomFacil){
                pontuacao += 10;
                qtdAcertos10 += 1;
                System.out.println("-------------------------------------------------------");
                System.out.println("Parabéns, você acertou o número! e ganhou 10 pontos :D \n");
                System.out.println("Você deseja jogar novamente? \nDigite 'S' para Sim e 'N' para Não");
                continuar = sc.next();
            } else if (numEscolhido == numAcima || numEscolhido == numAbaixo) {
                pontuacao += 5;
                qtdAacertos5 += 1;
                System.out.println("------------------------------------------------------------");
                System.out.println("Por pouco! Você quase acertou o número, mas ganhou 5 pontos :) \n");
                System.out.println("Você deseja jogar novamente? \nDigite 'S' para Sim e 'N' para Não");
                continuar = sc.next();
            } else {
                qtdErros += 1;
                System.out.println("----------------------------------------------------------");
                System.out.println("Que pena! Você errou o número e não ganhou nenhum ponto :( \n");
                System.out.println("Você deseja jogar novamente? \nDigite 'S' para Sim e 'N' para Não");
                continuar = sc.next();
            }

        } while (continuar.equalsIgnoreCase("s"));

        // Saída final de dados
        System.out.println("-------------Placar Final------------");
        System.out.printf("Sua pontuação foi total: %3d pontos %n", pontuacao);
        System.out.printf("Você acertou: %14d números %n", qtdAcertos10);
        System.out.printf("Você quase acertou: %8d números %n", qtdAacertos5);
        System.out.printf("Você errou: %16d números", qtdErros);

    }
}
