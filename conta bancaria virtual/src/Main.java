import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Main = new Scanner(System.in);
        Cliente bank = new Cliente();

        bank.clienteInformacoes();

        int opcaoEscolhida;

        do{
            System.out.println("""
                Operações

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair

                Digite a opção desejada:""");

            opcaoEscolhida = Main.nextInt();


            if(opcaoEscolhida == 1){
                double saldoInicial = bank.getSaldoInicial();
                System.out.println("Saldo atual: " + saldoInicial);
                System.out.println("""

                        ---//---""");

            }else if(opcaoEscolhida == 2){
                System.out.println("Informe o valor: ");
                double recebendoValor = Main.nextDouble();

                bank.setReceberPix(recebendoValor);

                double valorRecebido = bank.receberPix();
                System.out.println("Saldo total: " + valorRecebido);
                System.out.println("""

                        ---//---""");

            }else if(opcaoEscolhida == 3){
                System.out.println("Informe um valor: ");
                double transferindoValor = Main.nextDouble();

                if(transferindoValor > bank.getSaldoInicial()){
                    System.out.println("Valor maior do que possui em conta!");
                }else{
                    bank.setEnviarPix(transferindoValor);
                    double transferenciaConcluida = bank.enviarPix();
                    System.out.println("Saldo total: " + transferenciaConcluida);
                    System.out.println("""

                        ---//---""");
                }

            }

        }while (opcaoEscolhida != 4);

        System.out.println("Até mais!");
    }
}