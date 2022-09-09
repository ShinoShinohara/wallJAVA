package Supplies;

public class Alvenaria extends Muro {
    private final double pedreiro = 0.8;
    private final double servente = 0.8;
    private final double tijolos = 21;
    private final double argamassa = 10;

    public Alvenaria(double largura, double altura, double area, double valorPedreiro, double valorServente, double valorTijolo, double valorArgamassa) {
        super(largura, altura, area, valorPedreiro, valorServente, valorTijolo, valorArgamassa);
    }

    public Alvenaria() {
        super();
    }

    public double getPedreiro() {
        return pedreiro;
    }

    public double getServente() {
        return servente;
    }

    public double getTijolos() {
        return tijolos;
    }

    public double getArgamassa() {
        return argamassa;
    }

    public double CalcularValor() {
        double p = pedreiro * getValorPedreiro();
        double s = servente * getValorServente();
        double t = tijolos * getValorTijolo();
        double a = argamassa * getValorArgamassa();
        return (p + s + t + a) * getArea();
    }
}
