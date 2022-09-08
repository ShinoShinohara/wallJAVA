package Supplies;

public class Muro {
    private double altura;
    private double largura;
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double largura, double altura) {
        this.area = largura*altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    public Muro() {
    }
    public Muro(double largura, double altura, double area) {
        this.largura = largura;
        this.altura = altura;
        this.area = largura*altura;
    }
}
