public class Questao4 {
    public static void main(String[] args) {

        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double outros = 19849.53;

        double total = SP + RJ + MG + ES + outros;

        double percentualSP = (SP / total) * 100;
        double percentualRJ = (RJ / total) * 100;
        double percentualMG = (MG / total) * 100;
        double percentualES = (ES / total) * 100;
        double percentualOutros = (outros / total) * 100;

        System.out.printf("Percentual de SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de Outros: %.2f%%\n", percentualOutros);
    }
}
