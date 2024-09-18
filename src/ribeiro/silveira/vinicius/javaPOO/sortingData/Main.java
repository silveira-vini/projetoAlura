package ribeiro.silveira.vinicius.javaPOO.sortingData;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Exercício 1 --------------------------
        List<Integer> nums = new ArrayList<>();
        nums.add(135);
        nums.add(38);
        nums.add(3587);
        nums.add(1314);
        nums.add(5);

        Collections.sort(nums);
        System.out.println(nums);


        // Exercício 2 e 3 --------------------------

        Titulo t1 = new Titulo("Carcará");
        Titulo t2 = new Titulo("Pardal");
        Titulo t3 = new Titulo("Sabiá");
        Titulo t4 = new Titulo("Pombo");
        Titulo t5 = new Titulo("Bemtivi");

        List<Titulo> titulos = new ArrayList<>();

        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);
        titulos.add(t4);
        titulos.add(t5);

        System.out.println(titulos.toString());

        titulos.sort(Comparator.comparing(Titulo::getNome));
        System.out.println(titulos);


        // Exercício 2 e 3 --------------------------

        List<Integer> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();

        listaPolimorfica.add(2);
        listaPolimorfica.add(4);
        listaPolimorfica.add(9);
        System.out.println(listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add(4);
        listaPolimorfica.add(6);
        listaPolimorfica.add(3);
        System.out.println(listaPolimorfica);



    }


}
