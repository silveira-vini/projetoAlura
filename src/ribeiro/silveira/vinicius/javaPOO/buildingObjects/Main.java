package ribeiro.silveira.vinicius.javaPOO.buildingObjects;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Notebook", 3);
        Product p2 = new Product("Eraser", 8);
        Product p3 = new Product("Pencil", 9);
        Product p4 = new Product("Pen", 3);
        Product p5 = new Product("Glue", 4);
        ProdutoPerecivel p6 = new ProdutoPerecivel("Pão", 10, "20/09/2024");

        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);

        products.forEach(a -> System.out.println(a.toString()));

    }


}
