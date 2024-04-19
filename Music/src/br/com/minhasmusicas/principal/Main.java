package br.com.minhasmusicas.principal;

import br.com.minhasmusicas.modelos.Audio;
import br.com.minhasmusicas.modelos.MinhasPreferidas;
import br.com.minhasmusicas.modelos.Musicas;
import br.com.minhasmusicas.modelos.Podcasts;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Musicas minhaMusica = new Musicas();

        minhaMusica.setTitulo("No me compares");
        minhaMusica.setArtista("Ivete sangalo");


        //INCREMENTAR REPRODUÇÕES::..
        for(int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        //INCREMENTAR CURTIDAS::..
        for(int i = 0; i < 50; i++){
            minhaMusica.curte();
        }

        Podcasts meuPodcast = new Podcasts();

        meuPodcast.setTitulo("NerdCast - #01");
        meuPodcast.setApresentador("Jovem Nerd");

        //REPRODUÇÃO DE CURTIDAS::..
        for(int i = 0; i < 5000; i++){
            meuPodcast.reproduz();
        }

        for(int i = 0; i < 1000; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}