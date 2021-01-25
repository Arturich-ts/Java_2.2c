public class CreditPaymentService {
    public double calculate(double creditAmount, double periodForMonths, double creditPercent) {
        double creditPercentForMonth = creditPercent/100/12;
        double payment;

        payment = creditAmount * (creditPercentForMonth +
                (creditPercentForMonth /
                        (Math.pow((1 + creditPercentForMonth), periodForMonths) - 1
                        )
                )
        );

        return payment;
    }
}
