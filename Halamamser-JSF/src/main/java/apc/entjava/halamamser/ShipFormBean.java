package apc.entjava.halamamser;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import apc.entjava.halamamser.ShipItem;

@SessionScoped
@Named

public class ShipFormBean implements Serializable {

    @EJB
    private ShipLocal shipLocal;

    private ShipItem item = new ShipItem();


//    private List<HomepageItem>items = new ArrayList<>();

    public ShipFormBean() {
    }

    public String addItem() {
        int id = (this.shipLocal.getItems().size() + 1);
        this.shipLocal.addItem_Ship(new ShipItem(
                this.item.getFirstName(),
                this.item.getMiddleName(),
                this.item.getLastName(),
                this.item.getHouseNum(),
                this.item.getHouseStreet(),
                this.item.getBarangay(),
                this.item.getCity(),
                this.item.getCountry(),
                this.item.getZipCode(),
                this.item.getDob(),
                this.item.getEmail(),
                this.item.getContactNum()
        ));
        this.shipLocal.getItems().stream().forEach((item) -> {
            System.out.println(item.toString());
        });
        return "../ship.xhtml?faces-redirect=true";
    }

    public ShipItem getItem() {
        return item;
    }

    public void setItem(ShipItem item) {
        this.item = item;
    }

    public List<ShipItem> getItems() {
        return this.shipLocal.getItems();
    }

//    public void setItems(List<HomepageItem> items) {
//        this.items = items;
//    }

}
