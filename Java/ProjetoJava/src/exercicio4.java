import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio4 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento apos um mês. Considere
        // fixoojuroda poupança em 0,70% a.m.


        Scanner scanner = new Scanner(System.in);
        double valorDepositado, valorFinal;
        System.out.println("Digite o valor a ser depositado: ");

        valorFinal = valorDepositado = 0 * 1.007;

        System.out.println("Valor com rendimento após 1 mês: "+ valorFinal);

        scanner.close();




    }
}