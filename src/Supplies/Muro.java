package Supplies;

//ele não guarda os valores de largura e altura
//getter, setter e construtor vazio foram tirados por não serem usados na execução deste codigo
public record Muro(double area, double valorPedreiro, double valorServente, double valorTijolo, double valorArgamassa) {

    public double RoundUp(double x) {
        x = Math.ceil(x * 100);
        return x / 100;
    }

    public double CalcularAlvenaria() {
        System.out.println("Preço para 1 m² de Alvenaria: ");
        double pedreiro = 0.80;
        double p = RoundUp(pedreiro * valorPedreiro());
        System.out.println("Custo com Pedreiros: R$ " + String.format("%.2f", p));
        double servente = 0.80;
        double s = RoundUp(servente * valorServente());
        System.out.println("Custo com Serventes: R$ " + String.format("%.2f", s));
        double tijolos = 21.00;
        double t = RoundUp(tijolos * valorTijolo());
        System.out.println("Custo com Tijolos: R$ " + String.format("%.2f", t));
        double argamassa = 10.00;
        double a = RoundUp(argamassa * valorArgamassa());
        System.out.println("Custo com Argamassa: R$ " + String.format("%.2f", a));
        System.out.println("Custo total Alvenaria: R$ " + String.format("%.2f", RoundUp((p + s + t + a) * area())) + "\n");
        return RoundUp((p + s + t + a) * area());
    }

    public double CalcularEmboco() {
        System.out.println("Preço para 2 m² de Emboco: ");
        double pedreiro = 0.50;
        double p = RoundUp(pedreiro * valorPedreiro());
        System.out.println("Custo com Pedreiros: R$ " + String.format("%.2f", p * 2));
        double servente = 0.50;
        double s = RoundUp(servente * valorServente());
        System.out.println("Custo com Serventes: R$ " + String.format("%.2f", s * 2));
        double argamassa = 40.00;
        double a = RoundUp(argamassa * valorArgamassa());
        System.out.println("Custo com Argamassa: R$ " + String.format("%.2f", a * 2));
        System.out.println("Custo total Emboco: R$ " + String.format("%.2f", RoundUp(2 * (p + s + a) * area())) + "\n");
        return RoundUp(2 * (p + s + a) * area());
    }

    public double CalcularLucro(double valorAlvenaria, double valorEmboco, double porcentagem) {
        double total = valorAlvenaria + valorEmboco;
        System.out.println("\nLucro desejado: R$ " + String.format("%.2f", RoundUp(total * (porcentagem / 100.00))));
        return RoundUp(total + total * (porcentagem / 100.00));
    }
}
