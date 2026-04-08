//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criar scanner para ler entrada do teclado
        Scanner teclado = new Scanner(System.in);

        // Consumo medio
        System.out.println("Qual a distancia percorrida? ");

        double km = teclado.nextDouble();

        // o orograma vai esperar voce digitar

        System.out.println("Qual o total de combustivel gasto? ");

        double combustivel = teclado.nextDouble();
        //Entrada de dados



        //calculo
        double consumoMedio = combustivel / km;



        }
}