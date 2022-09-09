import Supplies.Muro;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        try (Scanner scan = new Scanner(System.in)) {

            double largura;
            double altura;

            double valorPedreiro;
            double valorServente;
            double valorTijolo;
            double valorArgamassa;

//            MURO
            System.out.print("Digite a largura: ");
            largura = scan.nextDouble();
            System.out.print("Digite a Altura: ");
            altura = scan.nextDouble();

//            CUSTOS
            System.out.print("Digite valor pedreiro: ");
            valorPedreiro = scan.nextDouble();
            System.out.print("Digite valor servente: ");
            valorServente = scan.nextDouble();
            System.out.print("Digite valor tijolos: ");
            valorTijolo = scan.nextDouble();
            System.out.print("Digite valor argamassa: ");
            valorArgamassa = scan.nextDouble();

            Muro muro = new Muro(largura, altura, largura * altura, valorPedreiro, valorServente, valorTijolo, valorArgamassa);
//            ALVENARIA
            System.out.println(muro.CalcularAlvenaria());
//            EMBOCO
            System.out.println(muro.CalcularEmboco());
        }
    }
}
