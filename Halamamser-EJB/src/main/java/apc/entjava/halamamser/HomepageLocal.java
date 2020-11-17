package apc.entjava.halamamser;

//Initialization of Imports
import javax.ejb.Local;
import java.util.List;

@Local
public interface HomepageLocal {

    //Function of Getting the List in HomepageItem
    public List<HomepageItem> getItems();

    //Function for addItem in Homepage
    public void addItem_Cart(HomepageItem item);
}
