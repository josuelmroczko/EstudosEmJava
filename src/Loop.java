import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("diga sua avaliaçao sobre o filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; // mediaAvaliacao + mediaAvaliacao + nota;


        }

        System.out.println("Media avaliaçao " + mediaAvaliacao/3);

    }
}
