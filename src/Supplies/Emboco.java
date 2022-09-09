package Supplies;

public class Emboco extends Muro {
    private final double pedreiro = 0.5;
    private final double servente = 0.5;
    private final double argamassa = 40;

    public Emboco(double largura, double altura, double area, double valorPedreiro, double valorServente, double valorTijolo, double valorArgamassa) {
        super(largura, altura, area, valorPedreiro, valorServente, valorTijolo, valorArgamassa);
    }

    public Emboco() {
        super();
    }

    public double getPedreiro() {
        return pedreiro;
    }

    public double getServente() {
        return servente;
    }

    public double getArgamassa() {
        return argamassa;
    }

    public double CalcularValor() {
        double p = pedreiro * getValorPedreiro();
        double s = servente * getValorServente();
        double a = argamassa * getValorArgamassa();
        return (p + s + a) * getArea();
    }
}
