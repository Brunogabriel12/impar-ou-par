import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Seu número " + numero + " é par.");
        } else {
            System.out.println("Seu número " + numero + " é ímpar.");
        }
        scanner.close();
    }
}