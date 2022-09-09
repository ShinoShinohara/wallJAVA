import Supplies.Muro;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        try (Scanner scan = new Scanner(System.in)) {

            double comprimento;
            double altura;

            double valorPedreiro;
            double valorServente;
            double valorTijolo;
            double valorArgamassa;

            double total;

//            MURO
            System.out.print("Digite o comprimento em metros: ");
            comprimento = scan.nextDouble();
            System.out.print("Digite a altura em metros: ");
            altura = scan.nextDouble();

//            CUSTOS
            System.out.print("\nDigite o preço do pedreiro: R$ ");
            valorPedreiro = scan.nextDouble();
            System.out.print("Digite o preço do servente: R$ ");
            valorServente = scan.nextDouble();
            System.out.print("Digite o preço dos tijolos: R$ ");
            valorTijolo = scan.nextDouble();
            System.out.print("Digite o preço da argamassa: R$ ");
            valorArgamassa = scan.nextDouble();

            Muro muro = new Muro(Math.ceil((comprimento * altura) * 100) / 100, valorPedreiro, valorServente, valorTijolo, valorArgamassa);
//
            System.out.println("\n*Para executar 1 m² de MURO são necessários 1 m² de ALVENARIA e 2 m² de EMBOCO massa única*\n");

//            TOTAL
            total = muro.CalcularTotal();
            System.out.println("Total: R$ " + String.format("%.2f", total) + "\n");

//            LUCRO
            System.out.print("Digite o lucro desejado em porcentagem: ");
            System.out.println("Total a cobrar: R$ " + String.format("%.2f", muro.CalcularLucro(total, scan.nextDouble())));
        }
    }
}
