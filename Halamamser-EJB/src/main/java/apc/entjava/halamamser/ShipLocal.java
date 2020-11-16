package apc.entjava.halamamser;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ShipLocal {

    public List<ShipItem> getItems_Ship();

    public void addItem_Ship(ShipItem item);

}
