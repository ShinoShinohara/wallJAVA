package Supplies;

public record Muro(double area, double valorPedreiro, double valorServente, double valorTijolo, double valorArgamassa) {

    public double CalcularAlvenaria() {
        double pedreiro = 0.8;
        double p = pedreiro * valorPedreiro();
        double servente = 0.8;
        double s = servente * valorServente();
        double tijolos = 21;
        double t = tijolos * valorTijolo();
        double argamassa = 10;
        double a = argamassa * valorArgamassa();
        return (p + s + t + a) * area();
    }

    public double CalcularEmboco() {
        double pedreiro = 0.5;
        double p = pedreiro * valorPedreiro();
        double servente = 0.5;
        double s = servente * valorServente();
        double argamassa = 40;
        double a = argamassa * valorArgamassa();
        return (p + s + a) * area();
    }
}
