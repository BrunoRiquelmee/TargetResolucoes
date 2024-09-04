public class Questao1 {
    public static void main(String[] args) {

        int Indice = 13, Soma = 0, K = 0;

        while ( K < Indice ){
            K = K + 1;
            Soma += K;
        }
        System.out.println("Soma = " + Soma);
    }
}