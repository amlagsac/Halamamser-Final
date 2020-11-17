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


    public ShipFormBean() {
    }

    public String addItem_Ship() {
        int id = (this.shipLocal.getItem_Ship().size() + 1);
        this.shipLocal.addItem(new ShipItem(
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
                this.item.getContactNum(),
                this.item.getEmail()
        ));
        this.shipLocal.getItem_Ship().stream().forEach((item) -> {
            System.out.println(item.toString());
        });
        return "homepage.xhtml?faces-redirect=true";
    }

    public ShipItem getItem() {
        return item;
    }

    public void setItem(ShipItem item) {
        this.item = item;
    }

    public List<ShipItem> getItems_Ship() {
        return this.shipLocal.getItem_Ship();
    }

//    public void setItems(List<HomepageItem> items) {
//        this.items = items;
//    }

}
