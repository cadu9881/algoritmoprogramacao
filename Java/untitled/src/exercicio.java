import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c,f;

        System.out.println("Digite temperatura em celcius ");
        c = scanner.nextDouble( );


        f = (9*c+160)/5;
        System.out.println("°c ocnvertidos  em Fahrenheit são:" +f);
        System.out.println();
    }
}
