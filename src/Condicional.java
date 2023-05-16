public class Condicional {
    public static void main(String[] args) {
        int ano = 1990;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if (ano > 2022){
            System.out.println("Lançamentos que estao curtindo");
        } else {
            System.out.println("filme retro");
        }

        if (incluidoNoPlano == true  && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else {
            System.out.println("Deve pagar");
        }
    }
}
