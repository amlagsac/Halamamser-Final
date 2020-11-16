package apc.entjava.halamamser;

import javax.ejb.Local;
import java.util.Collection;
import java.util.List;

@Local
public interface CartLocal {

    public List<CartItem> getItem_Cart();

    public void addItem(CartItem item);

}
