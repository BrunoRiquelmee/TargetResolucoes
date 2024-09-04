import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = input.nextInt();
        input.close();

        int a = 0, b = 1;
        boolean pertence = false;

        System.out.print("Sequência de Fibonacci: " + a);

        while (a <= numero) {
            if (a == numero) {
                pertence = true;
            }

            int proximo = a + b;
            System.out.print(", " + b);
            a = b;
            b = proximo;
        }

        if (pertence) {
            System.out.println("\nO número " + numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " não pertence a sequência de Fibonacci.");
        }
    }
}
