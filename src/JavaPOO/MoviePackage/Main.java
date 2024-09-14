package JavaPOO.MoviePackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Vinicius", 37));
        personList.add(new Person("Fabiana", 32));
        personList.add(new Person("Príncipe", 9));

        System.out.println(personList);

    }

}
