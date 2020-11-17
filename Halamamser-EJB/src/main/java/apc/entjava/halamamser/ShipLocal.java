package apc.entjava.halamamser;

//Initialization of Imports
import javax.ejb.Local;
import java.util.List;

@Local
public interface ShipLocal {

    //Function of Getting the List in ShipItem
    public List<ShipItem> getItem_Ship();

    //Function for addItem in Homepage
    public void addItem(ShipItem item);

}
