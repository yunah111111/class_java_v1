package op_test.ch06;

public class Main {

    public static void main(String[] args) {
        OrderDao orderDao = new OrderDao();
        OrderService service = new OrderService(orderDao);

        service.takeOrder("아메리카노", 4500);
        service.takeOrder("카페라떼", 5000);
        service.takeOrder("바닐라라떼", 5500);

        service.printAllOrders();
    }
}
