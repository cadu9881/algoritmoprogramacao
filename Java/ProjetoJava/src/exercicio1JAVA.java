import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio1JAVA {

            public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);

                System.out.println("Qual a distancia percorrida? ");

                double km = teclado.nextDouble();

                System.out.println("Qual o total de combustivel gasto? ");

                double combustivel = teclado.nextDouble();

                double consumoMedio = km / combustivel;

                System.out.println("Consumo medio percorrido pelo autmovel: " + consumoMedio + "km / l");

    }
}