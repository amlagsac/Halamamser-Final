package apc.entjava.halamamser;

//Initialization of Imports
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import apc.entjava.halamamser.HomepageItem;

//Declaration of @SessionScoped and @Named
@SessionScoped
@Named
public class HomepageItemFormBean implements Serializable {

    //Calling of HomepageLocal class
    @EJB
    private HomepageLocal homepageLocal;

    //Initialization of the HomepageItem class
    private HomepageItem item = new HomepageItem();


//    private List<HomepageItem>items = new ArrayList<>();

    public HomepageItemFormBean() {
    }

    //Function for adding Homepage Items with the return of the homepage webpage
    public String addItem() {
        int id = (this.homepageLocal.getItems().size() + 1);
        this.homepageLocal.addItem_Cart(new HomepageItem(this.item.getName(), this.item.getPrice(), this.item.getCategory()));
        this.homepageLocal.getItems().stream().forEach((item) -> {
            System.out.println(item.toString());
        });
        return "homepage.xhtml?faces-redirect=true";
    }

    //Getter for HomepageItem class
    public HomepageItem getItem() {
        return item;
    }

    //Setter for HomepageItem class
    public void setItem(HomepageItem item) {
        this.item = item;
    }

    //Getter for the List of the HomepageItem class
    public List<HomepageItem> getItems() {
        return this.homepageLocal.getItems();
    }

}
