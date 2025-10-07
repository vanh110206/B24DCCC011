import model.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Tạo sản phẩm
        Product laptop = new ElectronicProduct("E01", "Laptop Dell", 20000000, "IMEI98765");
        Product milk = new FoodProduct("F01", "Sữa TH True Milk", 30000, LocalDate.of(2025, 12, 31));
        Product condition_air = new ElectronicProduct("E02", "Máy điều hòa Toshiba" , 30000000,"IMEI9323");

        // Hiển thị
        laptop.displayInfor();
        milk.displayInfor();
        condition_air.displayInfor();

        // Đơn hàng 1 - thanh toán tiền mặt
        Order order1 = new Order("Nguyễn Văn A", new CashPayment("4442-4242-8386"));
        order1.addProduct(laptop);
        order1.addProduct(milk);
        order1.checkout();

        // Đơn hàng 2 - thanh toán bằng thẻ
        Order order2 = new Order("Nguyễn Văn B", new CreditCardPayment("1234-5678-9999"));
        order2.addProduct(laptop);
        order2.addProduct(condition_air);
        order2.checkout();

        // Đơn hàng 3 - thanh toán qua momo
        Order order3 = new Order("Nguyễn Văn C", new MomoPayment("momo_abc123"));
        order3.addProduct(milk);
        order3.checkout();
    }
}
