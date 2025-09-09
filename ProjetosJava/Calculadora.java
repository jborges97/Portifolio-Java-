import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário
import java.text.DecimalFormat; // Importa a classe DecimalFormat

public class Calculadora {
    public static void main(String[] args) {
        // Declaração da variável 'resultado' antes de usá-la no switch
        double resultado = 0;
        
        // Formata o resultado para ter no máximo duas casas decimais
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner

        System.out.print("Digite a expressão (ex: 1+1, 2.5*4): "); // Pede a expressão completa
        String expressao = scanner.nextLine(); // Lê a linha completa

        char operador = ' '; // Variável para armazenar o operador
        String[] partes = null; // Array para armazenar as partes da expressão

        // Encontra o operador e divide a string em duas partes (os números)
        if (expressao.contains("+")) {
            operador = '+';
            partes = expressao.split("\\+");
        } else if (expressao.contains("-")) {
            operador = '-';
            partes = expressao.split("-");
        } else if (expressao.contains("*")) {
            operador = '*';
            partes = expressao.split("\\*");
        } else if (expressao.contains("/")) {
            operador = '/';
            partes = expressao.split("/");
        } else {
            System.out.println("Erro: Operador inválido.");
            scanner.close();
            return; // Termina o programa se o operador for inválido
        }

        // Converte as partes da string para números (double)
        double num1 = Double.parseDouble(partes[0].trim());
        double num2 = Double.parseDouble(partes[1].trim());

        // Usa a estrutura 'switch' para decidir qual operação realizar
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    scanner.close();
                    return; // Termina o programa em caso de divisão por zero
                }
                resultado = num1 / num2;
                break;
        }

        // Usa o formatador para exibir o resultado, seja ele inteiro ou decimal
        System.out.println("Resultado: " + decimalFormat.format(resultado));

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
