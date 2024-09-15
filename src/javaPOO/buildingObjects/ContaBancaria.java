package javaPOO.buildingObjects;

public class ContaBancaria {

    int numeroConta;
    double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }


    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

}
