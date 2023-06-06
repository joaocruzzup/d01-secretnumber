import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista criadas para armazenar os números
        List<Integer> listaSorteados = new ArrayList<>();
        List<Integer> listaEscolhidos = new ArrayList<>();
        List<String> listaResultado = new ArrayList<>();

        // Variáveis utilizadas
        Random random = new Random();
        int dificuldade = 10;
        String nomeDificuldade = "Fácil";
        int pontuacao = 0;
        int numEscolhido;
        int qtdAcertos10 = 0;
        int qtdAacertos5 = 0;
        int qtdErros = 0;
        String continuar;

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

        // Tela do nome do usuário
        System.out.print("Como você gostaria de ser chamado? (Digite sem espaços) \nNome: ");
        String nomeUsuario = sc.next();
        for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela

        // Operações do Menu
        boolean repeat = true;
        do {
            // Menu Principal
            System.out.printf("%nOlá, %s! esse é o * Menu * do Secret Number! %n", nomeUsuario);
            System.out.println("1. Iniciar jogo \n2. Alterar dificuldade\n3. Como Jogar\n4. Sair do jogo");
            System.out.println("Digite o número da opção que você deseja acessar: ");
            int opcaoMenu = sc.nextInt();

            for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
            switch (opcaoMenu){
                case 1:
                    repeat = false;
                    break;
                case 2:
                    // Menu de Alterar Dificuldade
                    System.out.println("-------Alterar Dificuldade-------");
                    System.out.println("1. Fácil  (Número entre 1 e 10)\n2. Normal  (Número entre 1 e 50)" +
                            "\n3. Difícil (Número entre 1 e 100)\n4. Muito difícil  (Número entre 1 e 1000)");
                    System.out.println("Digite o número da dificuldade que você deseja: ");
                    int opcaoDificuldade = sc.nextInt();
                    if (opcaoDificuldade == 1 || opcaoDificuldade == 2){
                        dificuldade = (opcaoDificuldade == 1)? 10 : 50;
                        nomeDificuldade = (opcaoDificuldade == 1)? "Fácil" : "Normal";
                    } else {
                        dificuldade = (opcaoDificuldade == 3)? 100 : 1000;
                        nomeDificuldade = (opcaoDificuldade == 3)? "Difícil" : "Muito Difícil";
                    }
                    for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
                    System.out.printf("* A dificuldade do jogo foi alterada para: { %s } * %n", nomeDificuldade);
                    break;
                case 3:
                    // Menu Como jogar
                    System.out.println("-------------------------------Como Jogar-------------------------------");
                    System.out.println(" 1: Selecione iniciar jogo no * Menu *");
                    System.out.println(" 1.1: Você pode alterar dificuldades no * Menu * O padrão é | Fácil |");
                    System.out.println(" 1.2: Confira no Menu Alterar Dificuldade sobre a dificuldade de cada nível");
                    System.out.println(" 2: Ao iniciar o jogo, você deverá digitar um número");
                    System.out.println(" 3: O sistema informará se você acertou ou errou o número e dará sua pontuação");
                    System.out.println(" 3.1: A pontuação é: 10 pontos para acertos, 5 pontos para quase acertos, 0 pontos para erros");
                    System.out.println(" 3.2: O quase acerto é quanto o número chutado está próximo (+-1) do correto");
                    System.out.println(" 4: Você pode jogar novamente quantas vezes quiser, basta digitar S para continuar ou N para parar");
                    System.out.println(" 5: No final você terá uma tabela mostrando o seu desempenho");
                    System.out.println(" 6: Se divirta!");
                    System.out.println("\n Digite * ENTER * para voltar ao menu: ");
                    sc.nextLine();
                    sc.nextLine();
                    for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
                    break;
                case 4:
                    // Mensagem de saída do jogo
                    System.out.printf("Até mais, %s! %n", nomeUsuario);
                    System.out.println("Jogo encerrado!");
                    System.exit(0);
                    repeat = false;
                    break;
                default:
                    // Validação de entradas incoerentes para o menu
                    System.out.println("*--------------Opção inválida!--------------*");
            }
        } while (repeat);

        // Lógica do jogo
        System.out.print("Jogo iniciado! ");
        do {
            System.out.printf("%nBoa sorte, %s! Você vai conseguir!!! %n", nomeUsuario);
            int randomJogo = random.nextInt(dificuldade) + 1; // Números a partir de 1 até o valor de dificuldade
            System.out.printf("%nDigite um número entre %d e %d: %n", 1, dificuldade);
            numEscolhido = sc.nextInt();
            while (numEscolhido < 1 || numEscolhido > dificuldade){
                System.out.print("\n* Opção inválida! *");
                System.out.printf("%nDigite um número entre %d e %d: %n", 1, dificuldade);
                numEscolhido = sc.nextInt();
            }
            if (numEscolhido == randomJogo){ // lógica do Acertos
                pontuacao += 10;
                qtdAcertos10 += 1;
                listaEscolhidos.add(numEscolhido);
                listaSorteados.add(randomJogo);
                listaResultado.add("Acertou");

                for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
                System.out.printf("* Parabéns, %s! Você acertou o número! e ganhou 10 pontos :D *%n%n", nomeUsuario);
                System.out.println("Você deseja jogar novamente? \nDigite 'S' para Sim e 'N' para Não");
                continuar = sc.next();
                for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
            } else if (numEscolhido == randomJogo +1 || numEscolhido == randomJogo -1) { // lógica dos Quase Acertos
                pontuacao += 5;
                qtdAacertos5 += 1;
                listaEscolhidos.add(numEscolhido);
                listaSorteados.add(randomJogo);
                listaResultado.add("Quase acertou");

                for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
                System.out.printf("* Por pouco, %s! Você quase acertou o número, mas ganhou 5 pontos :) *%n%n", nomeUsuario);
                System.out.println("Você deseja jogar novamente? \nDigite 'S' para Sim e 'N' para Não:");
                continuar = sc.next();
                for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
            } else { // Lógica dos Erros
                qtdErros += 1;
                listaEscolhidos.add(numEscolhido);
                listaSorteados.add(randomJogo);
                listaResultado.add("Errou");

                for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
                System.out.printf("* Que pena, %s! Você errou o número e não ganhou nenhum ponto :( *%n%n", nomeUsuario);
                System.out.println("Você deseja jogar novamente? \nDigite 'S' para Sim e 'N' para Não:");
                continuar = sc.next();
                for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
            }

        } while (continuar.equalsIgnoreCase("s"));


        // Saída final de dados
        for (int i =0; i < 40; i++){System.out.println();} //Limpar a tela
        System.out.println("-------------Placar Final------------");
        System.out.printf("Sua pontuação foi total: %3d pontos %n", pontuacao);
        System.out.printf("Você jogou: %16d partidas%n", (qtdAcertos10+qtdAacertos5+qtdErros));
        System.out.printf("Você acertou: %14d números %n", qtdAcertos10);
        System.out.printf("Você quase acertou: %8d números %n", qtdAacertos5);
        System.out.printf("Você errou: %16d números %n", qtdErros);
        System.out.println("\nVocê gostaria de ver quais números foram sorteados?");
        System.out.println("Digite 'S' para Sim e 'N' para Não: ");
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase("s")){
            System.out.println("------------A tabela de números foi-----------");
            System.out.println("| Tentativa | Nº Sorteado | Nº Escolhido |   Resultado   |");
            for (int i=0; i<listaSorteados.size(); i++){
                System.out.printf("|     %-3d   |     %-4d    |     %-4d     | %-14s|%n",
                        (i+1), listaSorteados.get(i), listaEscolhidos.get(i), listaResultado.get(i));
            }
        } else {
            System.out.printf("%nTudo bem! Até mais, %s! %n", nomeUsuario);
            System.out.println("Jogo encerrado!");
        }
    }
}
