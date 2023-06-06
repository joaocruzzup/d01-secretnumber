import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis do Cabeçalho
        String esp = " ";
        String texto1 = "SECRET NUMBER";
        String texto2 = "Acerte o número secreto";
        String texto3 = "e ganhe pontos!";
        String texto4 = "Pressione * ENTER * para começar!";

        // Cabeçalho
        System.out.println(" ------------------------------------ ");
        System.out.printf("| %23s %10s |%n| %34s |%n| %28s %5s |%n| %25s %8s |%n| %34s |%n|"
                , texto1, esp, esp, texto2, esp, texto3, esp, esp);
        System.out.printf("  %10s |%n| %34s |%n ", texto4, esp);
        System.out.println("------------------------------------");
        sc.nextLine();

        // Variáveis utilizadas
        Random random = new Random();
        int randomFacil = random.nextInt(10) + 1;
        int numAcima = randomFacil + 1;
        int numAbaixo = randomFacil - 1;
        int pontuacao = 0;
        int numEscolhido;
        int qtdAcertos10 = 0;
        int qtdAacertos5 = 0;
        int qtdErros = 0;
        String continuar;

        // Lógica do jogo
        System.out.println("Jogo iniciado!");
        do {
            System.out.println("\nDigite um número de 1 a 10: ");
            numEscolhido = sc.nextInt();
            while (numEscolhido < 0 || numEscolhido > 10){
                System.out.println("\n* Opção inválida! *");
                System.out.println("Digite um número de 1 a 10: ");
                numEscolhido = sc.nextInt();
            }

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
