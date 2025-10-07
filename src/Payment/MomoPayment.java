package Payment;

public class MomoPayment implements PaymentMethod {
    private String momo;

    public MomoPayment(String momo) {
        this.momo = momo;
    }

    @Override
    public void pay(double amount, String customerName) {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + amount + ". Thanh toán qua ví Momo thành công.");
    }
}