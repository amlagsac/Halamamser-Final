package apc.entjava.halamamser;

//Initialization of imports
import javax.persistence.*;

//Declaration for JPA and Table Name
@Entity
@Table(name="products")
public class HomepageItem {

    //Creating of Column id with auto increment
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long itemId;

    //Creating of Column name in table products
    @Column(name="name")
    private String name;

    //Creating of Column category in table products
    @Column(name="category")
    private String category;

    //Creating of Column price in table products
    @Column(name="price")
    private int price;

    public HomepageItem() {
    }

    //Creating of function HomepageItem with name, category, and price parameter
    public HomepageItem(String name, int price, String category) {
        super();
        this.name = name;
        this.category = category;
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

    //Getter for category
    public String getCategory() {
        return category;
    }

    //Setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    //Getter for price
    public int getPrice() {
        return price;
    }

    //Setter for price
    public void setPrice(int price) {
        this.price = price;
    }

    //Function that outputs the values in itemId, name, category, and price
    public String toString() {
        return "HomepageItem [itemId=" + this.itemId + ", name=" + this.name + ", price=" + this.price + ", category=" + this.category
        + "]";

    }

}
