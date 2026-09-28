package op_test.ch05;

public class Main {
    public static void main(String[] args) {

        ItemService itemService = new ItemService();
        itemService.obtainItem("aa", "1등급");
        itemService.obtainItem("bb", "2등급");
        itemService.obtainItem("cc", "3등급");

        itemService.printInventory();
    }
}
