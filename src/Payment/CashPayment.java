package Payment;

public class CashPayment implements PaymentMethod {
    private String cash;

    public CashPayment(String cash) {
        this.cash = cash;
    }
    @Override
    public void pay(double amount, String customerName) {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + amount + ". Thanh toán tiền mặt thành công.");
    }
}