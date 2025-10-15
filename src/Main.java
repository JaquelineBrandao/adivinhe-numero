import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        System.out.println("🎯 Bem-vindo ao jogo Adivinhe o Número!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("🔼 O número é maior.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("🔽 O número é menor.");
            } else {
                System.out.println("✅ Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}
