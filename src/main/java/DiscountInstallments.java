import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class DiscountInstallments {
    public static void main(String[] args) {

        // Date formater for an easy read
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Scanner to obtain user inputs
        Scanner sc = new Scanner(System.in);

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
                switch (installments) {
                    case 1:
                        discount = totalAmount * 10 / 100;
                        discountInfo = "O valor do desconto é de 10%";
                        break;
                    case 2:
                        discount = totalAmount * 8 / 100;
                        discountInfo = "O valor do desconto é de 8%";
                        break;
                    case 3:
                        discount = totalAmount * 6 / 100;
                        discountInfo = "O valor do desconto é de 6%";
                        break;
                    case 4:
                        discount = totalAmount * 4 / 100;
                        discountInfo = "O valor do desconto é de 4%";
                        break;
                    case 5:
                        discount = totalAmount * 2 / 100;
                        discountInfo = "O valor do desconto é de 2%";
                        break;
                    default:
                        if (installments >= 6) {
                            discount = totalAmount * 0 / 100;
                            discountInfo = "O valor do desconto é de 0%";
                        }
                }
                double totalAmountWithDiscount = totalAmount - discount;

                System.out.print("O valor total com o desconto aplicado é: ");
                System.out.println("R$" + totalAmountWithDiscount);
                System.out.println(discountInfo);
                System.out.print("O valor das parcelas será: ");

                // Formater to show a amount without unnecessary numbers after comma
                DecimalFormat formato = new DecimalFormat("#.##");
                System.out.println("R$" + formato.format(totalAmountWithDiscount / installments));

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
