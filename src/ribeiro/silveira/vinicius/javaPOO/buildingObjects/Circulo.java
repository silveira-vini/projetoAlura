package ribeiro.silveira.vinicius.javaPOO.buildingObjects;

public class Circulo implements Forma{

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
