package Supplies;

//ele não guarda os valores de largura e altura
//getter, setter e construtor vazio foram tirados por não serem usados na execução deste codigo
public record Muro(double area, double valorPedreiro, double valorServente, double valorTijolo, double valorArgamassa) {

    public double RoundUp(double x) {
        x = Math.ceil(x * 100);
        return x / 100;
    }

    public double CustoPedreiro() {
        double pedreiroA = 0.80;
        double pedreiroE = 0.50;
        System.out.println("    - Pedreiro em horas: " + RoundUp((pedreiroA + (2 * pedreiroE)) * area()));
        return RoundUp((pedreiroA + (2 * pedreiroE)) * area() * valorPedreiro());
    }

    public double CustoServente() {
        double serventeA = 0.80;
        double serventeE = 0.50;
        System.out.println("    - Servente em horas: " + RoundUp((serventeA + (2 * serventeE)) * area()));
        return RoundUp((serventeA + (2 * serventeE)) * area() * valorServente());
    }

    public double CustoTijolo() {
        double tijolosA = 21.00;
        System.out.println("    - Unidades de tijolos: " + RoundUp((tijolosA) * area()));
        return RoundUp((tijolosA) * area() * valorTijolo());
    }

    public double CustoArgamassa() {
        double argamassaA = 10.00;
        double argamassaE = 40.00;
        System.out.println("    - Litros de argamassa: " + RoundUp((argamassaA + (2 * argamassaE)) * area()) + "\n");
        return RoundUp((argamassaA + (2 * argamassaE)) * area() * valorArgamassa());
    }

    public double CalcularTotal() {

        double p = CustoPedreiro();
        double s = CustoServente();
        double t = CustoTijolo();
        double a = CustoArgamassa();
        double total = p + s + t + a;

        System.out.println("    - Custo com Pedreiros: R$ " + String.format("%.2f", p));
        System.out.println("    - Custo com Serventes: R$ " + String.format("%.2f", s));
        System.out.println("    - Custo com Tijolos: R$ " + String.format("%.2f", t));
        System.out.println("    - Custo com Argamassa: R$ " + String.format("%.2f", a) + "\n");

        return total;
    }

    public double CalcularLucro(double total, double porcentagem) {
        System.out.println("\nLucro desejado: R$ " + String.format("%.2f", RoundUp(total * (porcentagem / 100.00))));
        return RoundUp(total + total * (porcentagem / 100.00));
    }
}
