package apc.entjava.halamamser;

import javax.persistence.*;

@Entity
@Table(name="products")
public class HomepageItem {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long itemId;

    @Column(name="name")
    private String name;

    @Column(name="category")
    private String category;

    @Column(name="price")
    private int price;

    public HomepageItem() {
    }

    public HomepageItem(String name, int price, String category) {
        super();
        this.name = name;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "HomepageItem [itemId=" + this.itemId + ", name=" + this.name + ", price=" + this.price + ", category=" + this.category
        + "]";

    }

}
