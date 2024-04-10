import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Main = new Scanner(System.in);
        Cliente bank = new Cliente();

        bank.setNome("Jacqueline Oliveira");
        bank.setTipoConta("Corrente");
        bank.setSaldoInicial(2500);

        double saldoInicial = bank.getSaldoInicial();

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
                System.out.println("Saldo atual: " + saldoInicial);
                System.out.println("""
                        
                        ---//---""");
            }else if(opcaoEscolhida == 2){
                System.out.println("Informe o valor: ");
                double recebendoValor = Main.nextDouble();

                System.out.println("Saldo total: " + (saldoInicial += recebendoValor));
                System.out.println("""
                        
                        ---//---""");
            }else if(opcaoEscolhida == 3){
                System.out.println("Informe o valor para transferência: ");
                double valorParaTranferencia = Main.nextDouble();

                if(valorParaTranferencia > saldoInicial){
                    System.out.println("Valor maior do que possui em conta!");
                }else{

                    System.out.println("Valor trasferido: " + valorParaTranferencia);
                    System.out.println("Saldo após transferência: " + (saldoInicial -= valorParaTranferencia));
                    System.out.println("""
                        
                        ---//---""");
                }

            }

            System.out.println("Até a próxima!");

        }while (opcaoEscolhida != 4);
    }
}