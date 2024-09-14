package JavaPOO.MoviePackage;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + " Age: :" + this.age;
    }
}
