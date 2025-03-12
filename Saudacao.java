import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        // Criando um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Exibindo uma saudação personalizada
        System.out.println("Olá, " + nome + "! Bem-vindo ao curso de GITHUB da Digital One Inovation");

        // Fechando o Scanner
        scanner.close();
    }
}
