package Payment;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumbe;

    public CreditCardPayment(String cardNumbe) {
        this.cardNumbe = cardNumbe;
    }

    @Override
    public void pay(double amount, String customerName) {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + amount + ". Thanh toán bằng thẻ tín dụng thành công.");
    }
}
