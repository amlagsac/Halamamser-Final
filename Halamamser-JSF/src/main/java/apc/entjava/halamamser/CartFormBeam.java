package apc.entjava.halamamser;

//Initialization of Imports
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

//Declaration of @SessionScoped and @Named
@SessionScoped
@Named
public class CartFormBeam implements Serializable {

    //Calling of CartLocal class
    @EJB
    private CartLocal cartLocal;

    //Initialization of the CartItem class
    private CartItem item = new CartItem();

    public CartFormBeam() {
    }

    //Function for adding Cart Items with the return of the homepage webpage
    public String addCartItem() {
        int id = (this.cartLocal.getItem_Cart().size() + 1);
        this.cartLocal.addItem(new CartItem(this.item.getName(), this.item.getPrice()));
        this.cartLocal.getItem_Cart().stream().forEach((item) -> {
            System.out.println(item.toString());
        });
        return "homepage?faces-redirect=true";
    }

    //Function to concatenate the cart items into one string
    public String getString() {

        String string = "";

        for (CartItem cartItem : getItems_Cart()) {
            string += (cartItem.getName()) + ", ";
        }
        return string;
    }

    //Function to get the total price of products in the cart
    public Float getTotal() {

        Float total = 0f;

        // Sum up the quantities
        for (CartItem cartItem : getItems_Cart()) {
            total += (cartItem.getPrice());
        }
        return total;
    }

    //Function to get the total amount with shipping fee
    public Float getTotal2() {
        Float total2 = getTotal() + 50;
        return total2;
    }

    //Getters for the CartItem class
    public CartItem getItem() {
        return item;
    }

    //Setter for the CartItem class
    public void setItem(CartItem item) {
        this.item = item;
    }

    //Getter for the List for CartItem
    public List<CartItem> getItems_Cart() {
        return this.cartLocal.getItem_Cart();
    }
}

