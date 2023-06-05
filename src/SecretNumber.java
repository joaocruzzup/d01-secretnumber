import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis utilizadas
        Random random = new Random();
        int randomJogo = random.nextInt(11);
        int numAcima = randomJogo + 1;
        int numAbaixo = randomJogo - 1;
        int pontuacao = 0;
        int numEscolhido;
        int qtdAcertos10 = 0;
        int qtdAacertos5 = 0;
        int qtdErros = 0;
        String continuar;

        // Cabeçalho
        System.out.println("------------------------------------------------------------------");
        System.out.println("Boas-vindas ao Secret Number, o melhor jogo de números aleatórios!");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Digite aqui como você gostaria de ser chamado? ");
        String nomeUsuario = sc.nextLine();


        // Menu
        boolean iniciarJogo = false;
        boolean repeat = true;


        // Operações do Menu
        do {
            System.out.printf("%nOlá, %s! esse é o * Menu * do Secret Number! %n", nomeUsuario);
            System.out.println("1. Iniciar jogo \n2. Alterar dificuldade\n3. Alterar cores\n4. Sair do jogo");
            System.out.println("Digite o número da opção que você deseja acessar: ");
            int opcaoMenu = sc.nextInt();
            switch (opcaoMenu){
                case 1:
                    iniciarJogo = true;
                    repeat = false;
                    break;
                case 2:
                    System.out.println("-------Alterar Dificuldade-------");
                    System.out.println("1. Fácil\n2. Normal\n3. Difícil\n4. Impossível");
                    int opcaoDificuldade = sc.nextInt();
                    if (opcaoDificuldade == 1 || opcaoDificuldade == 2){
                        randomJogo = (opcaoDificuldade == 1)? random.nextInt(11) : random.nextInt(31);
                    } else {
                        randomJogo = (opcaoDificuldade == 3)? random.nextInt(101) : random.nextInt(Integer.MAX_VALUE);
                    }
                    System.out.println("A dificuldade do jogo foi alterada! ");
                    break;
                case 3:
                    break;
                default:
                    if (opcaoMenu == 4){
                        System.out.printf("Até mais, %s! %n", nomeUsuario);
                        System.out.println("Jogo encerrado!");
                        System.exit(0);
                        repeat = false;
                        break;
                    }
                    break;
            }
        } while (repeat);



        // Lógica do jogo
        if (iniciarJogo){
            System.out.printf("Jogo iniciado! Boa sorte, %s! Você vai conseguir!!!", nomeUsuario);
            do {
                System.out.println("\nDigite um número: ");
                numEscolhido = sc.nextInt();

                if (numEscolhido == randomJogo){
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

        }


        // Saída final de dados
        System.out.println("-------------Placar Final------------");
        System.out.printf("Sua pontuação foi total: %3d pontos %n", pontuacao);
        System.out.printf("Você acertou: %14d números %n", qtdAcertos10);
        System.out.printf("Você quase acertou: %8d números %n", qtdAacertos5);
        System.out.printf("Você errou: %16d números", qtdErros);

    }
}
