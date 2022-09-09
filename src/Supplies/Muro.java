package Supplies;

public class Muro {
    private double largura;
    private double altura;
    private double area;
    private double valorPedreiro;
    private double valorServente;
    private double valorTijolo;
    private double valorArgamassa;

    public Muro(double largura, double altura, double area, double valorPedreiro, double valorServente, double valorTijolo, double valorArgamassa) {
        this.largura = largura;
        this.altura = altura;
        this.area = area;
        this.valorPedreiro = valorPedreiro;
        this.valorServente = valorServente;
        this.valorTijolo = valorTijolo;
        this.valorArgamassa = valorArgamassa;
    }

    public Muro() {
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorPedreiro() {
        return valorPedreiro;
    }

    public void setValorPedreiro(double valorPedreiro) {
        this.valorPedreiro = valorPedreiro;
    }

    public double getValorServente() {
        return valorServente;
    }

    public void setValorServente(double valorServente) {
        this.valorServente = valorServente;
    }

    public double getValorTijolo() {
        return valorTijolo;
    }

    public void setValorTijolo(double valorTijolo) {
        this.valorTijolo = valorTijolo;
    }

    public double getValorArgamassa() {
        return valorArgamassa;
    }

    public void setValorArgamassa(double valorArgamassa) {
        this.valorArgamassa = valorArgamassa;
    }

    public double CalcularAlvenaria() {
        double pedreiro = 0.8;
        double p = pedreiro * getValorPedreiro();
        double servente = 0.8;
        double s = servente * getValorServente();
        double tijolos = 21;
        double t = tijolos * getValorTijolo();
        double argamassa = 10;
        double a = argamassa * getValorArgamassa();
        return (p + s + t + a) * getArea();
    }

    public double CalcularEmboco() {
        double pedreiro = 0.5;
        double p = pedreiro * getValorPedreiro();
        double servente = 0.5;
        double s = servente * getValorServente();
        double argamassa = 40;
        double a = argamassa * getValorArgamassa();
        return (p + s + a) * getArea();
    }
}
