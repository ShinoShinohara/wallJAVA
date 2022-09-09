import Supplies.Alvenaria;
import Supplies.Emboco;
import Supplies.Muro;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        try (Scanner scan = new Scanner(System.in)) {

            double altura;
            double largura;

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

            Muro muroA = new Alvenaria(largura, altura, largura * altura, valorPedreiro, valorServente, valorTijolo, valorArgamassa);
            Muro muroE = new Emboco(largura, altura, largura * altura, valorPedreiro, valorServente, valorTijolo, valorArgamassa);
            System.out.print("AREA A ");
            System.out.println(muroA.getArea());
            System.out.print("AREA E ");
            System.out.println(muroE.getArea());
//            ALVENARIA
            System.out.println(muroA.CalcularValor());
//            EMBOCO
            System.out.println(muroE.CalcularValor());
        }
    }
}
