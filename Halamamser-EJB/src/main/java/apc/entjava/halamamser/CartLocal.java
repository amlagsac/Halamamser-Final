package apc.entjava.halamamser;

//Initialization of Imports
import javax.ejb.Local;
import java.util.List;

@Local
public interface CartLocal {

    //Function of Getting the List in Cart
    public List<CartItem> getItem_Cart();

    //Function for addItem in Cart
    public void addItem(CartItem item);

}
