package ribeiro.silveira.vinicius.javaPOO.sharedBehaviour.main;

import ribeiro.silveira.vinicius.javaPOO.sharedBehaviour.models.MinhasPreferidas;
import ribeiro.silveira.vinicius.javaPOO.sharedBehaviour.models.Musica;
import ribeiro.silveira.vinicius.javaPOO.sharedBehaviour.models.Podcast;

public class Main {

    public static void main(String[] args) {

        Musica m1 = new Musica();
        m1.setAlbum("Album doidão");
        m1.setCantor("Raul seixas");
        m1.setGenero("Rock");
        m1.setTitulo("Barata voadora");

        Podcast p1 = new Podcast();
        p1.setConvidado("Castanhari");
        p1.setEntrevistador("Vilela");
        p1.setTitulo("Passagens da bíblia");

        for (int i = 0; i < 1000; i++) {
            m1.reproduzir();
        }
        for (int i = 0; i < 500; i++) {
            m1.curtir();
        }

        for (int i = 0; i < 5000; i++) {
            p1.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            p1.curtir();
        }

        MinhasPreferidas lista1 = new MinhasPreferidas();
        lista1.incluir(m1);
        lista1.incluir(p1);





    }

}
