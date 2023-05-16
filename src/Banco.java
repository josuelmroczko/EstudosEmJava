import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        String nome = "josuel mroczko";
        String tipoConta = "corrente";
        double saldo = 15599.99;
        int opcao = 0;


        System.out.println("*********");
        System.out.println("\nnome do cliente " + nome);
        System.out.println("Tipo da conta " + tipoConta);
        System.out.println("\nSaldo atual " + saldo);
        System.out.println("*********");

        String menu = """
                ***digite sua opçao***
                1-consultar saldo
                2-trasferir valor 
                3-receber valor 
                4-Sair
                 """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();


        if (opcao == 1) {
            System.out.println("o saldo atualizado é " + saldo);
        } else if (opcao == 2) {
            System.out.println("qual o valor de trasferencia ?");
            double valor = leitura.nextDouble();
            if (valor > saldo) {
                System.out.println("Nao há saldo para realizar a transferencioa");
            } else {
                saldo -= valor;
                System.out.println("seu saldo atual agora é " + saldo);
            }
        } else if (opcao == 3) {
            System.out.println("Valor recebido");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("novo valor " + valor);
        }else if (opcao != 4 ){
            System.out.println("opçao invalida");
        }
    }
  }
}

