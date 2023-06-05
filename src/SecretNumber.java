import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cabeçalho
        System.out.println("------------------------------------------------------------------");
        System.out.println("Boas-vindas ao Secret Number, o melhor jogo de números aleatórios!");
        System.out.println("------------------------------------------------------------------");

        // Entradas
        System.out.println("Digite um número: ");
        int numEscolhido = sc.nextInt();

        // Variáveis utilizadas
        Random random = new Random();
        int randomFacil = random.nextInt(11);
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
