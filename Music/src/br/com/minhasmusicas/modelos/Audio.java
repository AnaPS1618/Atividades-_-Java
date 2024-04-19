package br.com.minhasmusicas.modelos;

public class Audio {

    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public void curte(){
        this.curtidas++;
    }

    public void reproduz() {

        this.totalDeReproducoes++;
    }

    public String getTitulo(){

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }
}
