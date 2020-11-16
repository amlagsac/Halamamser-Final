package apc.entjava.halamamser;

import javax.persistence.*;

@Entity
@Table(name="cart")
public class CartItem {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long itemId;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private int price;

    public CartItem() {
    }

    public CartItem(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        if(name.equals("Calathea Peacock") || name.equals("Golden Pothos") || name.equals("Robust Snake Plant") ||
        name.equals("Clay Vase") || name.equals("Groot Pot") || name.equals("White Glass Pot") ){
            return 200;
        }
        else if(name.equals("Chinese Money Plant")) {
            return 150;
        }
        else if(name.equals("Lucky Bamboo")) {
            return 300;
        }
        else if(name.equals("Philodendron Lime Lemon")) {
            return 250;
        }
        else if(name.equals("Syngonium")) {
            return 100;
        }
        else {
            return 400;
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "HomepageItem [itemId=" + this.itemId + ", name=" + this.name + ", price=" + this.price + "]";
    }
}
