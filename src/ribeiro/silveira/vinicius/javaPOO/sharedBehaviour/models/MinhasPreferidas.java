package ribeiro.silveira.vinicius.javaPOO.sharedBehaviour.models;

public class MinhasPreferidas {

    public void incluir(Audio a) {
        if (a.getClassificacao() >= 9) {
            System.out.println(a.getTitulo() + " é um sucesso absoluto");
        } else {
            System.out.println(a.getTitulo() + " é bom, assista depois");
        }
    }


}
