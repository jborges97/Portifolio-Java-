
import java.util.Random;
import java.util.Scanner;

    public class JokenPo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] opcoes = {"Pedra", "Papel", "Tesoura"};

            System.out.println("Bem-vindo ao Jokenpô!");
            System.out.println("Escolha uma opção: ");
            System.out.println("0 - Pedra");
            System.out.println("1 - Papel");
            System.out.println("2 - Tesoura");

            int escolhaUsuario = scanner.nextInt();

            if (escolhaUsuario < 0 || escolhaUsuario > 2) {
                System.out.println("Opção inválida! Por favor, escolha 0, 1 ou 2.");
                return;
            }

            int escolhaComputador = random.nextInt(3);
            
            System.out.println("Você escolheu: " + opcoes[escolhaUsuario]);
            System.out.println("O computador escolheu: " + opcoes[escolhaComputador]);

            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario == 0 && escolhaComputador == 2) ||
                       (escolhaUsuario == 1 && escolhaComputador == 0) ||
                       (escolhaUsuario == 2 && escolhaComputador == 1) 
            ) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("O computador venceu!");
            }
            scanner.close();
        }
    }