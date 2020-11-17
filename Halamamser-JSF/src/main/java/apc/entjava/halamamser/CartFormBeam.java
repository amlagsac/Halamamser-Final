package apc.entjava.halamamser;


import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class CartFormBeam implements Serializable {

    @EJB
    private CartLocal cartLocal;

    private CartItem item = new CartItem();

    public CartFormBeam() {
    }

    public String addCartItem() {
        int id = (this.cartLocal.getItem_Cart().size() + 1);
        this.cartLocal.addItem(new CartItem(this.item.getName(), this.item.getPrice()));
        this.cartLocal.getItem_Cart().stream().forEach((item) -> {
            System.out.println(item.toString());
        });
        return "homepage?faces-redirect=true";
    }

    public String getString() {

        String string = "";

        for (CartItem cartItem : getItems_Cart()) {
            string += (cartItem.getName()) + ", ";
        }
        return string;
    }

    public Float getTotal() {

        Float total = 0f;

        // Sum up the quantities
        for (CartItem cartItem : getItems_Cart()) {
            total += (cartItem.getPrice());
        }
        return total;
    }

    public Float getTotal2() {
        Float total2 = getTotal() + 50;
        return total2;
    }

    public CartItem getItem() {
        return item;
    }

    public void setItem(CartItem item) {
        this.item = item;
    }

    public List<CartItem> getItems_Cart() {
        return this.cartLocal.getItem_Cart();
    }
}

