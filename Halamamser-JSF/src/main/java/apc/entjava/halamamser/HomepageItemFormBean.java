package apc.entjava.halamamser;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import apc.entjava.halamamser.HomepageItem;

@SessionScoped
@Named
public class HomepageItemFormBean implements Serializable {

    @EJB
    private HomepageLocal homepageLocal;

    private HomepageItem item = new HomepageItem();


//    private List<HomepageItem>items = new ArrayList<>();

    public HomepageItemFormBean() {
    }

    public String addItem() {
        int id = (this.homepageLocal.getItems().size() + 1);
        this.homepageLocal.addItem_Cart(new HomepageItem(this.item.getName(), this.item.getPrice(), this.item.getCategory()));
        this.homepageLocal.getItems().stream().forEach((item) -> {
            System.out.println(item.toString());
        });
        return "../homepage.xhtml?faces-redirect=true";
    }

    public String redirect() {
        return "admin/adminPage.xhtml?faces-redirect=true";
    }

    public HomepageItem getItem() {
        return item;
    }

    public void setItem(HomepageItem item) {
        this.item = item;
    }

    public List<HomepageItem> getItems() {
        return this.homepageLocal.getItems();
    }

//    public void setItems(List<HomepageItem> items) {
//        this.items = items;
//    }
}
