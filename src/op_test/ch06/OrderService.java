package op_test.ch06;

import java.util.List;

public class OrderService {

    // 1. 직접 생성하지 않고 선언만 함
    private OrderDao dao;

    public OrderService(OrderDao dao) {
        this.dao = dao;
    }

    public void takeOrder(String menuName, int price) {
        Order order = new Order(menuName, price);
        dao.insert(order);
    }

    public void printAllOrders() {
        List<Order> orders = dao.findAll();
        System.out.println("--- 전체 주문 목록 ---");
        for (Order order : orders) {
            System.out.println("메뉴: " + order.getMenuName() + " | 가격: " + order.getPrice() + "원");
        }
    }
}
