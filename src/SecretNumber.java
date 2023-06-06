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

        // Entradas
        System.out.println("Jogo iniciado!");
        System.out.println("Digite um número entre 1 e 10: ");
        int numEscolhido = sc.nextInt();
        while (numEscolhido < 1 || numEscolhido > 10){
            System.out.println("\n* Opção Inválida! *");
            System.out.println("Digite um número entre 1 e 10: ");
            numEscolhido = sc.nextInt();
        }

        // Variáveis utilizadas
        Random random = new Random();
        int randomFacil = random.nextInt(10) + 1;
        int numAcima = randomFacil + 1;
        int numAbaixo = randomFacil - 1;
        int pontuacao = 0;
        String mensagem;

        // Lógica do jogo
        if (numEscolhido == randomFacil){
            pontuacao += 10;
            mensagem = "Parabéns, você acertou o número! :D";
        } else if (numEscolhido == numAcima || numEscolhido == numAbaixo) {
            pontuacao += 5;
            mensagem = "Por pouco! Você quase acertou o número :)";
        } else {
            mensagem = "Que pena! Você errou o número :(";
        }

        // Saídas
        System.out.println("--------------------------------------------------------");
        System.out.printf("%s %nO número sorteado foi: %d %n", mensagem, randomFacil);
        System.out.printf("Sua pontuação foi: %d pontos", pontuacao);

    }
}
