import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a string que deseja inverter: ");
        String original = input.nextLine();
        input.close();

        char[] caracteres = original.toCharArray();
        int n = caracteres.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[n - 1 - i];
            caracteres[n - 1 - i] = temp;
        }

        String invertida = new String(caracteres);

        System.out.println("String invertida: " + invertida);
    }
}
