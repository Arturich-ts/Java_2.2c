public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 12, 9.99);
        System.out.println(payment);
        double payment2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println(payment2);
        double payment3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println(payment3);
    }
}
