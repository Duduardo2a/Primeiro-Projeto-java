public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pensa assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado para assistir!");
        } else {
            System.out.println("Deve pagar a locação!");
        }
    }
}
