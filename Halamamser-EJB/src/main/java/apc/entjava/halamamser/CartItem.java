package apc.entjava.halamamser;

//Initialization of imports
import javax.persistence.*;

//Declaration for JPA and Table Name
@Entity
@Table(name="cart")
public class CartItem {

    //Creating of Column id with auto increment
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long itemId;

    //Creating of Column name in table cart
    @Column(name="name")
    private String name;

    //Creating of Column price in table cart
    @Column(name="price")
    private int price;

    public CartItem() {
    }

    //Creating of function CartItem with name and price parameter
    public CartItem(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }

    //Getter for itemId
    public Long getItemId() {
        return itemId;
    }

    //Setter for itemId
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    //Getter for name
    public String getName() {
        return name;
    }

    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for price
    public int getPrice() {
        //Condition of returning the price of 200
        if(name.equals("Calathea Peacock") || name.equals("Golden Pothos") || name.equals("Robust Snake Plant") ||
        name.equals("Clay Vase") || name.equals("Groot Pot") || name.equals("White Glass Pot") ){
            return 200;
        }
        //Condition of returning the price of 150
        else if(name.equals("Chinese Money Plant")) {
            return 150;
        }
        //Condition of returning the price of 300
        else if(name.equals("Lucky Bamboo")) {
            return 300;
        }
        //Condition of returning the price of 250
        else if(name.equals("Philodendron Lime Lemon")) {
            return 250;
        }
        //Condition of returning the price of 100
        else if(name.equals("Syngonium")) {
            return 100;
        }
        //Condition of returning the price of 400
        else {
            return 400;
        }
    }

    //Setter for Price
    public void setPrice(int price) {
        this.price = price;
    }

    //Function that outputs the values in itemId, name, and price
    public String toString() {
        return "CartItem [itemId=" + this.itemId + ", name=" + this.name + ", price=" + this.price + "]";
    }
}
