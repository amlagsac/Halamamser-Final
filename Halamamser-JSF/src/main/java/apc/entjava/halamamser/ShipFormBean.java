package apc.entjava.halamamser;

//Initialization of Imports
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import apc.entjava.halamamser.ShipItem;

//Declaration of @SessionScoped and @Named
@SessionScoped
@Named
public class ShipFormBean implements Serializable {

    //Calling of ShipLocal class
    @EJB
    private ShipLocal shipLocal;

    //Initialization of the ShipItem class
    private ShipItem item = new ShipItem();


    public ShipFormBean() {
    }

    //Function for adding User Details with the return of the thankyou webpage
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
        return "thankYou.xhtml?faces-redirect=true";
    }

    //Getters of the ShipItem class
    public ShipItem getItem() {
        return item;
    }

    //Setters of the ShipItem class
    public void setItem(ShipItem item) {
        this.item = item;
    }

    //Getters of the List of the ShipItem class
    public List<ShipItem> getItems_Ship() {
        return this.shipLocal.getItem_Ship();
    }


}
