public class Cliente {

    private String nome;
    private String tipoConta;
    private double saldoInicial;

    private double enviarPix;
    private double receberPix;

    public void clienteInformacoes(){
        nome = "Jaqueline";
        tipoConta = "Corrente";
        saldoInicial = 2500.00;
    }

    public double getSaldoInicial() {

        return saldoInicial;
    }

    public double receberPix() {

         return saldoInicial += receberPix;
    }

    public void setReceberPix(double receberPix) {

        this.receberPix = receberPix;
    }

    public double enviarPix() {

        return saldoInicial -= enviarPix;
    }

    public void setEnviarPix(double enviarPix) {

        this.enviarPix = enviarPix;
    }




}
