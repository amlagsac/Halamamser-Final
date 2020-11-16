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
        this.cartLocal.addItem(new CartItem(this.item.getName(), this.item.getPrice(), this.item.getCategory()));
        this.cartLocal.getItem_Cart().stream().forEach((item) -> {
            System.out.println(item.toString());
        });
        return "homepage?faces-redirect=true";
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

