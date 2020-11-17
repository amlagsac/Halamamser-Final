package apc.entjava.halamamser;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ShipLocal {

    public List<ShipItem> getItem_Ship();

    public void addItem(ShipItem item);

}
