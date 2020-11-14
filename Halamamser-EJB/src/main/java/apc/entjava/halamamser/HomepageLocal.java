package apc.entjava.halamamser;

import javax.ejb.Local;
import java.util.List;

@Local
public interface HomepageLocal {

    public List<HomepageItem> getItems();

    public void addItem(HomepageItem item);
}
