import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class DiscountInstallments {
    public static void main(String[] args) {

        // Scanner to obtain user inputs
        Scanner sc = new Scanner(System.in);

        // Try/Catch logic to catch exceptions on the inputs
        try {
            System.out.println("Olá! Por favor insira os dados da sua compra, seguindo as instruções abaixo!");
            System.out.println("##############################");
            System.out.print("Digite o valor total da compra: ");
            double totalAmount = sc.nextDouble();
            System.out.print("Digite a quantidade de parcelas: ");
            int installments = sc.nextInt();
            System.out.println("------------------------------");
            double discount = 0;
            String discountInfo = " ";

            // Defensive programming to prevent negative unwanted values
            if (installments > 0 && totalAmount > 0) {
                // Conditional logic to define how much discount will be applied.
                if (installments > 0 && installments < 6) {
                    discount = totalAmount * installments / 100;
                    System.out.println("O valor do desconto é de: " + installments + "%");
                } else if (installments >= 6 ) {
                    System.out.println("Não existe descontos para essa quantia de parcelamentos.");
                }

                double totalAmountWithDiscount = totalAmount - discount;

                System.out.print("O valor final da compra é: ");
                System.out.println("R$" + totalAmountWithDiscount);

                // Formater to show a amount without unnecessary numbers after comma
                DecimalFormat formato = new DecimalFormat("#.##");
                System.out.println("R$" + formato.format(totalAmountWithDiscount / installments));

                // For structure to show the due date for the next months
                System.out.println("As datas de vencimento das parcelas serão: ");
                for (int month = 1; month <= installments; month++) {
                    LocalDate dueDate = LocalDate.now().plusMonths(month);
                    System.out.println("# " + dueDate + " #");
                }

                System.out.println("### Obrigado pela compra! ###");

            } else
                System.out.println("Você precisa informar valores acima de ZERO!");

        } catch (Exception e) {
        System.out.println("Erro nos valores digitados, favor informar os valores conforme solicitado!");
    }

        sc.close();

    }
}
