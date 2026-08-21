package http.ch07;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    private int number;
    private String menuName;
    private int price;

    public Menu (String menuName, int price){
        this.menuName = menuName;
        this.price = price;
    }

}
