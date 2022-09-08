import java.util.Scanner;
import Supplies.Muro;

public class Main {
    public static void main(String[] arg) {
        Muro muro = new Muro();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite a largura: ");
            muro.setLargura(scan.nextDouble());
            System.out.print("Digite a Altura: ");
            muro.setAltura(scan.nextDouble());
            muro.setArea(muro.getLargura(), muro.getAltura());
            System.out.println("Area: " + muro.getArea());
//            System.out.print("Digite valor pedreiro: ");
//            double pedreiro = scan.nextDouble();
//            System.out.print("Digite valor servente: ");
//            double servente = scan.nextDouble();
//            System.out.print("Digite valor tijolos: ");
//            double tijolos = scan.nextDouble();
//            System.out.print("Digite valor argamassa: ");
//            double argamassa = scan.nextDouble();
//            double alvenaria = CalcularAlvenaria(area, pedreiro, servente, tijolos, argamassa);
//            System.out.println("Alvenaria: " + alvenaria);
//            double emboco = CalcularEmboco(area, pedreiro, servente, argamassa);
//            System.out.println("Emboco: " + emboco);
//            double custo = CalcularCusto(alvenaria, emboco);
//            System.out.println("Custo: " + custo);
//            System.out.print("Digite margem de lucro: ");
//            double margem = scan.nextDouble();
//            double lucro = CalcularLucro(margem, custo);
//            System.out.println("Lucro: " + lucro);
        }
    }

//    static double CalcularAlvenaria(double area, double pedreiro, double servente, double tijolos, double argamassa) {
//        return area * (pedreiro * 0.8 + servente * 0.8 + tijolos * 21 + argamassa * 10);
//    }
//
//    private static double CalcularEmboco(double area, double pedreiro, double servente, double argamassa) {
//        return 2 * area * (pedreiro * 0.5 + servente * 0.5 + argamassa * 40.0);
//    }
//
//    private static double CalcularCusto(double alvenaria, double emboco) {
//        return alvenaria + emboco;
//    }
//
//    private static double CalcularLucro(double margem, double custo) {
//        return custo + custo * margem / 100;
//    }
}
