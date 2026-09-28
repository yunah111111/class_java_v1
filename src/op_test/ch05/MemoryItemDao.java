package op_test.ch05;

import java.util.ArrayList;
import java.util.List;

public class MemoryItemDao implements ItemDao{
    private ArrayList<Item> inventory = new ArrayList<>();

    public void insert(Item item) {
        inventory.add(item); // 이해하기
        System.out.println("[" + item.getName() + "] 아이템을 인벤토리에 넣었습니다.");
    }

    public List<Item> findAll() {
        return inventory;
    }
}
