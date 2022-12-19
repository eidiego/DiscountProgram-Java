import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DiscountInstallments {
    public static void main(String[] args) {

        // Date formater for an easy read
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Scanner to obtain user inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Por favor insira os dados da sua compra, seguindo as instruções abaixo!");
        System.out.println("##############################");
        System.out.print("Digite o valor total da compra: ");
        double totalValue = sc.nextDouble();
        System.out.print("Digite a quantidade de parcelas: ");
        int installments = sc.nextInt();
        System.out.println("------------------------------");
        double discount = 0;
        String discountInfo = " ";

        sc.close();

    }
}
