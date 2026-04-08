import java.util.Scanner;

public class inversãodeValores {
    public static void main(String[] args) {
        String A, B, temp;
        Scanner lerDados = new Scanner(System.in);
        System.out.println("Digite o primeiro dado: ");
        A = lerDados.nextLine();
        System.out.println("Digite o segundo dado: ");
        B = lerDados.nextLine();
        temp = A;
        A = B;
        B = temp;

        System.out.println("apos a inverção o primeiro dado passou a ser: " + A + ",e o segundo: " + B );



    }
}
