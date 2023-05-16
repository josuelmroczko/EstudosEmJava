import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito ? ");
        String filme = leitura.nextLine();

        System.out.println("Quero saber o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("diga sua avaliaçao sobre o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println("o filme  " +  filme  + "Foi lançado em "+ anoDeLancamento);
        System.out.println("avaliaçao " + avaliacao);



    }
}
