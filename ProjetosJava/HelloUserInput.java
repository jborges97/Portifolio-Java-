import java.util.Scanner; // Import the Scanner class to read input

public class HelloUserInput {
    public static void main(String[] args) throws Exception {
        
    Scanner scanner = new Scanner(System.in); // Create a Scanner object

    System.out.print("Diga seu nome: "); // Prompt the user for their name

    String nome = scanner.nextLine(); // Read user input

    System.out.println("Olá, " + nome + "!"); // Output user input

    scanner.close(); // Close the scanner to prevent resource leaks
    }
}    