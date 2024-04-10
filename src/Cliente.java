public class Cliente {

    private String nome;
    private String tipoConta;
    private double saldoInicial;

    private double enviarPix;
    private double receberPix;

    public Cliente(String nome, String tipoConta, double saldoInicial){
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public double ReceberPix() {

         return saldoInicial += receberPix;

    }

    public void setReceberPix(double receberPix) {
        this.receberPix = receberPix;
    }

    public double EnviarPix() {

        return saldoInicial -= enviarPix;
    }

    public void setEnviarPix(double enviarPix) {
        this.enviarPix = enviarPix;
    }




}
